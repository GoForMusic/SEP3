package group6.semester.project.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Rating {

    private User rateUser;
    private User ratedUser;
    private int score;

}
