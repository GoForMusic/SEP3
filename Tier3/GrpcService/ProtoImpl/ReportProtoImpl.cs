
using Entities.Contracts;
using Grpc.Core;
using GRPCService.ProtoImpl.Util;

namespace GRPCService.ProtoImpl;

public class ReportProtoImpl : Report.ReportBase
{

    private IReportService _reportService;


    public ReportProtoImpl(IReportService _reportService)
    {
        this._reportService = _reportService;
        
    }


    public override async Task<AddingReportStatus> AddReport(ReportObj request, ServerCallContext context)
    {
        Entities.Models.Report report = ConvertGRPC.ConvertReportObjReport(request);
        AddingReportStatus a = new AddingReportStatus();
        if ( _reportService.AddReport(report).Result)
        {
          
            a.AddingReportStatus_ = "Done";
            return a;
        }
        else
        {
            a.AddingReportStatus_ = "Fail";
            return a;
        }
    }
}