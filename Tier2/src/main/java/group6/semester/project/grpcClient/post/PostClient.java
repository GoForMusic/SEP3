package group6.semester.project.grpcClient.post;

import group6.semester.project.model.Category;
import group6.semester.project.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostClient {
    Post addPost(Post post, int subCategoryId);

    List<Category> getAllCategories();


    Post getPostDetails(int id);
    List<Post> searchPosts(String title, int current);

    List<Post> getAllPosts(int current);

    List<Post> getPostBySubcategoryId(int subCategoryIdSelected, int current);

    int getNumberOfPosts(String username);

    List<Post> getAllPostsByUsername(String username);

}
