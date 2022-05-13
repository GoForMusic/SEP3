// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: post.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace GRPCService {
  public static partial class Post
  {
    static readonly string __ServiceName = "post.Post";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.TransferPostWithSubcategoryId> __Marshaller_post_TransferPostWithSubcategoryId = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.TransferPostWithSubcategoryId.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.PostObj> __Marshaller_post_PostObj = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.PostObj.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.StringAndInteger> __Marshaller_post_StringAndInteger = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.StringAndInteger.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.ListOfPostObj> __Marshaller_post_ListOfPostObj = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.ListOfPostObj.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.RequestModel> __Marshaller_post_RequestModel = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.RequestModel.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.IdWithInteger> __Marshaller_post_IdWithInteger = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.IdWithInteger.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.SubIdWithCurrent> __Marshaller_post_SubIdWithCurrent = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.SubIdWithCurrent.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.TransferPostWithSubcategoryId, global::GRPCService.PostObj> __Method_AddPost = new grpc::Method<global::GRPCService.TransferPostWithSubcategoryId, global::GRPCService.PostObj>(
        grpc::MethodType.Unary,
        __ServiceName,
        "AddPost",
        __Marshaller_post_TransferPostWithSubcategoryId,
        __Marshaller_post_PostObj);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.StringAndInteger, global::GRPCService.ListOfPostObj> __Method_SearchPosts = new grpc::Method<global::GRPCService.StringAndInteger, global::GRPCService.ListOfPostObj>(
        grpc::MethodType.Unary,
        __ServiceName,
        "SearchPosts",
        __Marshaller_post_StringAndInteger,
        __Marshaller_post_ListOfPostObj);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.RequestModel, global::GRPCService.ListOfPostObj> __Method_GetAllPosts = new grpc::Method<global::GRPCService.RequestModel, global::GRPCService.ListOfPostObj>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetAllPosts",
        __Marshaller_post_RequestModel,
        __Marshaller_post_ListOfPostObj);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.IdWithInteger, global::GRPCService.PostObj> __Method_GetPostDetails = new grpc::Method<global::GRPCService.IdWithInteger, global::GRPCService.PostObj>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetPostDetails",
        __Marshaller_post_IdWithInteger,
        __Marshaller_post_PostObj);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.SubIdWithCurrent, global::GRPCService.ListOfPostObj> __Method_GetPostsBySubcategoryId = new grpc::Method<global::GRPCService.SubIdWithCurrent, global::GRPCService.ListOfPostObj>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetPostsBySubcategoryId",
        __Marshaller_post_SubIdWithCurrent,
        __Marshaller_post_ListOfPostObj);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::GRPCService.PostReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of Post</summary>
    [grpc::BindServiceMethod(typeof(Post), "BindService")]
    public abstract partial class PostBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.PostObj> AddPost(global::GRPCService.TransferPostWithSubcategoryId request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.ListOfPostObj> SearchPosts(global::GRPCService.StringAndInteger request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.ListOfPostObj> GetAllPosts(global::GRPCService.RequestModel request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.PostObj> GetPostDetails(global::GRPCService.IdWithInteger request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.ListOfPostObj> GetPostsBySubcategoryId(global::GRPCService.SubIdWithCurrent request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(PostBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_AddPost, serviceImpl.AddPost)
          .AddMethod(__Method_SearchPosts, serviceImpl.SearchPosts)
          .AddMethod(__Method_GetAllPosts, serviceImpl.GetAllPosts)
          .AddMethod(__Method_GetPostDetails, serviceImpl.GetPostDetails)
          .AddMethod(__Method_GetPostsBySubcategoryId, serviceImpl.GetPostsBySubcategoryId).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, PostBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_AddPost, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.TransferPostWithSubcategoryId, global::GRPCService.PostObj>(serviceImpl.AddPost));
      serviceBinder.AddMethod(__Method_SearchPosts, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.StringAndInteger, global::GRPCService.ListOfPostObj>(serviceImpl.SearchPosts));
      serviceBinder.AddMethod(__Method_GetAllPosts, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.RequestModel, global::GRPCService.ListOfPostObj>(serviceImpl.GetAllPosts));
      serviceBinder.AddMethod(__Method_GetPostDetails, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.IdWithInteger, global::GRPCService.PostObj>(serviceImpl.GetPostDetails));
      serviceBinder.AddMethod(__Method_GetPostsBySubcategoryId, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.SubIdWithCurrent, global::GRPCService.ListOfPostObj>(serviceImpl.GetPostsBySubcategoryId));
    }

  }
}
#endregion
