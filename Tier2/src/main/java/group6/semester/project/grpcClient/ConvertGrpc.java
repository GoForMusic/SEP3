/**
 * It converts objects from the gRPC service to our objects and vice versa
 */
package group6.semester.project.grpcClient;

import GRPCService.*;
import group6.semester.project.model.*;
import group6.semester.project.model.Comment;
import group6.semester.project.model.Image;
import group6.semester.project.model.Subcategory;

import java.util.ArrayList;
import java.util.List;

public class ConvertGrpc {

    /**
     * This function takes a User object and converts it into a GRPC UserObj object
     *
     * @param user The user object that we want to convert to a gRPC object.
     * @return A UserOuterClass.UserObj object
     */
    public static UserOuterClass.UserObj getGrpcUserFromUser(User user) {
        UserOuterClass.UserObj userObj = UserOuterClass.UserObj.newBuilder()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setPassword(user.getPassword())
                .setUsername(user.getUsername())
                .setRole(user.getRole())
                .build();
        return userObj;
    }

    /**
     * * Returns the gRPC user  object from user model obj
     *
     * @param userObj
     * @return
     */

    public static User getUserFromGrpcUser(UserOuterClass.UserObj userObj) {
        User user = new User();
        user.setFirstName(userObj.getFirstName());
        user.setLastName(userObj.getLastName());
        user.setPassword(userObj.getPassword());
        user.setUsername(userObj.getUsername());
        user.setRole(userObj.getRole());
        return user;
    }


    /**
     * It converts a grpc Post object to a Post object.
     *
     * @param postObj the post object from the gRPC server
     * @return A Post object
     */
    public static Post getPostFromGrpcPost(PostOuterClass.PostObj postObj) {
        Post post = new Post();
        Date date = new Date();
        date.setDay(postObj.getDateCreated().getDay());
        date.setMonth(postObj.getDateCreated().getMonth());
        date.setYear(postObj.getDateCreated().getYear());
        post.setId(postObj.getId());
        post.setAddress(postObj.getAddress());
        post.setCondition(postObj.getCondition());
        post.setPhoneNumber(postObj.getPhoneNumber());
        post.setDescription(postObj.getDescription());
        post.setEmail(postObj.getEmail());
        post.setWriter(getUserFromGrpcUser(postObj.getWriter()));
        post.setPrice(postObj.getPrice());
        post.setTitle(postObj.getTitle());
        post.setImages(getListOfImageFromListOfGrpcImages(postObj.getImagesList()));
        post.setDateCreated(date);
        if (postObj.getCommentsList() != null || !postObj.getCommentsList().isEmpty()) {
            post.setComments(getListOfCommentFromGrpcListOfComments(postObj.getCommentsList()));
        }

        return post;
    }

    /**
     * This function takes a Post object and returns a PostObj object
     *
     * @param post the post object that we want to convert to a grpc post object
     * @return A PostOuterClass.PostObj object.
     */
    public static PostOuterClass.PostObj getGrpcPostFromOurPost(Post post) {
        PostOuterClass.PostObj postObj = PostOuterClass.PostObj.newBuilder()
                .setId(post.getId())
                .setAddress(post.getAddress()).setCondition(post.getCondition())
                .setDateCreated(getDateCreatedFromYearMonthDay(post.getDateCreated()))
                .addAllComments(getListOfGRPCCommentsFromOurListOfComments(new ArrayList<>()))
                .setTitle(post.getTitle()).setPrice(post.getPrice())
                .setDescription(post.getDescription())
                .setPhoneNumber(post.getPhoneNumber())
                .setEmail(post.getEmail())
                .addAllImages(getListOfGRPCImageFromListOfImage(post.getImages()))
                .setWriter(getGrpcUserFromUser(post.getWriter()))
                .setPrice(post.getPrice())
                .build();
        return postObj;
    }

    public static RatingOuterClass.RatingObj getGrpcRatingFromRating(Rating rating){
        RatingOuterClass.RatingObj ratingObj = RatingOuterClass.RatingObj.newBuilder()
                .setRateUser(getGrpcUserFromUser(rating.getRateUser()))
                .setRatedUser(getGrpcUserFromUser(rating.getRatedUser()))
                .setScore(rating.getScore()).build();
        return ratingObj;
    }

    public static ReportOuterClass.ReportObj getGrpcReportFromReport(Report report) {
        ReportOuterClass.ReportObj reportObj = ReportOuterClass.ReportObj.newBuilder().setPostId(report.getPostId())
                .setReporterUsername(report.getReporterUsername()).setReason(report.getReason()).build();
        return reportObj;


    }

