package group6.semester.project.grpcClient.post;

import GRPCService.CategoryGrpc;
import GRPCService.CategoryOuterClass;
import GRPCService.PostGrpc;
import GRPCService.PostOuterClass;
import group6.semester.project.grpcClient.ConvertGrpc;
import group6.semester.project.grpcClient.ManagedChannelGetter;
import group6.semester.project.model.Category;
import group6.semester.project.model.Post;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static group6.semester.project.grpcClient.ConvertGrpc.getPostFromGrpcPost;

@Service
public class PostGRPCClientImpl implements PostClient {

    private PostGrpc.PostBlockingStub postBlockingStub;
    private CategoryGrpc.CategoryBlockingStub categoryBlockingStub;

    /**
     * > If the postBlockingStub is null, create a new ManagedChannel and use it to create a new postBlockingStub
     *
     * @return A blocking stub for the Post service.
     */
    private PostGrpc.PostBlockingStub getPostBlockingStub() {
        if (postBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelGetter.getManagedChannel();
            postBlockingStub = PostGrpc.newBlockingStub(managedChannel);
        }
        return postBlockingStub;
    }

    private CategoryGrpc.CategoryBlockingStub getCategoryBlockingStub() {
        if (categoryBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelGetter.getManagedChannel();
            categoryBlockingStub = CategoryGrpc.newBlockingStub(managedChannel);
        }
        return categoryBlockingStub;
    }

    @Override
    public Post addPost(Post post, int subCategoryId) {
        PostOuterClass.PostObj postObj = ConvertGrpc.getGrpcPostFromOurPost(post);
        PostOuterClass.IdWithInteger id = PostOuterClass.IdWithInteger.newBuilder().setId(subCategoryId).build();

        PostOuterClass.TransferPostWithSubcategoryId transferPostWithSubcategoryId = PostOuterClass.TransferPostWithSubcategoryId.newBuilder().setPostObj(postObj).setIdWithInteger(id).build();
        PostOuterClass.PostObj postObj1 = null;
        try {
            System.out.println("At the add post");
            postObj1 = getPostBlockingStub().addPost(transferPostWithSubcategoryId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return getPostFromGrpcPost(postObj1);
    }

    @Override
    public List<Category> getAllCategories() {
        CategoryOuterClass.ListOfCategoryObj listOfCategoryObj = null;
        try {
            listOfCategoryObj = getCategoryBlockingStub().getAllCategories(CategoryOuterClass.Empty.newBuilder().build());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List<CategoryOuterClass.CategoryObj> allCategoriesList = listOfCategoryObj.getAllCategoriesList();
        List<Category> categories = ConvertGrpc.getListOfCategoryFromCategory(allCategoriesList);
        return categories;
    }


    @Override
    public List<Post> searchPosts(String title, int current) {
        PostOuterClass.StringAndInteger titleToSendWithCurrent = PostOuterClass.StringAndInteger.newBuilder().setString(title).setCurrent(current).build();
        PostOuterClass.ListOfPostObj list = getPostBlockingStub().searchPosts(titleToSendWithCurrent);
        List<Post> postList = null;
        try {
            postList = ConvertGrpc.getListOfPostFromListOfGrpcPostObjects(list.getListList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return postList;
    }

    @Override
    public Post getPostDetails(int Id) {
        try{
            PostOuterClass.IdWithInteger obj = PostOuterClass.IdWithInteger.newBuilder().setId(Id).build();
            PostOuterClass.PostObj postObj = getPostBlockingStub().getPostDetails(obj);
            Post post = ConvertGrpc.getPostFromGrpcPost(postObj);
            System.out.println(post.getWriter().getUsername());
            return post;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Post> getAllPosts(int current) {
        PostOuterClass.RequestModel requestModal = PostOuterClass.RequestModel.newBuilder().setCurrent(current).build();
        PostOuterClass.ListOfPostObj list = getPostBlockingStub().getAllPosts(requestModal);
        List<Post> postList = null;
        try {
            postList = ConvertGrpc.getListOfPostFromListOfGrpcPostObjects(list.getListList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return postList;
    }

    @Override
    public List<Post> getPostBySubcategoryId(int subCategoryIdSelected, int current) {
        PostOuterClass.SubIdWithCurrent subIdWithCurrent = PostOuterClass.SubIdWithCurrent.newBuilder().setCurrent(current).setId(subCategoryIdSelected).build();
        PostOuterClass.ListOfPostObj postsBySubcategoryId = getPostBlockingStub().getPostsBySubcategoryId(subIdWithCurrent);
        List<Post> posts = ConvertGrpc.getListOfPostFromListOfGrpcPostObjects(postsBySubcategoryId.getListList());
        return posts;


    }

    @Override
    public int getNumberOfPosts(String username) {
        PostOuterClass.OnlyString usernameToSend = PostOuterClass.OnlyString.newBuilder().setStringToTransfer(username).build();
        PostOuterClass.IdWithInteger totalNumberOfPosts = getPostBlockingStub().getTotalNumberOfPosts(usernameToSend);
        return totalNumberOfPosts.getId();
    }

    @Override
    public List<Post> getAllPostsByUsername(String username) {
        PostOuterClass.OnlyString usernametoSend = PostOuterClass.OnlyString.newBuilder().setStringToTransfer(username).build();
        PostOuterClass.ListOfPostObj allPostsByUsername = getPostBlockingStub().getAllPostsByUsername(usernametoSend);
        List<PostOuterClass.PostObj> listOfPostObj = allPostsByUsername.getListList();
        return ConvertGrpc.getListOfPostFromListOfGrpcPostObjects(listOfPostObj);
    }

    @Override public void removePostById(int postId)
    {
        PostOuterClass.PostId postId1 = PostOuterClass.PostId.newBuilder().setPostId(postId).build();
        getPostBlockingStub().removePostById(postId1);
    }

    private void disposeStub() {
        postBlockingStub = null;
        categoryBlockingStub = null;
    }


}
