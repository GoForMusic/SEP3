package group6.semester.project.controller;

import group6.semester.project.model.Category;
import group6.semester.project.model.Post;
import group6.semester.project.services.PostService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

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


    // Upload image
    @PostMapping("/uploadImage/{postId}")
    public ResponseEntity uploadImage(@RequestBody()MultipartFile file,@PathVariable int postId) throws IOException {
        System.out.println("Adding image for post " + postId );
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getName());
        System.out.println(file.getContentType());
        System.out.println(file.getSize());


        String pathdirectory = new ClassPathResource("").getFile().getAbsolutePath();
        Files.copy(file.getInputStream(), Paths.get(pathdirectory+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        postService.addImage(file);
        // return file;
       return ResponseEntity.ok("Done");

    }



}
