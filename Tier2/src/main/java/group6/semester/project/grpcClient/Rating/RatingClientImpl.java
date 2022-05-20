package group6.semester.project.grpcClient.Rating;

import GRPCService.BookmarkGrpc;
import GRPCService.RatingGrpc;
import GRPCService.RatingOuterClass;
import group6.semester.project.grpcClient.ConvertGrpc;
import group6.semester.project.grpcClient.ManagedChannelGetter;
import group6.semester.project.model.Rating;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingClientImpl implements RatingClient{


    private RatingGrpc.RatingBlockingStub ratingBlockingStub;


    private RatingGrpc.RatingBlockingStub getRatingBlockingStub() {
        if (ratingBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelGetter.getManagedChannel();
            ratingBlockingStub = RatingGrpc.newBlockingStub(managedChannel);
        }
        return ratingBlockingStub;
    }


    @Override
    public Rating addRating(Rating rating) {
        try{
            RatingOuterClass.RatingObj obj = ConvertGrpc.getGrpcRatingFromRating(rating);
            RatingOuterClass.RatingObj receive = ratingBlockingStub.addRating(obj);
            return ConvertGrpc.getRatingFromGrpcRating(receive);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());

        }finally {
            disposeStub();
        }
    }


    private void disposeStub() {
        ratingBlockingStub = null;
    }
}
