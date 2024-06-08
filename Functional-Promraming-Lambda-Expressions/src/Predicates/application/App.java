package Predicates.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import Predicates.entites.Product;
import Predicates.util.ProductPredicate;

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
    for (Product p : list) {
      System.out.println(p);
    }

  }
}
