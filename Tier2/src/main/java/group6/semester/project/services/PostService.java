package group6.semester.project.services;

import group6.semester.project.model.Category;
import group6.semester.project.model.Post;
import group6.semester.project.model.Subcategory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface PostService {
    Post addPost(Post post, int subcategoryId);

    List<Category> getAllCategories();

     void addImage(MultipartFile file);
}
