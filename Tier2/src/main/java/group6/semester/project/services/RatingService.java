package group6.semester.project.services;

import group6.semester.project.model.Rating;
import org.springframework.stereotype.Service;

@Service
public interface RatingService {

    Rating addRate(Rating rating);
}
