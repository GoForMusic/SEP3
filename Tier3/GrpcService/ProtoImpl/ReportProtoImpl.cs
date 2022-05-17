
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
    
  

}