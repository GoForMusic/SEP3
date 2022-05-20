package group6.semester.project.grpcClient.Rating;

import group6.semester.project.model.Rating;
import org.springframework.stereotype.Service;

@Service
public interface RatingClient {

    Rating addRating(Rating rating);

}
