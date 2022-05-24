﻿using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Threading.Tasks;
using Entities.Contracts;
using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImpl;

public class PostDAOImpl : IPostService {
    private readonly DbAccess _context;

    public PostDAOImpl(DbAccess context) {
        _context = context;
    }


    public async Task<Post> AddPost(int subCategoryId, Post post) {
        var subcategory = await _context.Subcategories.FindAsync(subCategoryId);
        var user = await _context.Users.FindAsync(post.Writer.Username);

        post.Writer = user!;
        post.Subcategory = subcategory!;

        var entityEntry = await _context.Posts.AddAsync(post);
        await _context.SaveChangesAsync();
        return entityEntry.Entity;
    }

    public Task<List<Category>> GetAllCategories() {
        return Task.FromResult(_context.Categories.Include(category => category.Subcategories)
            .ToList());
    }

    public async Task<List<Post>> GetAllPostsByUsername(string userName) {
        return await _context.Posts.Where(post => post.Writer!.Username.Equals(userName)).Include(post => post.Writer)
            .Include(post => post.Images).ToListAsync();
    }


    public async Task<List<Post>> GetAllPost(int current) {
        int count = 9;
        return await _context.Posts.Include(t => t.Images).Include(t => t.Writer)
            .OrderByDescending(post => post.DateCreated).Skip((current - 1) * count).Take(count).ToListAsync();
    }

    public async Task<List<Post>> SearchPosts(string titleToSearch, int current) {
        int count = 9;
        return await _context.Posts.Include(post => post.Images).Include(post => post.Writer)
            .Where(post => post.Title.Contains(titleToSearch))
            .OrderByDescending(post => post.DateCreated)
            .Skip((current - 1) * count).Take(count).ToListAsync();
    }

    public async Task<Post> GetPostDetails(int id) {
        var post = await _context.Posts.Include(post => post.Images)
            .Include(post => post.Writer!)
            .Include(post => post.Comments!)
            .ThenInclude(comment => comment.Writer).FirstAsync(post => post.Id == id);
        return post;
    }

    public async Task<List<Post>> GetPostsBySubcategoryId(int subcategoryId, int current) {
        var findAsync = await _context.Subcategories.Include(subcategory => subcategory.Posts)
            .ThenInclude(posts => posts.Images)
            .Include(subcategory => subcategory.Posts)
            .ThenInclude(post => post.Writer).FirstAsync(subcategory => subcategory.Id == subcategoryId);

        return findAsync.Posts.ToList();
    }

    //To get the id for image and creating href according to it 
    public async Task<string> AddImage(int postId) {
        Image image = new Image();
        var imageId = await _context.Images.AddAsync(image);
        return imageId.Entity.Id.ToString();
    }

    public async Task<int> GetTotalNumberOfPosts(string username) {
        return await _context.Posts.Where(post => post.Writer!.Username.Equals(username)).CountAsync();
    }

    public async Task RemovePostById(int requestPostId)
    {
        var itemToRemove = _context.Posts.SingleOrDefaultAsync(post => post.Id == requestPostId).Result; 

        if (itemToRemove != null) {
            _context.Posts.Remove(itemToRemove);
            await _context.SaveChangesAsync();
        }
    }
}