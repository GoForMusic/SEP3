using System.Text.Json;

namespace HttpServices;
using Contracts;
using Entities.Models;

public class ReportHttpClient : IReportService
{
    public async Task<Report> AddReport(Post postId, User userId, string reason)
    {
        
            try
            {
                string client = await ClientAPI.getContent(Methods.Post, $"/Reports/{postId}");
                Report report = JsonSerializer.Deserialize<Report>(client, new JsonSerializerOptions
                {
                    PropertyNameCaseInsensitive = true
                })!;
                return report;
            }
            catch (Exception e)
            {
                throw new Exception(e.Message);
            }
        

    }

    public Task<Report> DeleteReport(int Id)
    {
        throw new NotImplementedException();
    }

    public Task<ICollection<Report>> GetAllReports()
    {
        throw new NotImplementedException();
    }
}