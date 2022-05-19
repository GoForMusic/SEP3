package group6.semester.project.services;

import group6.semester.project.model.Block;
import group6.semester.project.model.User;
import org.springframework.stereotype.Service;

@Service
public interface BlockService {

    User blockUser(Block block);

    User unBlockUser(String username);

}
