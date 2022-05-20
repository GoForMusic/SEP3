package group6.semester.project.controller;

import group6.semester.project.model.Rating;
import group6.semester.project.services.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping(value = "/rating")
    public ResponseEntity addRating(@RequestBody Rating rating){
        try{
            System.out.println(rating);
            Rating addedRating = ratingService.addRate(rating);
            return ResponseEntity.ok(addedRating);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
}
