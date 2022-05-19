package group6.semester.project.grpcClient.block;

import GRPCService.BlockProtoGrpc;
import GRPCService.UserOuterClass;
import group6.semester.project.grpcClient.ConvertGrpc;
import group6.semester.project.grpcClient.ManagedChannelGetter;
import group6.semester.project.model.Block;
import group6.semester.project.model.User;
import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;

@Service
public class GRPCBlockClientImpl implements BlockClient {
    private BlockProtoGrpc.BlockProtoBlockingStub blockProtoBlockingStub;


    public BlockProtoGrpc.BlockProtoBlockingStub getBlockProtoBlockingStub() {
        if (blockProtoBlockingStub ==null)
        {
            ManagedChannel managedChannelGetter = ManagedChannelGetter.getManagedChannel();
            blockProtoBlockingStub = BlockProtoGrpc.newBlockingStub(managedChannelGetter);

        }
        return blockProtoBlockingStub;
    }

    @Override
    public User blockUser(Block block) {
        GRPCService.Block.BlockObj blockObj = GRPCService.Block.BlockObj.newBuilder()
                .setUsername(block.getUsername())
                .setReason(block.getReason())
        .build();

        UserOuterClass.UserObj userObj = getBlockProtoBlockingStub().blockUser(blockObj);
        return ConvertGrpc.getUserFromGrpcUser(userObj);
    }

    @Override
    public User unBlockUser(String username) {
        UserOuterClass.UserObj userObj = getBlockProtoBlockingStub().unBlockUser(UserOuterClass.Username.newBuilder()
                .setUserName(username).build());
        return ConvertGrpc.getUserFromGrpcUser(userObj);
    }
}
