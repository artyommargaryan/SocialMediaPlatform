package post;

import comment.Comment;
import user.User;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class Post {
    private User user;
    private String content;
    private Date date;
    private List<Comment> comments = new LinkedList<>();

    public Post(User user, String content, Date date) {
        this.user = user;
        this.content = content;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public String getContent(){
        return content;
    };

    public Date getDate() {
        return date;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }
}
