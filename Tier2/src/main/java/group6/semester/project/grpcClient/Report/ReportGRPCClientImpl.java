package group6.semester.project.grpcClient.Report;

import GRPCService.ReportGrpc;
import GRPCService.ReportOuterClass;
import group6.semester.project.grpcClient.ConvertGrpc;
import group6.semester.project.grpcClient.ManagedChannelGetter;
import group6.semester.project.model.Report;
import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;

import java.security.cert.Extension;
import java.util.List;

@Service
public class ReportGRPCClientImpl implements ReportClient {

    private ReportGrpc.ReportBlockingStub reportBlockingStub;

    private ReportGrpc.ReportBlockingStub getReportBlockingStub() {
        if (reportBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelGetter.getManagedChannel();
            reportBlockingStub = ReportGrpc.newBlockingStub(managedChannel);
        }
        return reportBlockingStub;
    }

    @Override
    public void AddReport(Report report) {
        try {
            ReportOuterClass.ReportObj reportObj = ConvertGrpc.getGrpcReportFromReport(report);
           // ReportOuterClass.EmptyReportMark message = getReportBlockingStub().addReport(reportObj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            disposeStub();
        }
    }

    @Override
    public void RemoveReport(Report report) {

        try {
            ReportOuterClass.ReportObj obj = ConvertGrpc.getGrpcReportFromReport(report);
            ReportOuterClass.EmptyReportMark message = null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            disposeStub();
        }

    }

    @Override
    public List<Report> getReports() {
        try {
            ReportOuterClass.EmptyReportMark message = ReportOuterClass.EmptyReportMark.newBuilder().build();
            ReportOuterClass.ListOfReports obj = getReportBlockingStub().getReports(message);
            return ConvertGrpc.getListOfReporstFromListOfGrpcReportObject(obj.getReportObjList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            disposeStub();
        }
    }

    private void disposeStub() {
        reportBlockingStub = null;
    }


}
