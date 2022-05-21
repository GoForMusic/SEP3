using Entities.Contracts;
using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImpl;

public class BlockDAOImpl : IBlockService {
    private readonly DbAccess _context;

    public BlockDAOImpl(DbAccess context) {
        _context = context;
    }


    public async Task<User> BlockUser(Block block) {
        User? user = await _context.Users.FirstOrDefaultAsync(user1 => user1.Username.Equals(block.Username));
        Block blockToSave = new Block() {
            Reason = block.Reason,
            User = user!
        };
        await _context.Blocks.AddAsync(blockToSave);
        await _context.SaveChangesAsync();
        return user!;
    }

    public async Task<User> UnBlockUser(string requestUserName) {

        User? user = await _context.Users.FirstOrDefaultAsync(user1 => user1.Username.Equals(requestUserName));
        Block? block = await _context.Blocks.FirstOrDefaultAsync(block1 => block1.Username.Equals(requestUserName));
        _context.Blocks.Remove(block!);
        await _context.SaveChangesAsync();
        return user!;
    }

    public async Task<List<Block>> GetALlBlockedUsers() {
        return await _context.Blocks.ToListAsync();
    }
}