package Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Sets.entities.Product;

public class App {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("TV");
    set.add("Tablet");
    set.add("Notebook");

    // set.removeIf(x -> x.length() < 5);
    System.out.println(set.contains("Notebook"));

    for (String p : set) {
      System.out.println(p);
    }

    // Operations
    // Union
    Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
    Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

    // Union
    Set<Integer> union = new TreeSet<>(a);
    union.addAll(b);
    System.out.print("Union: ");
    System.out.println(union);

    // Intersection
    Set<Integer> intersection = new TreeSet<>(a);
    intersection.retainAll(b);
    System.out.print("Intersection: ");
    System.out.println(intersection);

    // Difference
    // a - b
    Set<Integer> difference = new TreeSet<>(a);
    difference.removeAll(b);
    System.out.print("a - b: ");
    System.out.println(difference);

    // b - a
    difference = new TreeSet<>(b);
    difference.removeAll(a);
    System.out.print("b - a: ");
    System.out.println(difference);

    // -------------------------------------------------------//

    Set<Product> products = new HashSet<>();
    products.add(new Product("Tv", 900.00));
    products.add(new Product("Notebook", 1200.00));
    products.add(new Product("Tablet", 450.00));

    Product prod = new Product("Tv", 900.00);
    System.out.println(products.contains(prod));
  }
}
