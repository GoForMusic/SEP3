package group6.semester.project.services.SericeImpl;

import group6.semester.project.grpcClient.Report.ReportClient;
import group6.semester.project.model.Report;
import group6.semester.project.services.ReportService;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ReportServiceImpl implements ReportService {

    private final ReportClient reportClient;


    public ReportServiceImpl(ReportClient reportClient) {
        this.reportClient = reportClient;
    }


    @Override
    public void AddReport(Report report) {

    }

    @Override
    public void RemoveReport(Report report) {
        try{
            reportClient.RemoveReport(report);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }


    }

    @Override
    public List<Report> getReports() {
        try{
            return reportClient.getReports();
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
