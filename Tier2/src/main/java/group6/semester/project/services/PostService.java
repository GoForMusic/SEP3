package group6.semester.project.services;

import group6.semester.project.model.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    Post addPost(Post post);
}