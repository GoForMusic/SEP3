using System.Net;
using System.Net.Http.Headers;
using System.Net.Mime;
using System.Text.Json;
using Contracts;
using Entities.Models;
using Microsoft.AspNetCore.Components.Forms;

using Microsoft.Extensions.Primitives;

namespace HttpServices;

public class PostHttpClient : IPostService
{
    public async Task<Post> AddPostAsync(int subCategoryId, Post postToAdd)
    {
        try
        {
            string client = await ClientAPI.getContent(Methods.Post, "/post/" + subCategoryId, postToAdd);
            Post postFromServer = GetDeserialized<Post>(client);
            return postFromServer;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message + " " + e.StackTrace);
        }

    }

    
    
    public async Task<string> AddImage(MultipartFormDataContent form)
    {
        try
        {
            Console.WriteLine("Inside add image http client");
            using (var httpClient = new HttpClient())
            {
                httpClient.DefaultRequestHeaders.Add("Authentification","abc123");
                HttpResponseMessage responseMessage =
                    await httpClient.PostAsync("http://localhost:8080/uploadImage", form);
                string responseMessageDes = GetDeserialized<string>(responseMessage.ToString());
                return responseMessageDes;
            }
        }
        catch (Exception e)
        {
            throw new Exception(e.Message + "Could not add image");
        }
    }


    public async Task<List<Category>> GetALlCategoriesAsync()
    {
        try
        {
            string client = await ClientAPI.getContent(Methods.Get, "/allCategories");
            List<Category> list = GetDeserialized<List<Category>>(client);
            return list;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }

    }

    public async Task<List<Post>> GetPostsByName(string name)
    {
        try
        {
            string client = await ClientAPI.getContent(Methods.Get, $"/post/{name}");
            List<Post> list = GetDeserialized<List<Post>>(client);
            return list;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }
    }

    public async Task<List<Post>> GetAllPosts()
    {
        try
        {
            string client = await ClientAPI.getContent(Methods.Get, $"/post");
            List<Post> list = GetDeserialized<List<Post>>(client);
            return list;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }
    }

    private T GetDeserialized<T>(string jsonFormat)
    {
        T obj = JsonSerializer.Deserialize<T>(jsonFormat, new JsonSerializerOptions()
        {
            PropertyNameCaseInsensitive = true
        }) !;
        return obj;
    }


}


    
    
