using Entities.Models;

namespace Contracts;

public interface IReportService
{
    Task AddReport(Report report);
    Task RemoveReport(Report report);
    Task<List<Report>> GetAllReports();

}