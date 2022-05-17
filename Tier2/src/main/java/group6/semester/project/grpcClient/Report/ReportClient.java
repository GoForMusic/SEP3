package group6.semester.project.grpcClient.Report;

import group6.semester.project.model.Report;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportClient {
    void AddReport(Report report) throws Exception;
    void RemoveReport(Report report);

    List<Report> getReports();

}
