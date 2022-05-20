using Entities.Models;

namespace Contracts;

public interface IRateService
{
    Task<Rating> AddRating(Rating rating);
    
}