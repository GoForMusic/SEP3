using Entities.Models;

namespace Entities.Contracts;

public interface IReportService
{
    Task<Report> AddReport(Report report);
    Task<Report> RemoveReport(Report report);
    Task<List<Report>> getReports();
}