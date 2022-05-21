package group6.semester.project.services.SericeImpl;

import group6.semester.project.grpcClient.block.BlockClient;
import group6.semester.project.model.Block;
import group6.semester.project.model.User;
import group6.semester.project.services.BlockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServiceImpl implements BlockService {


    private BlockClient client;

    public BlockServiceImpl(BlockClient blockClient) {
        this.client = blockClient;
    }

    @Override
    public User blockUser(Block block) {
        return client.blockUser(block);
    }

    @Override
    public User unBlockUser(String username) {
        return client.unBlockUser(username);
    }

    @Override
    public List<Block> getAllBlockedUsers() {
        return client.getALlBlockedUsers();
    }
}
