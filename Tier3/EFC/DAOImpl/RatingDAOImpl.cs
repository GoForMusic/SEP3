using Entities.Contracts;
using Entities.Models;

namespace EFC.DAOImpl;

public class RatingDAOImpl : IRatingService{
    private readonly DbAccess _context;

    public RatingDAOImpl(DbAccess context)
    {
        _context = context;
    }

    
    public async Task<Rate> AddRate(Rate rate)
    {
        try
        {
            Console.WriteLine(rate.ratedUser+" "+rate.rateUser+" "+rate.score);
            //_context.Ratings.Add(rate);
            //await _context.SaveChangesAsync();
            return rate;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }

    }
}