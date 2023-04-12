package socialmediaoperations;

import comment.Comment;
import post.Post;
import user.User;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Instagram implements SocialMediaOperations{
    private final List<User> users = new LinkedList<>();
    private final List<Post> posts = new LinkedList<>();

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public List<Post> getPosts() {
        return posts;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void addPost(Post post) {
        validateUser(post.getUser());
        post.getUser().addPost(post);
        posts.add(post);
    }

    private void validateUser(User user) {
        if (!isValidUser(user)){
            throw new IllegalArgumentException("No such user");
        }
    }

    private boolean isValidUser(User user) {
        return users.contains(user);
    }



    @Override
    public Comment addComment(User user, Post post, String content) {
        validateUser(user);
        validatePost(post);
        Comment comment = new Comment(user, post, new Date(), content);
        post.addComment(comment);
        return comment;
    }

    private void validatePost(Post post) {
        if (!isValidPost(post)){
            throw new IllegalArgumentException("No such post");
        }
    }

    private boolean isValidPost(Post post) {
        return posts.contains(post);
    }

    @Override
    public void deleteComment(Post post, Comment comment) {
        validatePost(post);
        post.removeComment(comment);
    }

    @Override
    public void deletePost(User user, Post post) {
        validateUser(user);
        validatePost(post);
        user.removePost(post);
        posts.remove(post);
    }
}
