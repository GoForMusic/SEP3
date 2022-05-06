﻿using Entities.Contracts;
using Entities.Models;
using Grpc.Core;
using GRPCService.ProtoImpl.Util;


namespace GRPCService.ProtoImpl;

public class PostProtoImpl : Post.PostBase {
    private IPostService _postService;

    public PostProtoImpl(IPostService postService) {
        _postService = postService;
    }


    public async override Task<PostObj> AddPost(TransferPostWithSubcategoryId request, ServerCallContext context) {
        PostObj postObj = request.PostObj;
        IdWithInteger idWith = request.IdWithInteger;

        Entities.Models.Post post = ConvertGRPC.ConvertPostObjToPost(postObj);
        int subCategoryId = idWith.Id;

        var addPost = await _postService.AddPost(subCategoryId, post);
        return ConvertGRPC.ConvertPostToPostObj(addPost);
    }
}