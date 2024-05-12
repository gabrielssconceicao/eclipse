package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writter {
  public static void main(String[] args) throws Exception {

    String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

    String path = "src\\out.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
