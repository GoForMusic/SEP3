using Entities.Models;

namespace Contracts;

public interface IUserService {
    Task<User> CreateUserAsync(User user);
    Task<User> GetUserAsync(string username);
    Task<User> GetUserLogin(string username, string password);
    Task DeleteUser(string id);

    Task Update(User user);
    Task<User> GetUserById(string id);

    Task<User> BlockUser(Block block);

    Task<User> UnblockUser(string username);
    Task<List<Block>?> GetAllBlockedUsers();
}