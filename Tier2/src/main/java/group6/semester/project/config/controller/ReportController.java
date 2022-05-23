package group6.semester.project.config.controller;

import group6.semester.project.model.Report;
import group6.semester.project.services.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
public class ReportController {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @DeleteMapping(value = "/Reports/{postId}/{reporterUsername}")
    public ResponseEntity removeReport(@PathVariable int postId, @PathVariable String reporterUsername) {
        try {
            Report report = new Report();
            report.setReporterUsername(reporterUsername);
            report.setPostId(postId);
            reportService.RemoveReport(report);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping(value = "/allReports")
    public ResponseEntity getAllReports() {

        try {
            List<Report> temp = reportService.getReports();
            System.out.println("Tier 2------reports \n");
            temp.forEach(System.out::println);


            return ResponseEntity.ok(temp);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
        }

    }


    @PostMapping("/AddReport")
    public ResponseEntity addReport(@RequestBody Report report)
    {
        try
        {

            reportService.AddReport(report);
            return ResponseEntity.ok("Report Added");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return new ResponseEntity("Report could not be added", HttpStatus.BAD_REQUEST);
        }
    }
}
