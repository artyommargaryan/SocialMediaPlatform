import post.Post;
import post.TextPost;
import socialmediaoperations.*;
import user.User;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        SocialMediaOperations insta = new Instagram();
        User user1 = new User("name1", "cInf1");
        User user2 = new User("name2", "cInf2");

        insta.addUser(user1);
        insta.addUser(user2);

        Post post1 = createTextPost(user1);
        Post post2 = createTextPost(user2);

        insta.addPost(post1);
        insta.addPost(post2);

        insta.addComment(user1, post2, "Wow what a text");
    }

    private static Post createTextPost(User user1) {
        return new TextPost(user1, "TextPost by user " + user1, new Date());
    }
}
