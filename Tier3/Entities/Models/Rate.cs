using System.ComponentModel.DataAnnotations.Schema;

namespace Entities.Models;

public class Rate
{
     // Following two props are just for EFC use
     [ForeignKey(nameof(User))]
     public string rateUsername { get; set; }
     [ForeignKey(nameof(User))]
     public string  ratedUsername { get; set; }
     public User rateUser; 
     public User ratedUser;
     public int score;
}