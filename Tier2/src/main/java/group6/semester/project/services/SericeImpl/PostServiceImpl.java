package group6.semester.project.services.SericeImpl;

import group6.semester.project.grpcClient.post.PostClient;
import group6.semester.project.model.Post;
import group6.semester.project.services.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostClient postClient ;

    public PostServiceImpl(PostClient postClient) {
        this.postClient = postClient;
    }

    @Override
    public Post addPost(Post post) {

        //todo all the business logics here...
        return postClient.addPost(post);
    }
}