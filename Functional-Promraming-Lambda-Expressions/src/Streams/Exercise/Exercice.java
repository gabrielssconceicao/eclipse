package Streams.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Streams.Exercise.entities.Product;

public class Exercice {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();
    try (BufferedReader bf = new BufferedReader(new FileReader("src/Streams/Exercise/in.txt"))) {

      String line = bf.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        line = bf.readLine();
      }

    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }

    // Avarage price
    double avg = list.stream()
        .map(p -> p.getPrice())
        .reduce(0.0, (x, y) -> x + y) / list.size();

    System.out.println("Average price: " + String.format("%.2f", avg));

    Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
    List<String> names = list.stream()
        .filter(p -> p.getPrice() <= avg)
        .map(p -> p.getName())
        .sorted(comp.reversed())
        .collect(Collectors.toList());

    System.out.println("Products lower than average: ");
    names.forEach(System.out::println);

    ;
  }
}
