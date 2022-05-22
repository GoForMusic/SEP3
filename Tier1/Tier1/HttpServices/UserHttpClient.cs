using System.Text.Json;
using Contracts;
using Entities.Models;

namespace HttpServices;

public class UserHttpClient : IUserService {
    public async Task<User> CreateUserAsync(User user) {
        string client = await ClientAPI.getContent(Methods.Post, "/user", user);
        return GetDeserialized<User>(client);
    }

    public async Task<User> GetUserAsync(string username) {
        string content = await ClientAPI.getContent(Methods.Get, $"/user/{username}");

        return GetDeserialized<User>(content);
    }

    public async Task<User> GetUserLogin(string username, string password) {
        string content = await ClientAPI.getContent(Methods.Get, $"/user/{username}/{password}");


        return GetDeserialized<User>(content);
    }

    public Task DeleteUser(string id) {
        throw new NotImplementedException();
    }

    public Task Update(User user) {
        throw new NotImplementedException();
    }

    public Task<User> GetUserById(string id) {
        throw new NotImplementedException();
    }

    public async Task<User> BlockUser(Block block) {
        string content = await ClientAPI.getContent(Methods.Patch, $"/blockUser",block);
        User user = GetDeserialized<User>(content);
        return user;
    }

    public async Task<User> UnblockUser(string username) {
        string content = await ClientAPI.getContent(Methods.Patch, $"/unBlockUser/{username}");
        User user = GetDeserialized<User>(content);
        return user;
    }

    public Task<List<Block>?> GetAllBlockedUsers() {


        throw new NotImplementedException();
    }


    private T GetDeserialized<T>(string jsonFormat) {
        T obj = JsonSerializer.Deserialize<T>(jsonFormat, new JsonSerializerOptions() {
            PropertyNameCaseInsensitive = true
        }) !;
        return obj;
    }
}