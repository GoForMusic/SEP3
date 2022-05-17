namespace Entities.Models; 

public class Report {
    public int  PostId { get; set; }
    public int UserId { get; set; }
    public string reason { get; set; }
    public int reportId { get; set; }
}