    public static BookmarkOuterClass.BookmarkObj getGrpcBookmarkFromOurBookmark(Bookmark bookmark) {
        BookmarkOuterClass.BookmarkObj bookmarkObj = BookmarkOuterClass.BookmarkObj.newBuilder()
                .setPost(getGrpcPostFromOurPost(bookmark.getPost()))
                .setUser(getGrpcUserFromUser(bookmark.getUser()))
                .build();
        return bookmarkObj;
    }


    public static Bookmark getBookmarkFromGrpcBookmark(BookmarkOuterClass.BookmarkObj bookmark) {
        Bookmark local = new Bookmark();
        local.setUser(getUserFromGrpcUser(bookmark.getUser()));
        local.setPost(getPostFromGrpcPost(bookmark.getPost()));
        return local;
    }

    public static ReportOuterClass.ReportObj getGrpcReportFromOurReport(Report report) {
        ReportOuterClass.ReportObj reportObj = ReportOuterClass.ReportObj.newBuilder()
                .setPostId(report.getPostId())
                .setReason(report.getReason())
                .setReporterUsername(report.getReporterUsername()).build();
        return reportObj;
    }

    public static Report getReportFromGrpcReport(ReportOuterClass.ReportObj report) {
        Report temp = new Report();
        temp.setPostId(report.getPostId());
        temp.setReporterUsername(report.getReporterUsername());
        temp.setReason(report.getReason());
        return temp;
    }

    public static Rating getRatingFromGrpcRating(RatingOuterClass.RatingObj rating){
        Rating rate = new Rating();
        rate.setRateUser(getUserFromGrpcUser(rating.getRateUser()));
        rate.setRatedUser(getUserFromGrpcUser(rating.getRatedUser()));
        rate.setScore(rate.getScore());
        return rate;
    }

    public static PostOuterClass.DateCreated getDateCreatedFromYearMonthDay(Date date) {
        PostOuterClass.DateCreated dateCreated = PostOuterClass.DateCreated.newBuilder().setDay(date.getDay()).setMonth(date.getMonth()).setYear(date.getYear()).build();
        return dateCreated;


    }


    /**
     * Converts the list of grpc posts to the list of our posts..
     *
     * @param list
     * @return
     */
    public static List<Post> getListOfPostFromListOfGrpcPostObjects(List<PostOuterClass.PostObj> list) {
        List<Post> posts = new ArrayList<>();
        for (PostOuterClass.PostObj i : list
        ) {
            posts.add(getPostFromGrpcPost(i));
        }

        return posts;
    }

    public static List<Report> getListOfReporstFromListOfGrpcReportObject(List<ReportOuterClass.ReportObj> list) {
        List<Report> report = new ArrayList<>();
        for (ReportOuterClass.ReportObj i : list) {
            report.add(getReportFromGrpcReport(i));
        }
        return report;
    }

    /**
     * Converts grpc image to our image
     *
     * @param imageObj
     * @return
     */

    public static Image getImageFromGRPCImage(GRPCService.Image.ImageObj imageObj) {
        Image image = new Image();
        image.setId(imageObj.getId());
        image.setHref(imageObj.getHref());
        return image;
    }

    /**
     * Converts the list of grpc image to our image obj
     *
     * @param list
     * @return
     */
    public static List<Image> getListOfImageFromListOfGrpcImages(List<GRPCService.Image.ImageObj> list) {
        List<Image> images = new ArrayList<>();
        for (GRPCService.Image.ImageObj imageObj : list
        ) {
            images.add(getImageFromGRPCImage(imageObj));
        }
        return images;
    }


    /**
     * It converts an Image object to a GRPC Image object.
     *
     * @param image The image object that we want to convert to a gRPC object.
     * @return A GRPCService.Image.ImageObj object.
     */
    public static GRPCService.Image.ImageObj getGrpcImageFromImage(Image image) {
        GRPCService.Image.ImageObj imageObj = GRPCService.Image.ImageObj.newBuilder().setId(image.getId()).setHref(image.getHref()).build();
        return imageObj;
    }


    /**
     * It converts a list of Image objects to a list of GRPCService.Image.ImageObj objects.
     *
     * @param list List of Image objects
     * @return A list of GRPCService.Image.ImageObj
     */
    public static List<GRPCService.Image.ImageObj> getListOfGRPCImageFromListOfImage(List<Image> list) {
        List<GRPCService.Image.ImageObj> imageObjList = new ArrayList<>();
        for (Image img : list
        ) {
            imageObjList.add(getGrpcImageFromImage(img));
        }
        return imageObjList;
    }


