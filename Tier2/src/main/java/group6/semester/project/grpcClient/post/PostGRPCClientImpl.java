package group6.semester.project.grpcClient.post;

import GRPCService.CategoryGrpc;
import GRPCService.CategoryOuterClass;
import GRPCService.PostGrpc;
import GRPCService.PostOuterClass;
import group6.semester.project.grpcClient.ConvertGrpc;
import group6.semester.project.grpcClient.ManagedChannelGetter;
import group6.semester.project.model.Category;
import group6.semester.project.model.Post;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

import static group6.semester.project.grpcClient.ConvertGrpc.getPostFromGrpcPost;

@Service
public class PostGRPCClientImpl implements PostClient {

    private PostGrpc.PostBlockingStub postBlockingStub;
    private CategoryGrpc.CategoryBlockingStub categoryBlockingStub;

    /**
     * > If the postBlockingStub is null, create a new ManagedChannel and use it to create a new postBlockingStub
     *
     * @return A blocking stub for the Post service.
     */
    private PostGrpc.PostBlockingStub getPostBlockingStub() {
        if (postBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelGetter.getManagedChannel();
            postBlockingStub = PostGrpc.newBlockingStub(managedChannel);
        }
        return postBlockingStub;
    }

    private CategoryGrpc.CategoryBlockingStub getCategoryBlockingStub() {
        if (categoryBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelGetter.getManagedChannel();
            categoryBlockingStub = CategoryGrpc.newBlockingStub(managedChannel);
        }
        return categoryBlockingStub;
    }

    /**
     * The function takes a Post object and a subCategoryId as parameters, converts the Post object to a grpc Post object,
     * creates a grpc IdWithInteger object with the subCategoryId, creates a grpc TransferPostWithSubcategoryId object with
     * the grpc Post object and the grpc IdWithInteger object, and then calls the addPost function on the grpc stub
     *
     * @param post The post object that we want to add to the database.
     * @param subCategoryId The id of the subcategory to which the post is to be added.
     * @return A Post object.
     */
    @Override
    public Post addPost(Post post, int subCategoryId) {
        PostOuterClass.PostObj postObj = ConvertGrpc.getGrpcPostFromOurPost(post);
        PostOuterClass.IdWithInteger id = PostOuterClass.IdWithInteger.newBuilder().setId(subCategoryId).build();

        PostOuterClass.TransferPostWithSubcategoryId transferPostWithSubcategoryId = PostOuterClass.TransferPostWithSubcategoryId.newBuilder().setPostObj(postObj).setIdWithInteger(id).build();
        PostOuterClass.PostObj postObj1 = null;
        try {
            System.out.println("At the add post");
            postObj1 = getPostBlockingStub().addPost(transferPostWithSubcategoryId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            disposeStub();
        }
        return getPostFromGrpcPost(postObj1);
    }

    /**
     * The function gets all the categories from the server and returns them to the client
     *
     * @return A list of Category objects.
     */
    @Override
    public List<Category> getAllCategories() {
        CategoryOuterClass.ListOfCategoryObj listOfCategoryObj = null;
        try {
            listOfCategoryObj = getCategoryBlockingStub().getAllCategories(CategoryOuterClass.Empty.newBuilder().build());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            disposeStub();
        }
        List<CategoryOuterClass.CategoryObj> allCategoriesList = listOfCategoryObj.getAllCategoriesList();
        List<Category> categories = ConvertGrpc.getListOfCategoryFromCategory(allCategoriesList);
        return categories;
    }

    /**
     * > It sets the stubs to null
     */
    private void disposeStub() {
        postBlockingStub = null;
        categoryBlockingStub = null;
    }


}
