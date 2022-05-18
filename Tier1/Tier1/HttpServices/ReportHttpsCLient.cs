using System.Text.Json;
using Contracts;
using Entities.Models;

namespace HttpServices;

public class ReportHttpsCLient : IReportService
{
    public Task AddReport(Report report)
    {
        throw new NotImplementedException();
    }

    public async Task RemoveReport(Report report)
    {

        try
        {
            var temp = await ClientAPI.getContent(Methods.Delete,
                $"/Reports/{report.PostId}/{report.ReporterUsername}");
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }
           
    }

    public async Task<List<Report>> GetAllReports()
    {
        try
        {
            var temp = await ClientAPI.getContent(Methods.Get, $"/allReports");
            List<Report> report = GetDeserialized<List<Report>>(temp);
             Console.WriteLine("Reports ----------------");
            report.ForEach(Console.WriteLine);
            return report;
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