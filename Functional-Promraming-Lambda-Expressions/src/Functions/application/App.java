package Functions.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import Functions.entites.Product;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));

    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.00));

    Function<Product, String> upper = p -> p.getName().toUpperCase();

    // List<String> names = list.stream()
    // .map(newUpperCaseName())
    // collect(Collectors.toList());

    // List<String> names = list.stream()
    // .map(Product::staticUpperCaseName)
    // .collect(Collectors.toList());

    // List<String> names = list.stream()
    // .map(Product::nonStaticUpperCaseName)
    // .collect(Collectors.toList());

    // List<String> names = list.stream()
    // .map(p -> p.getName().toUpperCase())
    // .collect(Collectors.toList());

    List<String> names = list.stream()
        .map(upper)
        .collect(Collectors.toList());

    names.forEach(System.out::println);

  }
}
