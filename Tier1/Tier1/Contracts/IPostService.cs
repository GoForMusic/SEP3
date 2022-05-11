using Entities.Models;
using Microsoft.AspNetCore.Components.Forms;
namespace Contracts; 

public interface IPostService {
    Task<Post> AddPostAsync(int subCategoryId, Post postToAdd);


    Task<List<Category>> GetALlCategoriesAsync();

    Task<List<Post>> GetPostsByName(string name);
    Task<List<Post>> GetAllPosts();
}