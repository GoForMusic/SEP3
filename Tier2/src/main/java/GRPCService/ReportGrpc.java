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
    comments = "Source: report.proto")
public final class ReportGrpc {

  private ReportGrpc() {}

  public static final String SERVICE_NAME = "Report.Report";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.ReportObj,
      GRPCService.ReportOuterClass.EmptyReportMark> getRemoveReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveReport",
      requestType = GRPCService.ReportOuterClass.ReportObj.class,
      responseType = GRPCService.ReportOuterClass.EmptyReportMark.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.ReportObj,
      GRPCService.ReportOuterClass.EmptyReportMark> getRemoveReportMethod() {
    io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.ReportObj, GRPCService.ReportOuterClass.EmptyReportMark> getRemoveReportMethod;
    if ((getRemoveReportMethod = ReportGrpc.getRemoveReportMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getRemoveReportMethod = ReportGrpc.getRemoveReportMethod) == null) {
          ReportGrpc.getRemoveReportMethod = getRemoveReportMethod = 
              io.grpc.MethodDescriptor.<GRPCService.ReportOuterClass.ReportObj, GRPCService.ReportOuterClass.EmptyReportMark>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Report.Report", "RemoveReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.ReportOuterClass.ReportObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.ReportOuterClass.EmptyReportMark.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportMethodDescriptorSupplier("RemoveReport"))
                  .build();
          }
        }
     }
     return getRemoveReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.EmptyReportMark,
      GRPCService.ReportOuterClass.ListOfReports> getGetReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReports",
      requestType = GRPCService.ReportOuterClass.EmptyReportMark.class,
      responseType = GRPCService.ReportOuterClass.ListOfReports.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.EmptyReportMark,
      GRPCService.ReportOuterClass.ListOfReports> getGetReportsMethod() {
    io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.EmptyReportMark, GRPCService.ReportOuterClass.ListOfReports> getGetReportsMethod;
    if ((getGetReportsMethod = ReportGrpc.getGetReportsMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getGetReportsMethod = ReportGrpc.getGetReportsMethod) == null) {
          ReportGrpc.getGetReportsMethod = getGetReportsMethod = 
              io.grpc.MethodDescriptor.<GRPCService.ReportOuterClass.EmptyReportMark, GRPCService.ReportOuterClass.ListOfReports>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Report.Report", "GetReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.ReportOuterClass.EmptyReportMark.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.ReportOuterClass.ListOfReports.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportMethodDescriptorSupplier("GetReports"))
                  .build();
          }
        }
     }
     return getGetReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.ReportObj,
      GRPCService.ReportOuterClass.Status> getAddReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReport",
      requestType = GRPCService.ReportOuterClass.ReportObj.class,
      responseType = GRPCService.ReportOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.ReportObj,
      GRPCService.ReportOuterClass.Status> getAddReportMethod() {
    io.grpc.MethodDescriptor<GRPCService.ReportOuterClass.ReportObj, GRPCService.ReportOuterClass.Status> getAddReportMethod;
    if ((getAddReportMethod = ReportGrpc.getAddReportMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getAddReportMethod = ReportGrpc.getAddReportMethod) == null) {
          ReportGrpc.getAddReportMethod = getAddReportMethod = 
              io.grpc.MethodDescriptor.<GRPCService.ReportOuterClass.ReportObj, GRPCService.ReportOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Report.Report", "AddReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.ReportOuterClass.ReportObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPCService.ReportOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportMethodDescriptorSupplier("AddReport"))
                  .build();
          }
        }
     }
     return getAddReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportStub newStub(io.grpc.Channel channel) {
    return new ReportStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReportBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReportFutureStub(channel);
  }

  /**
   */
  public static abstract class ReportImplBase implements io.grpc.BindableService {

    /**
     */
    public void removeReport(GRPCService.ReportOuterClass.ReportObj request,
        io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.EmptyReportMark> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveReportMethod(), responseObserver);
    }

    /**
     */
    public void getReports(GRPCService.ReportOuterClass.EmptyReportMark request,
        io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.ListOfReports> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReportsMethod(), responseObserver);
    }

    /**
     */
    public void addReport(GRPCService.ReportOuterClass.ReportObj request,
        io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getAddReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.ReportOuterClass.ReportObj,
                GRPCService.ReportOuterClass.EmptyReportMark>(
                  this, METHODID_REMOVE_REPORT)))
          .addMethod(
            getGetReportsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.ReportOuterClass.EmptyReportMark,
                GRPCService.ReportOuterClass.ListOfReports>(
                  this, METHODID_GET_REPORTS)))
          .addMethod(
            getAddReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GRPCService.ReportOuterClass.ReportObj,
                GRPCService.ReportOuterClass.Status>(
                  this, METHODID_ADD_REPORT)))
          .build();
    }
  }

  /**
   */
  public static final class ReportStub extends io.grpc.stub.AbstractStub<ReportStub> {
    private ReportStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportStub(channel, callOptions);
    }

    /**
     */
    public void removeReport(GRPCService.ReportOuterClass.ReportObj request,
        io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.EmptyReportMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReports(GRPCService.ReportOuterClass.EmptyReportMark request,
        io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.ListOfReports> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReport(GRPCService.ReportOuterClass.ReportObj request,
        io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReportBlockingStub extends io.grpc.stub.AbstractStub<ReportBlockingStub> {
    private ReportBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportBlockingStub(channel, callOptions);
    }

    /**
     */
    public GRPCService.ReportOuterClass.EmptyReportMark removeReport(GRPCService.ReportOuterClass.ReportObj request) {
      return blockingUnaryCall(
          getChannel(), getRemoveReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.ReportOuterClass.ListOfReports getReports(GRPCService.ReportOuterClass.EmptyReportMark request) {
      return blockingUnaryCall(
          getChannel(), getGetReportsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPCService.ReportOuterClass.Status addReport(GRPCService.ReportOuterClass.ReportObj request) {
      return blockingUnaryCall(
          getChannel(), getAddReportMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReportFutureStub extends io.grpc.stub.AbstractStub<ReportFutureStub> {
    private ReportFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.ReportOuterClass.EmptyReportMark> removeReport(
        GRPCService.ReportOuterClass.ReportObj request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.ReportOuterClass.ListOfReports> getReports(
        GRPCService.ReportOuterClass.EmptyReportMark request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReportsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPCService.ReportOuterClass.Status> addReport(
        GRPCService.ReportOuterClass.ReportObj request) {
      return futureUnaryCall(
          getChannel().newCall(getAddReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_REPORT = 0;
  private static final int METHODID_GET_REPORTS = 1;
  private static final int METHODID_ADD_REPORT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE_REPORT:
          serviceImpl.removeReport((GRPCService.ReportOuterClass.ReportObj) request,
              (io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.EmptyReportMark>) responseObserver);
          break;
        case METHODID_GET_REPORTS:
          serviceImpl.getReports((GRPCService.ReportOuterClass.EmptyReportMark) request,
              (io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.ListOfReports>) responseObserver);
          break;
        case METHODID_ADD_REPORT:
          serviceImpl.addReport((GRPCService.ReportOuterClass.ReportObj) request,
              (io.grpc.stub.StreamObserver<GRPCService.ReportOuterClass.Status>) responseObserver);
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

  private static abstract class ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GRPCService.ReportOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Report");
    }
  }

  private static final class ReportFileDescriptorSupplier
      extends ReportBaseDescriptorSupplier {
    ReportFileDescriptorSupplier() {}
  }

  private static final class ReportMethodDescriptorSupplier
      extends ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportFileDescriptorSupplier())
              .addMethod(getRemoveReportMethod())
              .addMethod(getGetReportsMethod())
              .addMethod(getAddReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
