package group6.semester.project.grpcClient.post;

import group6.semester.project.model.Category;
import group6.semester.project.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface PostClient {
    Post addPost(Post post, int subCategoryId);

    List<Category> getAllCategories();
  void addImage(MultipartFile file);
}
