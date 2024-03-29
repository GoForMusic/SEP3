// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: report.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace GRPCService {
  public static partial class Report
  {
    static readonly string __ServiceName = "report.Report";

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
    static readonly grpc::Marshaller<global::GRPCService.ReportObj> __Marshaller_report_ReportObj = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.ReportObj.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.EmptyReportMark> __Marshaller_report_EmptyReportMark = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.EmptyReportMark.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GRPCService.ListOfReports> __Marshaller_report_ListOfReports = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GRPCService.ListOfReports.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.ReportObj, global::GRPCService.EmptyReportMark> __Method_RemoveReport = new grpc::Method<global::GRPCService.ReportObj, global::GRPCService.EmptyReportMark>(
        grpc::MethodType.Unary,
        __ServiceName,
        "RemoveReport",
        __Marshaller_report_ReportObj,
        __Marshaller_report_EmptyReportMark);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.EmptyReportMark, global::GRPCService.ListOfReports> __Method_GetReports = new grpc::Method<global::GRPCService.EmptyReportMark, global::GRPCService.ListOfReports>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetReports",
        __Marshaller_report_EmptyReportMark,
        __Marshaller_report_ListOfReports);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GRPCService.ReportObj, global::GRPCService.EmptyReportMark> __Method_AddReport = new grpc::Method<global::GRPCService.ReportObj, global::GRPCService.EmptyReportMark>(
        grpc::MethodType.Unary,
        __ServiceName,
        "AddReport",
        __Marshaller_report_ReportObj,
        __Marshaller_report_EmptyReportMark);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::GRPCService.ReportReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of Report</summary>
    [grpc::BindServiceMethod(typeof(Report), "BindService")]
    public abstract partial class ReportBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.EmptyReportMark> RemoveReport(global::GRPCService.ReportObj request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.ListOfReports> GetReports(global::GRPCService.EmptyReportMark request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GRPCService.EmptyReportMark> AddReport(global::GRPCService.ReportObj request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(ReportBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_RemoveReport, serviceImpl.RemoveReport)
          .AddMethod(__Method_GetReports, serviceImpl.GetReports)
          .AddMethod(__Method_AddReport, serviceImpl.AddReport).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, ReportBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_RemoveReport, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.ReportObj, global::GRPCService.EmptyReportMark>(serviceImpl.RemoveReport));
      serviceBinder.AddMethod(__Method_GetReports, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.EmptyReportMark, global::GRPCService.ListOfReports>(serviceImpl.GetReports));
      serviceBinder.AddMethod(__Method_AddReport, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GRPCService.ReportObj, global::GRPCService.EmptyReportMark>(serviceImpl.AddReport));
    }

  }
}
#endregion
