package group6.semester.project.services;

import group6.semester.project.model.Report;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    void AddReport(Report report);
    void RemoveReport (Report report);
    List<Report> getReports();


}
