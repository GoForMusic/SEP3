package group6.semester.project.controller;

import group6.semester.project.model.Report;
import group6.semester.project.services.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportController  {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @DeleteMapping(value = "/Reports/{PostId}/{reason}/{UserId}")
    public ResponseEntity RemoveReport(@PathVariable int postId, @PathVariable String reason, @PathVariable int UserId){
        try{
            Report report = new Report();
            reportService.RemoveReport(report);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping(value = "/Reports/getAllReports")
    public ResponseEntity<List<Report>> getAllReports(){
        var temp = reportService.getReports();
        return ResponseEntity.ok(temp);
    }

    @PostMapping("/AddReport")
    public ResponseEntity addReport(@RequestBody Report report){
        try
        {
            System.out.println(report.getReporter().getUsername() + "Wants to report " +report.getReason());
            reportService.AddReport(report);
            return ResponseEntity.ok("Report Added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity("Report could not be added",HttpStatus.BAD_REQUEST);
        }
    }
}
