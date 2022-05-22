package group6.semester.project.grpcClient.block;

import GRPCService.BlockProtoGrpc;
import GRPCService.UserOuterClass;
import group6.semester.project.grpcClient.ConvertGrpc;
import group6.semester.project.grpcClient.ManagedChannelGetter;
import group6.semester.project.model.Block;
import group6.semester.project.model.User;
import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GRPCBlockClientImpl implements BlockClient {
    private BlockProtoGrpc.BlockProtoBlockingStub blockProtoBlockingStub;


    public BlockProtoGrpc.BlockProtoBlockingStub getBlockProtoBlockingStub() {
        try {
            if (blockProtoBlockingStub ==null)
            {
                ManagedChannel managedChannelGetter = ManagedChannelGetter.getManagedChannel();
                blockProtoBlockingStub = BlockProtoGrpc.newBlockingStub(managedChannelGetter);

            }
            return blockProtoBlockingStub;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User blockUser(Block block) {
        try {
            GRPCService.Block.BlockObj blockObj = GRPCService.Block.BlockObj.newBuilder()
                    .setUsername(block.getUsername())
                    .setReason(block.getReason())
            .build();

            UserOuterClass.UserObj userObj = getBlockProtoBlockingStub().blockUser(blockObj);
            return ConvertGrpc.getUserFromGrpcUser(userObj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User unBlockUser(String username) {
        try {
            UserOuterClass.UserObj userObj = getBlockProtoBlockingStub().unBlockUser(UserOuterClass.Username.newBuilder()
                    .setUserName(username).build());
            return ConvertGrpc.getUserFromGrpcUser(userObj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Block> getALlBlockedUsers() {
        try {
            GRPCService.Block.ListOfBlocks users = getBlockProtoBlockingStub().getAllBlockedUsers(GRPCService.Block.EmptyBlock.newBuilder().build());
            return ConvertGrpc.getListOfBlocksFromGRPCList(users);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
