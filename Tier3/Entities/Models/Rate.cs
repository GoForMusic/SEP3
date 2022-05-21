using System.ComponentModel.DataAnnotations.Schema;

namespace Entities.Models; 

public class Rate {
    // Following two props are just for EFC use
    [ForeignKey(nameof(RatingUser))]
    public string RatingUsername { get; set; }
    public User RatingUser { get; set; }
         
    [ForeignKey(nameof(RatedUser))]
    public string  RatedUsername { get; set; }
    public User RatedUser { get; set; }
    public int Score { get; set; }
    
}