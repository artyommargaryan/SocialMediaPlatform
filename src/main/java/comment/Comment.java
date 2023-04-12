package comment;

import post.Post;
import user.User;

import java.util.Date;

public class Comment {
    private final User user;
    private final Post post;
    private final Date date;
    private String content;

    public Comment(User user, Post post, Date date, String content) {
        this.user = user;
        this.post = post;
        this.date = date;
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public Post getPost() {
        return post;
    }

    public Date getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public void addContent(String content) {
        this.content = content;
    }
}
