package group6.semester.project.grpcClient.fileUpload;

import GRPCService.Image;
import io.grpc.stub.StreamObserver;

public class FileUploadObserver implements StreamObserver<Image.FileUploadResponse> {
    @Override
    public void onNext(Image.FileUploadResponse fileUploadResponse) {
        System.out.println("File upload status ::"+fileUploadResponse.getStatus());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }
}
