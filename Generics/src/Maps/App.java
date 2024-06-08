package Maps;

import java.util.Map;
import java.util.TreeMap;

public class App {
  public static void main(String[] args) {

    // TreeMap: Is a sorted map
    Map<String, String> cookies = new TreeMap<>();

    // Insert (key, value)
    cookies.put("username", "Maria");
    cookies.put("email", "maria@email.com");
    cookies.put("phone", "99378438");

    cookies.remove("email");
    cookies.put("phone", "9937844");

    for (String key : cookies.keySet()) {
      System.out.println(key + ": " + cookies.get(key));
    }

    System.out.println("email: " + cookies.get("email"));
    System.out.println("Size: " + cookies.size());

    System.out.println("Phone number: " + cookies.get("phone"));

    System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
    System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
  }
}
