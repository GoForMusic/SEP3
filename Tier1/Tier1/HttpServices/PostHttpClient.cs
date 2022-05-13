using System.Net;
using System.Net.Http.Headers;
using System.Net.Mime;
using System.Runtime.InteropServices;
using System.Text;
using System.Text.Json;
using Contracts;
using Entities.Models;
using Microsoft.AspNetCore.Components.Forms;

using Microsoft.Extensions.Primitives;

namespace HttpServices;

public class PostHttpClient : IPostService
{
   /** public async Task<Post> AddPostAsync(int subCategoryId, Post postToAdd)
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

    **/
    
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
                httpClient.Dispose();
                
                return responseMessageDes.ToString();
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

    public async Task<Post> AddPostAsync(int subCategoryId, Post postToAdd,[Optional]MultipartFormDataContent form )
    {
        string content = string.Empty;
        Post post = new Post();
        MultipartFormDataContent? formDataContent = form;
      
        try
        {
            using (var httpClient = new HttpClient())
            {
                httpClient.DefaultRequestHeaders.Add("Authentification", "abc123");
                Uri uri = new Uri("http://localhost:8080/post/" + subCategoryId);

                StringContent stringContent = new(JsonSerializer.Serialize(postToAdd, new JsonSerializerOptions()
                {
                    PropertyNameCaseInsensitive = true,
                    PropertyNamingPolicy = JsonNamingPolicy.CamelCase
                }), Encoding.UTF8, "application/json");
                HttpResponseMessage responseMessage =
                    await httpClient.PostAsync(uri, stringContent);

                 content = await responseMessage.Content.ReadAsStringAsync();
                 post =  GetDeserialized<Post>(content);
            }
            //For adding image

                
            if (formDataContent != null)
            {
                Console.WriteLine("Ading image post ");
                Console.WriteLine(form.Headers.ToString());
                
                using var httpClient1 = new HttpClient();
                httpClient1.DefaultRequestHeaders.Add("Authentification","abc123");
                Console.WriteLine(post.Id);
                HttpResponseMessage responseForImage =
                    await httpClient1.PostAsync($"http://localhost:8080/uploadImage/{post.Id}", formDataContent);
            }




              
       
            return post;
                
            
        }
        catch (Exception e)
        {
            
            throw new Exception(e.Message + " " + e.StackTrace);
          
        }
    }
    
    

}


    
    
