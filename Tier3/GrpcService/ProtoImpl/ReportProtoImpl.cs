using Entities.Contracts;
using Google.Protobuf.Collections;
using Grpc.Core;
using GRPCService.ProtoImpl.Util;

namespace GRPCService.ProtoImpl;

public class ReportProtoImpl : Report.ReportBase {
    private IReportService _reportService;

    public ReportProtoImpl(IReportService _reportService) {
        this._reportService = _reportService;
    }

    public override async Task<EmptyReportMark> RemoveReport(ReportObj request, ServerCallContext context) {
        try {
            Entities.Models.Report temp =
                await _reportService.RemoveReport(ConvertGRPC.ConvertReportObjToReport(request));
            return new EmptyReportMark();
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.NotFound, e.Message));
        }
    }


    public override async Task<EmptyReportMark> AddReport(ReportObj request, ServerCallContext context)
    {
        try
        {
            var Report = _reportService.AddReport(ConvertGRPC.ConvertReportObjToReport(request)).Result;
            if (Report != null)
            {
                return new EmptyReportMark();
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw new Exception();
        }

        return null;
    }
}