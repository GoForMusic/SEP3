using Contracts;
using Entities.Models;
using HttpServices;

namespace UNITtests;
using NUnit.Framework;

public class PostJUnit
{
    protected IPostService _postService;
    
    [SetUp]
    public virtual void Setup()
    {
        _postService = new PostHttpClient();
    }


    [Test]
    public virtual async Task GetPostDetails()
    {
        Assert.ThrowsAsync<Exception>((async () => await _postService.GetPostDetails(999999)));
    }
}