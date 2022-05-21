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
    comments = "Source: Block.proto")
public final class BlockProtoGrpc {

  private BlockProtoGrpc() {}

  public static final String SERVICE_NAME = "BlockProto";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GRPCService.Block.BlockObj,
      GRPCService.UserOuterClass.UserObj> getBlockUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockUser",
      requestType = GRPCService.Block.BlockObj.class,
      responseType = GRPCService.UserOuterClass.UserObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.Block.BlockObj,
      GRPCService.UserOuterClass.UserObj> getBlockUserMethod() {
    io.grpc.MethodDescriptor<GRPCService.Block.BlockObj, GRPCService.UserOuterClass.UserObj> getBlockUserMethod;
    if ((getBlockUserMethod = BlockProtoGrpc.getBlockUserMethod) == null) {
      synchronized (BlockProtoGrpc.class) {
        if ((getBlockUserMethod = BlockProtoGrpc.getBlockUserMethod) == null) {
          BlockProtoGrpc.getBlockUserMethod = getBlockUserMethod = 
              io.grpc.MethodDescriptor.<GRPCService.Block.BlockObj, GRPCService.UserOuterClass.UserObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BlockProto", "BlockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.Block.BlockObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.UserOuterClass.UserObj.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockProtoMethodDescriptorSupplier("BlockUser"))
                  .build();
          }
        }
     }
     return getBlockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.UserOuterClass.Username,
      GRPCService.UserOuterClass.UserObj> getUnBlockUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnBlockUser",
      requestType = GRPCService.UserOuterClass.Username.class,
      responseType = GRPCService.UserOuterClass.UserObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.UserOuterClass.Username,
      GRPCService.UserOuterClass.UserObj> getUnBlockUserMethod() {
    io.grpc.MethodDescriptor<GRPCService.UserOuterClass.Username, GRPCService.UserOuterClass.UserObj> getUnBlockUserMethod;
    if ((getUnBlockUserMethod = BlockProtoGrpc.getUnBlockUserMethod) == null) {
      synchronized (BlockProtoGrpc.class) {
        if ((getUnBlockUserMethod = BlockProtoGrpc.getUnBlockUserMethod) == null) {
          BlockProtoGrpc.getUnBlockUserMethod = getUnBlockUserMethod = 
              io.grpc.MethodDescriptor.<GRPCService.UserOuterClass.Username, GRPCService.UserOuterClass.UserObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BlockProto", "UnBlockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.UserOuterClass.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.UserOuterClass.UserObj.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockProtoMethodDescriptorSupplier("UnBlockUser"))
                  .build();
          }
        }
     }
     return getUnBlockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.Block.EmptyBlock,
      GRPCService.Block.ListOfBlocks> getGetAllBlockedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllBlockedUsers",
      requestType = GRPCService.Block.EmptyBlock.class,
      responseType = GRPCService.Block.ListOfBlocks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.Block.EmptyBlock,
      GRPCService.Block.ListOfBlocks> getGetAllBlockedUsersMethod() {
    io.grpc.MethodDescriptor<GRPCService.Block.EmptyBlock, GRPCService.Block.ListOfBlocks> getGetAllBlockedUsersMethod;
    if ((getGetAllBlockedUsersMethod = BlockProtoGrpc.getGetAllBlockedUsersMethod) == null) {
      synchronized (BlockProtoGrpc.class) {
        if ((getGetAllBlockedUsersMethod = BlockProtoGrpc.getGetAllBlockedUsersMethod) == null) {
          BlockProtoGrpc.getGetAllBlockedUsersMethod = getGetAllBlockedUsersMethod = 
              io.grpc.MethodDescriptor.<GRPCService.Block.EmptyBlock, GRPCService.Block.ListOfBlocks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BlockProto", "getAllBlockedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.Block.EmptyBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.Block.ListOfBlocks.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockProtoMethodDescriptorSupplier("getAllBlockedUsers"))
                  .build();
          }
        }
     }
     return getGetAllBlockedUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlockProtoStub newStub(io.grpc.Channel channel) {
    return new BlockProtoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlockProtoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BlockProtoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlockProtoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BlockProtoFutureStub(channel);
  }

  /**
   */
  public static abstract class BlockProtoImplBase implements io.grpc.BindableService {

