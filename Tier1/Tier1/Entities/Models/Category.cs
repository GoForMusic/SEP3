﻿
namespace Entities.Models; 

public class Category {
    
    public int Id { get; set; }

    public string Name { get; set; }
    public ICollection<Subcategory> Subcategories { get; set; }

}