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
    comments = "Source: rating.proto")
public final class RatingGrpc {

  private RatingGrpc() {}

  public static final String SERVICE_NAME = "Rating.Rating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GRPCService.RatingOuterClass.RatingObj,
      GRPCService.RatingOuterClass.RatingObj> getAddRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRating",
      requestType = GRPCService.RatingOuterClass.RatingObj.class,
      responseType = GRPCService.RatingOuterClass.RatingObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.RatingOuterClass.RatingObj,
      GRPCService.RatingOuterClass.RatingObj> getAddRatingMethod() {
    io.grpc.MethodDescriptor<GRPCService.RatingOuterClass.RatingObj, GRPCService.RatingOuterClass.RatingObj> getAddRatingMethod;
    if ((getAddRatingMethod = RatingGrpc.getAddRatingMethod) == null) {
      synchronized (RatingGrpc.class) {
        if ((getAddRatingMethod = RatingGrpc.getAddRatingMethod) == null) {
          RatingGrpc.getAddRatingMethod = getAddRatingMethod = 
              io.grpc.MethodDescriptor.<GRPCService.RatingOuterClass.RatingObj, GRPCService.RatingOuterClass.RatingObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Rating.Rating", "AddRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.RatingOuterClass.RatingObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.RatingOuterClass.RatingObj.getDefaultInstance()))
                  .setSchemaDescriptor(new RatingMethodDescriptorSupplier("AddRating"))
                  .build();
          }
        }
     }
     return getAddRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RatingStub newStub(io.grpc.Channel channel) {
    return new RatingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RatingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RatingFutureStub(channel);
  }

  /**
   */
  public static abstract class RatingImplBase implements io.grpc.BindableService {

    /**
     */
    public void addRating(GRPCService.RatingOuterClass.RatingObj request,
        io.grpc.stub.StreamObserver<GRPCService.RatingOuterClass.RatingObj> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRatingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.RatingOuterClass.RatingObj,
                GRPCService.RatingOuterClass.RatingObj>(
                  this, METHODID_ADD_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class RatingStub extends io.grpc.stub.AbstractStub<RatingStub> {
    private RatingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingStub(channel, callOptions);
    }

    /**
     */
    public void addRating(GRPCService.RatingOuterClass.RatingObj request,
        io.grpc.stub.StreamObserver<GRPCService.RatingOuterClass.RatingObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RatingBlockingStub extends io.grpc.stub.AbstractStub<RatingBlockingStub> {
    private RatingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingBlockingStub(channel, callOptions);
    }

    /**
     */
    public GRPCService.RatingOuterClass.RatingObj addRating(GRPCService.RatingOuterClass.RatingObj request) {
      return blockingUnaryCall(
          getChannel(), getAddRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RatingFutureStub extends io.grpc.stub.AbstractStub<RatingFutureStub> {
    private RatingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.RatingOuterClass.RatingObj> addRating(
        GRPCService.RatingOuterClass.RatingObj request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RATING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RatingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RatingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_RATING:
          serviceImpl.addRating((GRPCService.RatingOuterClass.RatingObj) request,
              (io.grpc.stub.StreamObserver<GRPCService.RatingOuterClass.RatingObj>) responseObserver);
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

  private static abstract class RatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GRPCService.RatingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rating");
    }
  }

  private static final class RatingFileDescriptorSupplier
      extends RatingBaseDescriptorSupplier {
    RatingFileDescriptorSupplier() {}
  }

  private static final class RatingMethodDescriptorSupplier
      extends RatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RatingMethodDescriptorSupplier(String methodName) {
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
      synchronized (RatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RatingFileDescriptorSupplier())
              .addMethod(getAddRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
