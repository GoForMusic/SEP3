using Entities.Models;

namespace Entities.Contracts;

public interface IReportService
{
    Task<bool> AddReport(Report report);
    Task<Report> RemoveReport(Report report);
    Task<List<Report>> getReports();
}