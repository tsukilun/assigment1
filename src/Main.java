public class Main {
    public static void main(String[] args) {
        SocialMedia platform = new SocialMedia("CampusChat");

        User alice = new User(1, "Alice", "alice@example.com");
        User bob = new User(2, "Bob", "bob@example.com");

        platform.addUser(alice);
        platform.addUser(bob);

        Post helloPost = new Post(1, alice, "Hello, this is my only post.");
        helloPost.like();

        platform.addPost(helloPost);

        System.out.println("Platform: " + platform.getName());
        System.out.println("User: " + alice.getName() + ", email=" + alice.getEmail());
        System.out.println("Post: id=" + helloPost.getId() + ", text='" + helloPost.getContent() + "', likes="
                + helloPost.getLikes());
        System.out.println("Are Alice and Bob same id? " + (alice.getId() == bob.getId()));
    }
}
