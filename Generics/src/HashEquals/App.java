package HashEquals;

import HashEquals.entities.Client;

public class App {

  public static void main(String[] args) {
    Client c1 = new Client("Maria", "maria@email.com");
    Client c2 = new Client("Maria", "alex@email.com");
    Client c3 = new Client("Maria", "maria@email.com");

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());

    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
    System.out.println(c1 == c3);
  }
}
