package group6.semester.project.services.SericeImpl;

import group6.semester.project.controller.RatingController;
import group6.semester.project.grpcClient.Rating.RatingClient;
import group6.semester.project.model.Rating;
import group6.semester.project.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {

    public RatingServiceImpl(RatingClient ratingClient) {
        this.ratingClient = ratingClient;
    }

    private RatingClient ratingClient;

    @Override
    public Rating addRate(Rating rating) {
        return ratingClient.addRating(rating);
    }
}
