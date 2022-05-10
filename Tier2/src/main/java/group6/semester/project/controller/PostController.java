package group6.semester.project.controller;

import group6.semester.project.model.Category;
import group6.semester.project.model.Post;
import group6.semester.project.services.PostService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    /**
     * It takes a Post object and a subCategoryId as parameters, and returns a ResponseEntity object
     *
     * @param post The object that will be added to the database.
     * @param subCategoryId The id of the subcategory to which the post belongs.
     * @return ResponseEntity is being returned.
     */
    @PostMapping(value = "/post/{subCategoryId}")
    public ResponseEntity addPost(@RequestBody Post post, @PathVariable int subCategoryId){

        try {
            System.out.println(post.getDescription());
            Post addedPost = postService.addPost(post, subCategoryId);
            return ResponseEntity.ok(addedPost);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        }
    }

    /**
     * It returns a list of all categories in the database
     *
     * @return A list of categories
     */
    @GetMapping(value = "/allCategories")
    @ResponseBody
    public ResponseEntity getAllCategories(){
        try {
            List<Category> categories = postService.getAllCategories();
            return ResponseEntity.ok(categories);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
        }

    }



}
