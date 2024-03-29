package group6.semester.project.grpcClient.fileUpload;

import GRPCService.Image;
import GRPCService.imageGrpc;
import com.google.protobuf.ByteString;
import group6.semester.project.grpcClient.ManagedChannelGetter;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@Service
public class ImageGrpcImpl
{

  private imageGrpc.imageStub imageStub;
  private StreamObserver<Image.FileUploadRequest> streamObserver;

  private ManagedChannel managedChannel;

  private imageGrpc.imageStub getImageStub() {
    if (imageStub == null) {
      managedChannel = ManagedChannelGetter.getManagedChannel();
      imageStub = imageGrpc.newStub(managedChannel);
    }
    return imageStub;
  }

  public StreamObserver<Image.FileUploadRequest> getStreamObserver()
  {
    if (streamObserver == null){
      streamObserver =  getImageStub().upload(new FileUploadObserver());
    }
    return streamObserver;

  }

  public void uploadImage(MultipartFile file,int id) throws IOException {

    try
    {
      String filename = file.getOriginalFilename();
      String type = filename.substring(filename.lastIndexOf(".") + 1);
      Image.FileUploadRequest metadata = Image.FileUploadRequest.newBuilder().setMetadata(
          Image.MetaData.newBuilder().setName(String.valueOf(id)).setType(type).build()).build();
      getStreamObserver().onNext(metadata);
      System.out.println("Adding image");

      // upload file as a chunk
      ;

      InputStream inputStream = new BufferedInputStream(file.getInputStream());
      byte[] bytes = new byte[4096];
      int size;
      while ((size = inputStream.read(bytes)) > 0)
      {
        Image.FileUploadRequest uploadRequest = Image.FileUploadRequest.newBuilder()
            .setFile(Image.FileObj.newBuilder()
                .setContent(ByteString.copyFrom(bytes, 0, size)).build()).build();
        getStreamObserver().onNext(uploadRequest);
      }
      // close the stream
      inputStream.close();

      System.out.println("On completed call for image upload");
    }
    catch (IOException e)
    {
      throw new IOException("Could not add message");
    } getStreamObserver().onCompleted();
    disposeStub();

  }
  private class FileUploadObserver implements StreamObserver<Image.FileUploadResponse>
  {
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
  private void disposeStub() {
    imageStub = null;
    streamObserver = null;
  }
}

