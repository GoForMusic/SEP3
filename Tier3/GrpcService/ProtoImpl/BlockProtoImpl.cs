using Entities.Contracts;
using Entities.Models;
using Grpc.Core;
using GRPCService.ProtoImpl.Util;

namespace GRPCService.ProtoImpl;

public class BlockProtoImpl : BlockProto.BlockProtoBase {

    private IBlockService _blockService;

    public BlockProtoImpl(IBlockService blockService) {
        _blockService = blockService;
    }


    public override async Task<UserObj> BlockUser(BlockObj request, ServerCallContext context) {
        try {
            Block block = new Block() {
                Reason = request.Reason,
                Username = request.Username
            };
            Entities.Models.User user = await _blockService.BlockUser(block);
            return ConvertGRPC.ConvertUserToUserObj(user);
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unknown, e.Message));
        }
    }

    public override async Task<UserObj> UnBlockUser(Username request, ServerCallContext context) {
        try {
            Entities.Models.User user = await _blockService.UnBlockUser(request.UserName);
            return ConvertGRPC.ConvertUserToUserObj(user);
        }
        catch (Exception e) {
            throw new RpcException(new Status(StatusCode.Unknown, e.Message));

        }

    }
}