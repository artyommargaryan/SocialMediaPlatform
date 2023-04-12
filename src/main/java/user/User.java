package user;

import post.Post;

import java.util.LinkedList;
import java.util.List;

public class User {
    private final String name;
    private String contactInformation;

    private final List<Post> posts = new LinkedList<>();

    public User(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void removePost(Post post) {
        posts.remove(post);
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