    /**
     */
    public void blockUser(GRPCService.Block.BlockObj request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockUserMethod(), responseObserver);
    }

    /**
     */
    public void unBlockUser(GRPCService.UserOuterClass.Username request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnimplementedUnaryCall(getUnBlockUserMethod(), responseObserver);
    }

    /**
     */
    public void getAllBlockedUsers(GRPCService.Block.EmptyBlock request,
        io.grpc.stub.StreamObserver<GRPCService.Block.ListOfBlocks> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllBlockedUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBlockUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.Block.BlockObj,
                GRPCService.UserOuterClass.UserObj>(
                  this, METHODID_BLOCK_USER)))
          .addMethod(
            getUnBlockUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.UserOuterClass.Username,
                GRPCService.UserOuterClass.UserObj>(
                  this, METHODID_UN_BLOCK_USER)))
          .addMethod(
            getGetAllBlockedUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.Block.EmptyBlock,
                GRPCService.Block.ListOfBlocks>(
                  this, METHODID_GET_ALL_BLOCKED_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class BlockProtoStub extends io.grpc.stub.AbstractStub<BlockProtoStub> {
    private BlockProtoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockProtoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockProtoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockProtoStub(channel, callOptions);
    }

    /**
     */
    public void blockUser(GRPCService.Block.BlockObj request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unBlockUser(GRPCService.UserOuterClass.Username request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnBlockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllBlockedUsers(GRPCService.Block.EmptyBlock request,
        io.grpc.stub.StreamObserver<GRPCService.Block.ListOfBlocks> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllBlockedUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlockProtoBlockingStub extends io.grpc.stub.AbstractStub<BlockProtoBlockingStub> {
    private BlockProtoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockProtoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockProtoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockProtoBlockingStub(channel, callOptions);
    }

    /**
     */
    public GRPCService.UserOuterClass.UserObj blockUser(GRPCService.Block.BlockObj request) {
      return blockingUnaryCall(
          getChannel(), getBlockUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.UserOuterClass.UserObj unBlockUser(GRPCService.UserOuterClass.Username request) {
      return blockingUnaryCall(
          getChannel(), getUnBlockUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.Block.ListOfBlocks getAllBlockedUsers(GRPCService.Block.EmptyBlock request) {
      return blockingUnaryCall(
          getChannel(), getGetAllBlockedUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlockProtoFutureStub extends io.grpc.stub.AbstractStub<BlockProtoFutureStub> {
    private BlockProtoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockProtoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockProtoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockProtoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.UserOuterClass.UserObj> blockUser(
        GRPCService.Block.BlockObj request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.UserOuterClass.UserObj> unBlockUser(
        GRPCService.UserOuterClass.Username request) {
      return futureUnaryCall(
          getChannel().newCall(getUnBlockUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.Block.ListOfBlocks> getAllBlockedUsers(
        GRPCService.Block.EmptyBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllBlockedUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BLOCK_USER = 0;
  private static final int METHODID_UN_BLOCK_USER = 1;
  private static final int METHODID_GET_ALL_BLOCKED_USERS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlockProtoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlockProtoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BLOCK_USER:
          serviceImpl.blockUser((GRPCService.Block.BlockObj) request,
              (io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj>) responseObserver);
          break;
        case METHODID_UN_BLOCK_USER:
          serviceImpl.unBlockUser((GRPCService.UserOuterClass.Username) request,
              (io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj>) responseObserver);
          break;
        case METHODID_GET_ALL_BLOCKED_USERS:
          serviceImpl.getAllBlockedUsers((GRPCService.Block.EmptyBlock) request,
              (io.grpc.stub.StreamObserver<GRPCService.Block.ListOfBlocks>) responseObserver);
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

  private static abstract class BlockProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlockProtoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GRPCService.Block.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlockProto");
    }
  }

  private static final class BlockProtoFileDescriptorSupplier
      extends BlockProtoBaseDescriptorSupplier {
    BlockProtoFileDescriptorSupplier() {}
  }

  private static final class BlockProtoMethodDescriptorSupplier
      extends BlockProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlockProtoMethodDescriptorSupplier(String methodName) {
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
      synchronized (BlockProtoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlockProtoFileDescriptorSupplier())
              .addMethod(getBlockUserMethod())
              .addMethod(getUnBlockUserMethod())
              .addMethod(getGetAllBlockedUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
