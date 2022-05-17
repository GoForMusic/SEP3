using Entities.Contracts;
using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImpl;

public class ReportDAOImpl : IReportService
{
    private DbAccess _context;
    public ReportDAOImpl(DbAccess context)
    {
        _context = context;
    }

    
    public Task<Report> AddReport(Report report)
    {
        throw new NotImplementedException();
    }

    public async Task<Report> RemoveReport(Report report)
    {
        try
        {
            Report reports = await _context.Reports.FirstAsync(t =>
                t.PostId.Equals(report.Post.Id) && t.ReporterUsername.Equals(report.User.Username));
            _context.Reports.Remove(reports);
            await _context.SaveChangesAsync();
            return reports;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }
        
    }

    public async Task<List<Report>> getReports()
    {
        try
        {
            List<Report> x =  await _context.Reports.Include(t => t.Post).Include(t => t.User).ToListAsync();
            Console.WriteLine(x[0].Post.Id);
            return x;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }
         
    }
}