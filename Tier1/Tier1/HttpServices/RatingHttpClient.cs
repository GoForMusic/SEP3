using System.Text.Json;
using Contracts;
using Entities.Models;

namespace HttpServices;

public class RatingHttpClient : IRateService
{
    public async Task<Rating> AddRating(Rating rating)
    {
        try
        {
            var content = await ClientAPI.getContent(Methods.Post, "/rating", rating);
            Rating deserialise = GetDeserialized<Rating>(content);
            return deserialise;
        }
        catch (Exception e)
        {
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