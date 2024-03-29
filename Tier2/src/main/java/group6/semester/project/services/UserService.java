package group6.semester.project.services;

import group6.semester.project.model.Block;
import group6.semester.project.model.User;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService{
    User CreateUserAsync(User user) throws Exception;
    User GetUserAsync(String username) throws Exception;
    User GetUserLogin(String username, String password) throws Exception;

}
