using Contracts;
using Entities.Models;
using HttpServices;
using NUnit.Framework;

namespace UNITtests;

public class UserJUnit
{
    protected IUserService _userService;

    [SetUp]
    public virtual void Setup()
    {
        _userService = new UserHttpClient();
    }
    
    [Test, Order(1)]
    public async virtual Task TestUserLoginSuccess()
    {
        Assert.AreEqual( _userService.GetUserLogin("adrian1234", "Test1234").Result.Username,"adrian1234");
    }

    [Test]
    public async virtual Task TestUserLoginUnSuccessWithWrongUsername()
    { 
        Assert.ThrowsAsync<Exception>((async () => await _userService.GetUserLogin("adrian123","Test1234")));
    }
    
    [Test]
    public async virtual Task TestUserLoginUnSuccessWithWrongPassword()
    { 
        Assert.ThrowsAsync<Exception>((async () => await _userService.GetUserLogin("adrian1234","Test123")));
    }

    [Test]
    public async virtual Task RegisterUserExist()
    {
        Assert.ThrowsAsync<Exception>((async () => await _userService.CreateUserAsync(new User()
        {
            Username = "adrian1234",
            Password = "Test1234"
        })));
    }
    
    [Test]
    public async virtual Task GetUserIncorectUsername()
    {
        Assert.ThrowsAsync<Exception>((async () => await _userService.GetUserAsync("abcdergg")));
    }

    [Test]
    public async virtual Task RegisterUserPasswordFormat()
    {
        //username cannot be empty
        //password cannot be empty
        //username must have 6 characters
        //password must have 6 characters
        //password must have one upper case
        //password must contain numbers
        //username must contain numbers
        Assert.ThrowsAsync<Exception>((async () => await _userService.CreateUserAsync(new User()
        {
            Username = "",
            Password = ""
        })));
    }
    
}
