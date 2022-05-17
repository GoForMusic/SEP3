using Entities.Contracts;
using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImpl;

public class ReportDAOImpl : IReportService
{

    private readonly DbAccess _context;

    public ReportDAOImpl(DbAccess context)
    {
        _context = context;
    }

    public async Task<bool> AddReport(Report report)
    {
      
        try
        {
            Console.WriteLine(report.Reason);
            
            Console.WriteLine(report.Post.Id + "    " + report.User.Username + "   " + report.Reason);
          var  returnedReport = await _context.Reports.AddAsync(report);
            await _context.SaveChangesAsync();
            if (returnedReport == null )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw new Exception("Report Cannot be added");
        }

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
            return await _context.Reports.Include(t => t.Post).Include(t => t.User).ToListAsync();
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }
    }
}