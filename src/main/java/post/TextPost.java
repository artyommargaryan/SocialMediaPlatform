package post;

import user.User;

import java.util.Date;

public class TextPost extends Post{
    public TextPost(User user, String content, Date date) {
        super(user, content, date);
    }
}
