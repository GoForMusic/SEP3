using Entities.Models;

namespace Entities.Contracts;

public interface IRatingService
{
    Task<Rate> AddRate(Rate rate);
}