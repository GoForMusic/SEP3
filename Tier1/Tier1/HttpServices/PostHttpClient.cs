using System.Net.Http.Headers;
using System.Text.Json;
using Contracts;
using Entities.Models;

namespace HttpServices; 

public class PostHttpClient : IPostService {
    public async Task<Post> AddPostAsync(int subCategoryId, Post postToAdd,Stream file) {
        try {
            string client =await ClientAPI.getContent(Methods.Post, "/post/" +subCategoryId, postToAdd);
            Post postFromServer = GetDeserialized<Post>(client);
            
            
            
            using (var httpClient = new HttpClient())
            {
                using (var form = new MultipartFormDataContent())
                {
                    await using (var fs =file)
                    {
                        using (var streamContent = new StreamContent(fs))
                        {
                            using (var fileContent = new ByteArrayContent(await streamContent.ReadAsByteArrayAsync()))
                            {
                              
                                fileContent.Headers.ContentType = MediaTypeHeaderValue.Parse("multipart/form-data");
                                string fileName = postFromServer.Writer.Username + "_" + postFromServer.Id;
                                // "file" parameter name should be the same as the server side input parameter name
                                form.Add(fileContent, "file",fileName);
                                Uri uri = new Uri($"http://localhost:8080/{postFromServer.Id}/uploadImage/");
                                HttpResponseMessage response = await httpClient.PostAsync(uri, form);
                            }
                        }
                    }
                }
            }
            return postFromServer;
        }
        catch (Exception e) {
            throw new Exception(e.Message + " " + e.StackTrace);
        }

    }

    public async Task<List<Category>> GetALlCategoriesAsync() {
        try {
            string client = await ClientAPI.getContent(Methods.Get, "/allCategories");
            List<Category> list = GetDeserialized<List<Category>>(client);
            return list;
        }
        catch (Exception e) {
            throw new Exception(e.Message);
        }

    }

    public async Task<List<Post>> GetPostsByName(string name)
    {
        try {
            string client = await ClientAPI.getContent(Methods.Get, $"/post/{name}");
            List<Post> list = GetDeserialized<List<Post>>(client);
            return list;
        }
        catch (Exception e) {
            throw new Exception(e.Message);
        }
    }

    public async Task<List<Post>> GetAllPosts()
    {
        try {
            string client = await ClientAPI.getContent(Methods.Get, $"/post");
            List<Post> list = GetDeserialized<List<Post>>(client);
            return list;
        }
        catch (Exception e) {
            throw new Exception(e.Message);
        }
    }

    private T GetDeserialized<T>(string jsonFormat) {
        T obj = JsonSerializer.Deserialize<T>(jsonFormat, new JsonSerializerOptions() {
            PropertyNameCaseInsensitive = true
        }) !;
        return obj;
    }
}