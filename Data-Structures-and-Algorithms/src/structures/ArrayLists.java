package structures;

import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<String> foods = new ArrayList<String>();

    foods.add("Pizza");
    foods.add("Hamburger");
    foods.add("Pasta");

    printArrayList(foods);

    foods.set(0, "sushi");
    foods.remove(2);

    printArrayList(foods);

    foods.clear();
    printArrayList(foods);
  }

  private static void printArrayList(ArrayList<String> array) {
    System.out.println("-----------------------------");
    System.out.println();
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }
    System.out.println();
    System.out.println("-----------------------------");
    System.out.println();

  }
}
