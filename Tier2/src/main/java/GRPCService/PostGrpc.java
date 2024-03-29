package GRPCService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: post.proto")
public final class PostGrpc {

  private PostGrpc() {}

  public static final String SERVICE_NAME = "post.Post";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.TransferPostWithSubcategoryId,
      GRPCService.PostOuterClass.PostObj> getAddPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPost",
      requestType = GRPCService.PostOuterClass.TransferPostWithSubcategoryId.class,
      responseType = GRPCService.PostOuterClass.PostObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.TransferPostWithSubcategoryId,
      GRPCService.PostOuterClass.PostObj> getAddPostMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.TransferPostWithSubcategoryId, GRPCService.PostOuterClass.PostObj> getAddPostMethod;
    if ((getAddPostMethod = PostGrpc.getAddPostMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getAddPostMethod = PostGrpc.getAddPostMethod) == null) {
          PostGrpc.getAddPostMethod = getAddPostMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.TransferPostWithSubcategoryId, GRPCService.PostOuterClass.PostObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "AddPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.TransferPostWithSubcategoryId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.PostObj.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("AddPost"))
                  .build();
          }
        }
     }
     return getAddPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.StringAndInteger,
      GRPCService.PostOuterClass.ListOfPostObj> getSearchPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchPosts",
      requestType = GRPCService.PostOuterClass.StringAndInteger.class,
      responseType = GRPCService.PostOuterClass.ListOfPostObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.StringAndInteger,
      GRPCService.PostOuterClass.ListOfPostObj> getSearchPostsMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.StringAndInteger, GRPCService.PostOuterClass.ListOfPostObj> getSearchPostsMethod;
    if ((getSearchPostsMethod = PostGrpc.getSearchPostsMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getSearchPostsMethod = PostGrpc.getSearchPostsMethod) == null) {
          PostGrpc.getSearchPostsMethod = getSearchPostsMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.StringAndInteger, GRPCService.PostOuterClass.ListOfPostObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "SearchPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.StringAndInteger.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.ListOfPostObj.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("SearchPosts"))
                  .build();
          }
        }
     }
     return getSearchPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.RequestModel,
      GRPCService.PostOuterClass.ListOfPostObj> getGetAllPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPosts",
      requestType = GRPCService.PostOuterClass.RequestModel.class,
      responseType = GRPCService.PostOuterClass.ListOfPostObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.RequestModel,
      GRPCService.PostOuterClass.ListOfPostObj> getGetAllPostsMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.RequestModel, GRPCService.PostOuterClass.ListOfPostObj> getGetAllPostsMethod;
    if ((getGetAllPostsMethod = PostGrpc.getGetAllPostsMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getGetAllPostsMethod = PostGrpc.getGetAllPostsMethod) == null) {
          PostGrpc.getGetAllPostsMethod = getGetAllPostsMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.RequestModel, GRPCService.PostOuterClass.ListOfPostObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "GetAllPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.RequestModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.ListOfPostObj.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("GetAllPosts"))
                  .build();
          }
        }
     }
     return getGetAllPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.IdWithInteger,
      GRPCService.PostOuterClass.PostObj> getGetPostDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostDetails",
      requestType = GRPCService.PostOuterClass.IdWithInteger.class,
      responseType = GRPCService.PostOuterClass.PostObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.IdWithInteger,
      GRPCService.PostOuterClass.PostObj> getGetPostDetailsMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.IdWithInteger, GRPCService.PostOuterClass.PostObj> getGetPostDetailsMethod;
    if ((getGetPostDetailsMethod = PostGrpc.getGetPostDetailsMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getGetPostDetailsMethod = PostGrpc.getGetPostDetailsMethod) == null) {
          PostGrpc.getGetPostDetailsMethod = getGetPostDetailsMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.IdWithInteger, GRPCService.PostOuterClass.PostObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "GetPostDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.IdWithInteger.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.PostObj.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("GetPostDetails"))
                  .build();
          }
        }
     }
     return getGetPostDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.SubIdWithCurrent,
      GRPCService.PostOuterClass.ListOfPostObj> getGetPostsBySubcategoryIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostsBySubcategoryId",
      requestType = GRPCService.PostOuterClass.SubIdWithCurrent.class,
      responseType = GRPCService.PostOuterClass.ListOfPostObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.SubIdWithCurrent,
      GRPCService.PostOuterClass.ListOfPostObj> getGetPostsBySubcategoryIdMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.SubIdWithCurrent, GRPCService.PostOuterClass.ListOfPostObj> getGetPostsBySubcategoryIdMethod;
    if ((getGetPostsBySubcategoryIdMethod = PostGrpc.getGetPostsBySubcategoryIdMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getGetPostsBySubcategoryIdMethod = PostGrpc.getGetPostsBySubcategoryIdMethod) == null) {
          PostGrpc.getGetPostsBySubcategoryIdMethod = getGetPostsBySubcategoryIdMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.SubIdWithCurrent, GRPCService.PostOuterClass.ListOfPostObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "GetPostsBySubcategoryId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.SubIdWithCurrent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.ListOfPostObj.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("GetPostsBySubcategoryId"))
                  .build();
          }
        }
     }
     return getGetPostsBySubcategoryIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.OnlyString,
      GRPCService.PostOuterClass.IdWithInteger> getGetTotalNumberOfPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalNumberOfPosts",
      requestType = GRPCService.PostOuterClass.OnlyString.class,
      responseType = GRPCService.PostOuterClass.IdWithInteger.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.OnlyString,
      GRPCService.PostOuterClass.IdWithInteger> getGetTotalNumberOfPostsMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.OnlyString, GRPCService.PostOuterClass.IdWithInteger> getGetTotalNumberOfPostsMethod;
    if ((getGetTotalNumberOfPostsMethod = PostGrpc.getGetTotalNumberOfPostsMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getGetTotalNumberOfPostsMethod = PostGrpc.getGetTotalNumberOfPostsMethod) == null) {
          PostGrpc.getGetTotalNumberOfPostsMethod = getGetTotalNumberOfPostsMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.OnlyString, GRPCService.PostOuterClass.IdWithInteger>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "GetTotalNumberOfPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.OnlyString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.IdWithInteger.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("GetTotalNumberOfPosts"))
                  .build();
          }
        }
     }
     return getGetTotalNumberOfPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.OnlyString,
      GRPCService.PostOuterClass.ListOfPostObj> getGetAllPostsByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPostsByUsername",
      requestType = GRPCService.PostOuterClass.OnlyString.class,
      responseType = GRPCService.PostOuterClass.ListOfPostObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.OnlyString,
      GRPCService.PostOuterClass.ListOfPostObj> getGetAllPostsByUsernameMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.OnlyString, GRPCService.PostOuterClass.ListOfPostObj> getGetAllPostsByUsernameMethod;
    if ((getGetAllPostsByUsernameMethod = PostGrpc.getGetAllPostsByUsernameMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getGetAllPostsByUsernameMethod = PostGrpc.getGetAllPostsByUsernameMethod) == null) {
          PostGrpc.getGetAllPostsByUsernameMethod = getGetAllPostsByUsernameMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.OnlyString, GRPCService.PostOuterClass.ListOfPostObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "GetAllPostsByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.OnlyString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.ListOfPostObj.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("GetAllPostsByUsername"))
                  .build();
          }
        }
     }
     return getGetAllPostsByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.PostOuterClass.PostId,
      GRPCService.PostOuterClass.Nothing> getRemovePostByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePostById",
      requestType = GRPCService.PostOuterClass.PostId.class,
      responseType = GRPCService.PostOuterClass.Nothing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.PostOuterClass.PostId,
      GRPCService.PostOuterClass.Nothing> getRemovePostByIdMethod() {
    io.grpc.MethodDescriptor<GRPCService.PostOuterClass.PostId, GRPCService.PostOuterClass.Nothing> getRemovePostByIdMethod;
    if ((getRemovePostByIdMethod = PostGrpc.getRemovePostByIdMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getRemovePostByIdMethod = PostGrpc.getRemovePostByIdMethod) == null) {
          PostGrpc.getRemovePostByIdMethod = getRemovePostByIdMethod = 
              io.grpc.MethodDescriptor.<GRPCService.PostOuterClass.PostId, GRPCService.PostOuterClass.Nothing>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "post.Post", "RemovePostById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.PostId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.PostOuterClass.Nothing.getDefaultInstance()))
                  .setSchemaDescriptor(new PostMethodDescriptorSupplier("RemovePostById"))
                  .build();
          }
        }
     }
     return getRemovePostByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostStub newStub(io.grpc.Channel channel) {
    return new PostStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PostBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PostFutureStub(channel);
  }

  /**
   */
  public static abstract class PostImplBase implements io.grpc.BindableService {

    /**
     */
    public void addPost(GRPCService.PostOuterClass.TransferPostWithSubcategoryId request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.PostObj> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPostMethod(), responseObserver);
    }

    /**
     */
    public void searchPosts(GRPCService.PostOuterClass.StringAndInteger request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchPostsMethod(), responseObserver);
    }

    /**
     */
    public void getAllPosts(GRPCService.PostOuterClass.RequestModel request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPostsMethod(), responseObserver);
    }

    /**
     */
    public void getPostDetails(GRPCService.PostOuterClass.IdWithInteger request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.PostObj> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPostDetailsMethod(), responseObserver);
    }

    /**
     */
    public void getPostsBySubcategoryId(GRPCService.PostOuterClass.SubIdWithCurrent request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPostsBySubcategoryIdMethod(), responseObserver);
    }

    /**
     */
    public void getTotalNumberOfPosts(GRPCService.PostOuterClass.OnlyString request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.IdWithInteger> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTotalNumberOfPostsMethod(), responseObserver);
    }

    /**
     */
    public void getAllPostsByUsername(GRPCService.PostOuterClass.OnlyString request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPostsByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void removePostById(GRPCService.PostOuterClass.PostId request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.Nothing> responseObserver) {
      asyncUnimplementedUnaryCall(getRemovePostByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.TransferPostWithSubcategoryId,
                GRPCService.PostOuterClass.PostObj>(
                  this, METHODID_ADD_POST)))
          .addMethod(
            getSearchPostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.StringAndInteger,
                GRPCService.PostOuterClass.ListOfPostObj>(
                  this, METHODID_SEARCH_POSTS)))
          .addMethod(
            getGetAllPostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.RequestModel,
                GRPCService.PostOuterClass.ListOfPostObj>(
                  this, METHODID_GET_ALL_POSTS)))
          .addMethod(
            getGetPostDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.IdWithInteger,
                GRPCService.PostOuterClass.PostObj>(
                  this, METHODID_GET_POST_DETAILS)))
          .addMethod(
            getGetPostsBySubcategoryIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.SubIdWithCurrent,
                GRPCService.PostOuterClass.ListOfPostObj>(
                  this, METHODID_GET_POSTS_BY_SUBCATEGORY_ID)))
          .addMethod(
            getGetTotalNumberOfPostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.OnlyString,
                GRPCService.PostOuterClass.IdWithInteger>(
                  this, METHODID_GET_TOTAL_NUMBER_OF_POSTS)))
          .addMethod(
            getGetAllPostsByUsernameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.OnlyString,
                GRPCService.PostOuterClass.ListOfPostObj>(
                  this, METHODID_GET_ALL_POSTS_BY_USERNAME)))
          .addMethod(
            getRemovePostByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.PostOuterClass.PostId,
                GRPCService.PostOuterClass.Nothing>(
                  this, METHODID_REMOVE_POST_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class PostStub extends io.grpc.stub.AbstractStub<PostStub> {
    private PostStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PostStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PostStub(channel, callOptions);
    }

    /**
     */
    public void addPost(GRPCService.PostOuterClass.TransferPostWithSubcategoryId request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.PostObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchPosts(GRPCService.PostOuterClass.StringAndInteger request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllPosts(GRPCService.PostOuterClass.RequestModel request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPostDetails(GRPCService.PostOuterClass.IdWithInteger request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.PostObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPostDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPostsBySubcategoryId(GRPCService.PostOuterClass.SubIdWithCurrent request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPostsBySubcategoryIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalNumberOfPosts(GRPCService.PostOuterClass.OnlyString request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.IdWithInteger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTotalNumberOfPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllPostsByUsername(GRPCService.PostOuterClass.OnlyString request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPostsByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePostById(GRPCService.PostOuterClass.PostId request,
        io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.Nothing> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemovePostByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PostBlockingStub extends io.grpc.stub.AbstractStub<PostBlockingStub> {
    private PostBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PostBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PostBlockingStub(channel, callOptions);
    }

    /**
     */
    public GRPCService.PostOuterClass.PostObj addPost(GRPCService.PostOuterClass.TransferPostWithSubcategoryId request) {
      return blockingUnaryCall(
          getChannel(), getAddPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.PostOuterClass.ListOfPostObj searchPosts(GRPCService.PostOuterClass.StringAndInteger request) {
      return blockingUnaryCall(
          getChannel(), getSearchPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.PostOuterClass.ListOfPostObj getAllPosts(GRPCService.PostOuterClass.RequestModel request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.PostOuterClass.PostObj getPostDetails(GRPCService.PostOuterClass.IdWithInteger request) {
      return blockingUnaryCall(
          getChannel(), getGetPostDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.PostOuterClass.ListOfPostObj getPostsBySubcategoryId(GRPCService.PostOuterClass.SubIdWithCurrent request) {
      return blockingUnaryCall(
          getChannel(), getGetPostsBySubcategoryIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.PostOuterClass.IdWithInteger getTotalNumberOfPosts(GRPCService.PostOuterClass.OnlyString request) {
      return blockingUnaryCall(
          getChannel(), getGetTotalNumberOfPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.PostOuterClass.ListOfPostObj getAllPostsByUsername(GRPCService.PostOuterClass.OnlyString request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPostsByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.PostOuterClass.Nothing removePostById(GRPCService.PostOuterClass.PostId request) {
      return blockingUnaryCall(
          getChannel(), getRemovePostByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PostFutureStub extends io.grpc.stub.AbstractStub<PostFutureStub> {
    private PostFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PostFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PostFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.PostObj> addPost(
        GRPCService.PostOuterClass.TransferPostWithSubcategoryId request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.ListOfPostObj> searchPosts(
        GRPCService.PostOuterClass.StringAndInteger request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchPostsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.ListOfPostObj> getAllPosts(
        GRPCService.PostOuterClass.RequestModel request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPostsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.PostObj> getPostDetails(
        GRPCService.PostOuterClass.IdWithInteger request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPostDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.ListOfPostObj> getPostsBySubcategoryId(
        GRPCService.PostOuterClass.SubIdWithCurrent request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPostsBySubcategoryIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.IdWithInteger> getTotalNumberOfPosts(
        GRPCService.PostOuterClass.OnlyString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTotalNumberOfPostsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.ListOfPostObj> getAllPostsByUsername(
        GRPCService.PostOuterClass.OnlyString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPostsByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.PostOuterClass.Nothing> removePostById(
        GRPCService.PostOuterClass.PostId request) {
      return futureUnaryCall(
          getChannel().newCall(getRemovePostByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_POST = 0;
  private static final int METHODID_SEARCH_POSTS = 1;
  private static final int METHODID_GET_ALL_POSTS = 2;
  private static final int METHODID_GET_POST_DETAILS = 3;
  private static final int METHODID_GET_POSTS_BY_SUBCATEGORY_ID = 4;
  private static final int METHODID_GET_TOTAL_NUMBER_OF_POSTS = 5;
  private static final int METHODID_GET_ALL_POSTS_BY_USERNAME = 6;
  private static final int METHODID_REMOVE_POST_BY_ID = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PostImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PostImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_POST:
          serviceImpl.addPost((GRPCService.PostOuterClass.TransferPostWithSubcategoryId) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.PostObj>) responseObserver);
          break;
        case METHODID_SEARCH_POSTS:
          serviceImpl.searchPosts((GRPCService.PostOuterClass.StringAndInteger) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj>) responseObserver);
          break;
        case METHODID_GET_ALL_POSTS:
          serviceImpl.getAllPosts((GRPCService.PostOuterClass.RequestModel) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj>) responseObserver);
          break;
        case METHODID_GET_POST_DETAILS:
          serviceImpl.getPostDetails((GRPCService.PostOuterClass.IdWithInteger) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.PostObj>) responseObserver);
          break;
        case METHODID_GET_POSTS_BY_SUBCATEGORY_ID:
          serviceImpl.getPostsBySubcategoryId((GRPCService.PostOuterClass.SubIdWithCurrent) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj>) responseObserver);
          break;
        case METHODID_GET_TOTAL_NUMBER_OF_POSTS:
          serviceImpl.getTotalNumberOfPosts((GRPCService.PostOuterClass.OnlyString) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.IdWithInteger>) responseObserver);
          break;
        case METHODID_GET_ALL_POSTS_BY_USERNAME:
          serviceImpl.getAllPostsByUsername((GRPCService.PostOuterClass.OnlyString) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.ListOfPostObj>) responseObserver);
          break;
        case METHODID_REMOVE_POST_BY_ID:
          serviceImpl.removePostById((GRPCService.PostOuterClass.PostId) request,
              (io.grpc.stub.StreamObserver<GRPCService.PostOuterClass.Nothing>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PostBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GRPCService.PostOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Post");
    }
  }

  private static final class PostFileDescriptorSupplier
      extends PostBaseDescriptorSupplier {
    PostFileDescriptorSupplier() {}
  }

  private static final class PostMethodDescriptorSupplier
      extends PostBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PostMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PostGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostFileDescriptorSupplier())
              .addMethod(getAddPostMethod())
              .addMethod(getSearchPostsMethod())
              .addMethod(getGetAllPostsMethod())
              .addMethod(getGetPostDetailsMethod())
              .addMethod(getGetPostsBySubcategoryIdMethod())
              .addMethod(getGetTotalNumberOfPostsMethod())
              .addMethod(getGetAllPostsByUsernameMethod())
              .addMethod(getRemovePostByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
