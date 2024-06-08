package Maps;

import java.util.HashMap;
import java.util.Map;

import Maps.entites.Product;

public class App2 {
  public static void main(String[] args) {

    Map<Product, Double> stock = new HashMap<>();

    Product p1 = new Product("Tv", 900.00);
    Product p2 = new Product("Notebook", 1200.00);
    Product p3 = new Product("Tablet", 450.00);

    stock.put(p1, 10000.0);
    stock.put(p2, 20000.0);
    stock.put(p3, 15000.0);

    Product ps = new Product("Tv", 900.00);

    System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

  }
}