    /**
     * It takes a list of our Comment objects and returns a list of GRPCService.Comment.CommentObj objects
     *
     * @param list The list of comments that you want to convert to a list of GRPC comments.
     * @return A list of GRPCService.Comment.CommentObj
     */
    public static List<GRPCService.Comment.CommentObj> getListOfGRPCCommentsFromOurListOfComments(List<Comment> list) {
        List<GRPCService.Comment.CommentObj> commentObjs = new ArrayList<>();
        for (Comment i : list) {
            commentObjs.add(getCommentObjFromComment(i));
        }
        return commentObjs;
    }


    /**
     * It converts a list of GRPC comments to a list of comments.
     *
     * @param list the list of comments from the gRPC service
     * @return A list of comments
     */
    public static List<Comment> getListOfCommentFromGrpcListOfComments(List<GRPCService.Comment.CommentObj> list) {
        List<Comment> comments = new ArrayList<>();
        for (GRPCService.Comment.CommentObj commentObj : list
        ) {
            comments.add(getCommentFromGRPCCommentObj(commentObj));
        }
        return comments;
    }

    /**
     * It takes a GRPCService.Category.CategoryObj object and returns a Category object
     *
     * @param categoryObj The GRPC object that is received from the server.
     * @return A Category object
     */
    public static Category getCategoryFromGrpcCategory(GRPCService.CategoryOuterClass.CategoryObj categoryObj) {
        Category category = new Category();
        category.setId(categoryObj.getId());
        category.setName(categoryObj.getName());
        category.setSubcategories(getListOfSubCategoryFromListOfGrpcSubcatgeories(categoryObj.getSubCategoriesList()));
        return category;
    }

    public static List<Category> getListOfCategoryFromCategory(List<CategoryOuterClass.CategoryObj> categoryObjList) {
        List<Category> categories = new ArrayList<>();
        for (CategoryOuterClass.CategoryObj i : categoryObjList
        ) {
            categories.add(getCategoryFromGrpcCategory(i));

        }
        return categories;
    }


    /**
     * It takes a GRPCService.Subcategory.SubcategoryObj object and returns a Subcategory object
     *
     * @param subcategoryObj This is the object that is received from the server.
     * @return A list of posts
     */
    public static Subcategory getSubCategoriesFromGrpcSubCategories(GRPCService.Subcategory.SubcategoryObj subcategoryObj) {
        Subcategory subcategory = new Subcategory();
        subcategory.setId(subcategoryObj.getId());
        subcategory.setName(subcategoryObj.getName());
        subcategory.setPosts(getListOfPostFromListOfGrpcPostObjects(subcategoryObj.getPostsList()));
        return subcategory;

    }

    /**
     * It converts a list of GRPCService.Subcategory.SubcategoryObj to a list of Subcategory.
     *
     * @param list List of GRPCService.Subcategory.SubcategoryObj
     * @return A list of subcategories
     */
    public static List<Subcategory> getListOfSubCategoryFromListOfGrpcSubcatgeories(List<GRPCService.Subcategory.SubcategoryObj> list) {
        List<Subcategory> subcategories = new ArrayList<>();
        for (GRPCService.Subcategory.SubcategoryObj i : list
        ) {
            subcategories.add(getSubCategoriesFromGrpcSubCategories(i));

        }
        return subcategories;
    }


    /**
     * It converts a Comment object to a CommentObj object.
     *
     * @param comment The comment object that we want to convert to a GRPC object.
     * @return A CommentObj object is being returned.
     */
    public static GRPCService.Comment.CommentObj getCommentObjFromComment(Comment comment) {
        GRPCService.Comment.CommentObj commentObj = GRPCService.Comment.CommentObj.newBuilder()
                .setBody(comment.getBody())
                .setWriter(getGrpcUserFromUser(comment.getWriter()))
                .setId(comment.getId())
                .setDateCreated(GRPCService.Comment.DateCreatedForComment.newBuilder()
                        .setDay(comment.getDateCreated().getDay())
                        .setMonth(comment.getDateCreated().getMonth())
                        .setYear(comment.getDateCreated().getYear())
                        .build())
                .build();
        return commentObj;
    }

    /**
     * It takes a GRPC Comment object and converts it into a Comment object
     *
     * @param commentObj The GRPC object that you want to convert to a Comment object.
     * @return A Comment object
     */
    public static Comment getCommentFromGRPCCommentObj(GRPCService.Comment.CommentObj commentObj) {
        Comment comment = new Comment();
        comment.setId(commentObj.getId());
        comment.setBody(commentObj.getBody());
        comment.setWriter(getUserFromGrpcUser(commentObj.getWriter()));
        Date date = new Date();
        date.setYear(commentObj.getDateCreated().getYear());
        date.setMonth(commentObj.getDateCreated().getMonth());
        date.setDay(commentObj.getDateCreated().getDay());
        comment.setDateCreated(date);
        return comment;
    }


}
