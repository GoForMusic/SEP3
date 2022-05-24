
using Entities.Models;

namespace Entities.Contracts; 

public interface IBlockService {
    Task<User> BlockUser(Block block);
    Task<User> UnBlockUser(string requestUserName);
    Task<List<Block>> GetALlBlockedUsers();
}