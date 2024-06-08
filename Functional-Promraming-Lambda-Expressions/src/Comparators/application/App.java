package Comparators.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Comparators.entites.Product;

public class App {

  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Car", 1500.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    // Comparator<Product> comp = new Comparator<Product>() {

    // @Override
    // public int compare(Product p1, Product p2) {
    // return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    // };
    // };

    // Comparator<Product> comp = (p1, p2) ->
    // p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

    list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
    for (Product p : list) {
      System.out.println(p);
    }
  }
}
