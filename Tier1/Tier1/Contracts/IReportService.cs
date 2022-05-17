using Entities.Models;

namespace Contracts;

public interface IReportService
{
    Task<Report> AddReport(Post postId, User userId, string reason);
    Task<Report> DeleteReport(int Id);
    Task<ICollection<Report>> GetAllReports();
}