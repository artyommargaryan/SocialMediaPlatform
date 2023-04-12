package socialmediaoperations;

import comment.Comment;
import post.Post;
import user.User;

import java.util.List;

public interface SocialMediaOperations {
    List<User> getUsers();

    List<Post> getPosts();

    void addUser(User user);

    void addPost(Post post);

    Comment addComment(User user, Post post, String content);

    void deleteComment(Post post, Comment comment);

    void deletePost(User user, Post post);
}
