using Contracts;
using Entities.Models;
using HttpServices;

namespace UNITtests;
using NUnit.Framework;

public class RateJUnit
{
    protected IRateService _rateService;
    protected IUserService _userService;

    [SetUp]
    public virtual void Setup()
    {
        _rateService = new RatingHttpClient();
        _userService = new UserHttpClient();
    }

    [Test]
    public async Task AddRate()
    {
        try
        {
            var a = await _userService.GetUserAsync("adrian1234");
            var b = await _userService.GetUserAsync("sachin123");
            Rating send = new Rating()
            {
                rateUser = a,
                ratedUSer = b,
                score = 5
            };
            Rating r = await _rateService.AddRating(send);
            Console.WriteLine(r.rateUser + " " + r.ratedUSer + " " + r.score);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message + e.StackTrace);
        }
        
    }

}