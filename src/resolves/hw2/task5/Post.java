package resolves.hw2.task5;

import java.util.ArrayList;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private ArrayList<Comment> comments;

    public Post() {
    }

    public Post(int userId, int id, String title, String body, ArrayList<Comment> comments) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = comments;
    }

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = new ArrayList<Comment>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
//                ", title='" + title + '\'' +
//                ", body='" + body + '\'' +
                ", comments=" + comments +
                '}';
    }
}
