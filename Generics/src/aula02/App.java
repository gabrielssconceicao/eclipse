package aula02;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula02.entities.Product;
import aula02.services.CalculationService;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();
    String path = "src/aula02/numbers.txt";

    try (BufferedReader br = new BufferedReader(new java.io.FileReader(path))) {

      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        line = br.readLine();
      }

      Product x = CalculationService.max(list);
      System.out.println("Most expensive: ");
      System.out.println(x);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
