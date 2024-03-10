package structures;

import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    arrayListCode();

    DynamicArray dynamicArray = new DynamicArray(5);
    // System.out.println(dynamicArray);
    // System.out.println(dynamicArray.isEmpty());
    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");
    dynamicArray.add("D");
    dynamicArray.add("E");
    dynamicArray.add("F");
    dynamicArray.delete("A");
    dynamicArray.delete("B");
    dynamicArray.delete("C");

    // dynamicArray.insert(0, "X");
    // dynamicArray.delete("A");
    // System.out.println(dynamicArray.search("C"));
    // System.out.println(dynamicArray.search("A"));
    System.out.println();
    System.out.println(dynamicArray);
    System.out.println("Capacity: " + dynamicArray.capacity);
    System.out.println("Size: " + dynamicArray.size);
    System.out.println("Empty: " + dynamicArray.isEmpty());
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

  private static void arrayListCode() {
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
}
