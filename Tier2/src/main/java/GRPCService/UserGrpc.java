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
    comments = "Source: user.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "user.User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GRPCService.UserOuterClass.UserObj,
      GRPCService.UserOuterClass.UserObj> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = GRPCService.UserOuterClass.UserObj.class,
      responseType = GRPCService.UserOuterClass.UserObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.UserOuterClass.UserObj,
      GRPCService.UserOuterClass.UserObj> getAddUserMethod() {
    io.grpc.MethodDescriptor<GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj> getAddUserMethod;
    if ((getAddUserMethod = UserGrpc.getAddUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getAddUserMethod = UserGrpc.getAddUserMethod) == null) {
          UserGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.UserOuterClass.UserObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.UserOuterClass.UserObj.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("AddUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.UserOuterClass.Username,
      GRPCService.UserOuterClass.UserObj> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = GRPCService.UserOuterClass.Username.class,
      responseType = GRPCService.UserOuterClass.UserObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.UserOuterClass.Username,
      GRPCService.UserOuterClass.UserObj> getGetUserMethod() {
    io.grpc.MethodDescriptor<GRPCService.UserOuterClass.Username, GRPCService.UserOuterClass.UserObj> getGetUserMethod;
    if ((getGetUserMethod = UserGrpc.getGetUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetUserMethod = UserGrpc.getGetUserMethod) == null) {
          UserGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<GRPCService.UserOuterClass.Username, GRPCService.UserOuterClass.UserObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.UserOuterClass.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.UserOuterClass.UserObj.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(GRPCService.UserOuterClass.UserObj request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(GRPCService.UserOuterClass.Username request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.UserOuterClass.UserObj,
                GRPCService.UserOuterClass.UserObj>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.UserOuterClass.Username,
                GRPCService.UserOuterClass.UserObj>(
                  this, METHODID_GET_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     */
    public void addUser(GRPCService.UserOuterClass.UserObj request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(GRPCService.UserOuterClass.Username request,
        io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     */
    public GRPCService.UserOuterClass.UserObj addUser(GRPCService.UserOuterClass.UserObj request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.UserOuterClass.UserObj getUser(GRPCService.UserOuterClass.Username request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.UserOuterClass.UserObj> addUser(
        GRPCService.UserOuterClass.UserObj request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.UserOuterClass.UserObj> getUser(
        GRPCService.UserOuterClass.Username request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_GET_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((GRPCService.UserOuterClass.UserObj) request,
              (io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((GRPCService.UserOuterClass.Username) request,
              (io.grpc.stub.StreamObserver<GRPCService.UserOuterClass.UserObj>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GRPCService.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getGetUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
