using System.ComponentModel.DataAnnotations;

namespace Entities.Models;

public class Rating
{
    public User? rateUser, ratedUSer;
    public int score;
}