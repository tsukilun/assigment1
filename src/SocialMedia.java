import java.util.ArrayList;
import java.util.List;

public class SocialMedia {
    private final String name;
    private final List<User> users;
    private final List<Post> posts;

    public SocialMedia(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public List<Post> getPosts() {
        return new ArrayList<>(posts);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
