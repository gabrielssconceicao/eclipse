package exercises.ex02;

import java.text.SimpleDateFormat;

import exercises.ex02.entitites.Comment;
import exercises.ex02.entitites.Post;

public class App {

  public static void main(String[] args) throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");
    Comment c3 = new Comment("Hi!");

    Post post = new Post(
        sdf.parse("21/06/2018 13:05:44"),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!",
        12);

    post.addComment(c1);
    post.addComment(c2);
    post.addComment(c3);

    System.out.println(post);
  }
}
