using Entities.Contracts;
using Entities.Models;
using Grpc.Core;
using GRPCService.ProtoImpl.Util;


namespace GRPCService.ProtoImpl;

public class PostProtoImpl : Post.PostBase {
    private IPostService _postService;

    public PostProtoImpl(IPostService postService) {
        _postService = postService;
    }

    public override async Task<ListOfPostObj> GetAllPosts(RequestModel request, ServerCallContext context) {
        try {
            int current = request.Current;
            var addPost = await _postService.GetAllPost(current);
            return ConvertGRPC.ConvertListPostToObj(addPost);
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unavailable, e.Message));

        }
    }

    public override async Task<PostObj> AddPost(TransferPostWithSubcategoryId request, ServerCallContext context) {
        try {
            PostObj postObj = request.PostObj;
            IdWithInteger idWith = request.IdWithInteger;

            Entities.Models.Post post = ConvertGRPC.ConvertPostObjToPost(postObj);
            int subCategoryId = idWith.Id;

            Console.Write(post.Title);
            DateTime dateTime = new DateTime();

            var addPost = await _postService.AddPost(subCategoryId, post);
            return ConvertGRPC.ConvertPostToPostObj(addPost);
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unavailable, e.Message));

        }
    }

    public override async Task<ListOfPostObj> SearchPosts(StringAndInteger request, ServerCallContext context) {
        try {
            String titleToSearch = request.String;
            int current = request.Current;
            List<Entities.Models.Post> searchedPosts = await _postService.SearchPosts(titleToSearch, current);
            ListOfPostObj listOfPostObj = new ListOfPostObj() {
                List = {ConvertGRPC.GetRepeatedFieldOfPostFromListOfPosts(searchedPosts)}
            };
            return listOfPostObj;
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unavailable, e.Message));

        }
    }

    public override async Task<PostObj> GetPostDetails(IdWithInteger Id, ServerCallContext context) {
        try {
            var post = await _postService.GetPostDetails(Id.Id);
            return ConvertGRPC.ConvertPostToPostObjWithComments(post);
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unavailable, e.Message));

        }
    }


    public override async Task<ListOfPostObj> GetPostsBySubcategoryId(SubIdWithCurrent request,
        ServerCallContext context) {
        try {
            int current = request.Current;
            int subcategoryId = request.Id;


            List<Entities.Models.Post> postFromServer = await _postService.GetPostsBySubcategoryId(subcategoryId, current);
            ListOfPostObj obj = new ListOfPostObj() {
                List = {ConvertGRPC.GetRepeatedFieldOfPostFromListOfPosts(postFromServer)}
            };
            return obj;
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unavailable, e.Message));

        }
    }

    public override async Task<IdWithInteger> GetTotalNumberOfPosts(OnlyString request, ServerCallContext context) {
        try {
            int totalNumberOfPosts = await _postService.GetTotalNumberOfPosts(request.StringToTransfer);
            return new IdWithInteger() {
                Id = totalNumberOfPosts
            };
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unavailable, e.Message));

        }
    }

    public override async Task<ListOfPostObj> GetAllPostsByUsername(OnlyString request, ServerCallContext context) {
        try {
            var postsByUsername = await _postService.GetAllPostsByUsername(request.StringToTransfer);
            return new ListOfPostObj() {
                List = {ConvertGRPC.GetRepeatedFieldOfPostFromListOfPosts(postsByUsername)}
            };
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unavailable, e.Message));
        }
    }
}