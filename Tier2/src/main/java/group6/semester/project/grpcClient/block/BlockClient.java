package group6.semester.project.grpcClient.block;

import group6.semester.project.model.Block;
import group6.semester.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlockClient {
    User blockUser(Block block);

    User unBlockUser(String username);

    List<Block> getALlBlockedUsers();

}
