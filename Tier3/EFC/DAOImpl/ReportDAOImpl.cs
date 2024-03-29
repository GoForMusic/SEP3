﻿using Entities.Contracts;
using Entities.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace EFC.DAOImpl;

public class ReportDAOImpl : IReportService {
    private DbAccess _context;

    public ReportDAOImpl(DbAccess context) {
        _context = context;
    }




   public async Task<Report> AddReport(Report report)
   {
       try
       {
           Console.WriteLine(report.ToString());
           EntityEntry<Report> entityEntry = await _context.Reports.AddAsync(report);
          
           await _context.SaveChangesAsync();
           return entityEntry.Entity;
       }
       catch (Exception e) {
           throw new Exception(e.Message);
       }
   }

   public async Task<Report> RemoveReport(Report report) {
        try {
            
            Console.WriteLine("Remove report ENDGAME");
            Report reports = await _context.Reports.FirstAsync(t =>
                t.PostId==report.PostId && t.ReporterUsername.Equals(report.ReporterUsername));
            _context.Reports.Remove(reports);
            await _context.SaveChangesAsync();
            return reports;
        }
        catch (Exception e) {
            throw new Exception(e.Message);
        }
    }

    public async Task<List<Report>> getReports() {
        return await _context.Reports.ToListAsync();
    }
}