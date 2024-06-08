package Predicates.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import Predicates.entites.Product;

public class App {

  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Car", 1500.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    double min = 100.0;
    Predicate<Product> pred = p -> p.getPrice() >= min;
    list.removeIf(pred);
    // list.removeIf(Product::staticPredicate);
    // list.removeIf(Product::nonStaticPredicate);
    // list.removeIf(new ProductPredicate());
    // list.removeIf(p -> p.getPrice() >= 100.0));
    for (Product p : list) {
      System.out.println(p);
    }

  }
}
