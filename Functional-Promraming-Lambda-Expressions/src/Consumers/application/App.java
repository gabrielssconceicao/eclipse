package Consumers.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import Consumers.entites.Product;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();

    double min = 1.5;
    Consumer<Product> cons = p -> p.setPrice(p.getPrice() * min);

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));

    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.00));

    list.forEach(cons);
    // list.forEach(Product::staticPriceUpdate);
    // list.forEach(Product::nonStaticPriceUpdate);
    // list.forEach(new PriceUpdate());
    // list.forEach(p -> p.setPrice(p.getPrice() * 1.5));
    list.forEach(System.out::println);

  }
}
