using Entities.Contracts;
using Google.Protobuf;
using Grpc.Core;

namespace GRPCService.ProtoImpl; 

public class ImageProtoImpl : image.imageBase {

    private IPostService _postService;

    public ImageProtoImpl(IPostService postService) {
        _postService = postService;
    }


    public override Task<FileUploadResponse> Upload(IAsyncStreamReader<FileUploadRequest> requestStream, ServerCallContext context) {
        FileUploadRequest uploadRequest = requestStream.Current;
        ByteString byteString = uploadRequest.File.Content;
        throw new NotImplementedException();
    }
}