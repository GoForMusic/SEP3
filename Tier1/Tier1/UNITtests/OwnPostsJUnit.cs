using System.Collections.Specialized;
using Contracts;
using Entities.Models;
using HttpServices;

using NUnit.Framework;
namespace UNITtests;

public class OwnPostsJUnit
{
    protected IUserService _userService;
    protected IPostService _postService;

    [SetUp]
    public virtual void Setup()
    {
        _userService = new UserHttpClient();
        _postService = new PostHttpClient();
    }


    [Test]
    public virtual async Task TestOwnPosts()
    {
        try
        {
            List<Post> listOfOwnedPosts = await _postService.GetAllPostsByUsername("caticu1");
            
            Console.WriteLine("------------");
            foreach (var item in listOfOwnedPosts)
            {
                Console.WriteLine(item.Writer);
            }
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }
        
    }
}