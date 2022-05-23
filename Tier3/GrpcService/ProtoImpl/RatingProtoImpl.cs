using Entities.Contracts;
using Entities.Models;
using Grpc.Core;
using GRPCService.ProtoImpl.Util;

namespace GRPCService.ProtoImpl;

public class RatingProtoImpl : rating.ratingBase
{

    private IRatingService _ratingService;

    public RatingProtoImpl(IRatingService ratingService)
    {
        _ratingService = ratingService;
    }

    public override async Task<RatingObj> AddRating(RatingObj request, ServerCallContext context)
    {
        try
        {
            Rate rate = ConvertGRPC.GetRateFromRateObj(request);
        Console.WriteLine(rate.score);
            Rate returning = await _ratingService.AddRate(rate);
            return ConvertGRPC.ConvertRateObjToRate(returning);
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.NotFound,e.Message));
        }
    }
}