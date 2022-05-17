
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

    public override async Task<EmptyReportMark> RemoveReport(ReportObj request, ServerCallContext context)
    {
        try
        {
            Entities.Models.Report temp =
                await _reportService.RemoveReport(ConvertGRPC.ConvertReportObjToReport(request));
            return new EmptyReportMark();
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.NotFound, e.Message));
        }

       
    }


    public override async Task<ListOfReports> GetReports(EmptyReportMark request, ServerCallContext context)
    {
        try
        {
            List<Entities.Models.Report> ret = await _reportService.getReports();
            ListOfReports list = new ListOfReports();

            foreach (var VARIABLE in ret)
            {
                ReportObj x = new ReportObj()
                {
                    PostID = ConvertGRPC.ConvertPostToPostObj(VARIABLE.Post),
                    UserID = ConvertGRPC.ConvertUserToUserObj(VARIABLE.User),
                    Reason = VARIABLE.Reason
                };
                list.ReportObj.Add(x);
            }

            return list;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.NotFound,e.Message));
        }
    }
}