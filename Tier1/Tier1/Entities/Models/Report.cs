namespace Entities.Models; 

public class Report {
    public Post  Post { get; set; }
    public User Reporter { get; set; }
    public string Reason { get; set; }


    public Report()
    {
    }
}