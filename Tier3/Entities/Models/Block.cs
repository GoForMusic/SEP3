using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Entities.Models;

public class Block {

   
    [ForeignKey(nameof(User))]
    public string Username { get; set; }
    public User User { get; set; }
    public string Reason { get; set; }
}