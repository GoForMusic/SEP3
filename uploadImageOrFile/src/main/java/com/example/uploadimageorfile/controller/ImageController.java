package com.example.uploadimageorfile.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
public class ImageController {


    @PostMapping("/upload-Image")
    public String uploadImage(@RequestBody()MultipartFile file) throws IOException {

        System.out.println(file.getOriginalFilename());
     System.out.println(file.getName());
        System.out.println(file.getContentType());
        System.out.println(file.getSize());


        String pathdirectory = new ClassPathResource("static/image").getFile().getAbsolutePath();
        Files.copy(file.getInputStream(), Paths.get(pathdirectory+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);

       // return file;
        return "Image is successfully uploaded";

    }


    @PostMapping("/test")
    public ResponseEntity<String> testFile(@RequestBody()String hi) throws IOException {

        System.out.println(hi);
        return ResponseEntity.ok().body(hi);


    }
}
