package comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

  public static void main(String[] args) {

    try {
      String path = "src/comparable/int.txt";
      String pathCsv = "src/comparable/int.csv";
      printList(path);
      System.out.println();
      printSortedEmployees(pathCsv);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void printSortedEmployees(String path) throws Exception {
    List<Employee> list = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String employeeCsv = br.readLine();
      while (employeeCsv != null) {
        String[] fields = employeeCsv.split(",");
        list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
        employeeCsv = br.readLine();
      }
      Collections.sort(list);

      for (Employee employee : list) {
        System.out.println(employee.getName() + ", " + employee.getSalary());
      }

    }
  }

  private static void printList(String path) throws Exception {
    List<String> list = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String name = br.readLine();
      while (name != null) {
        list.add(name);
        name = br.readLine();
      }
      Collections.sort(list);

      for (String s : list) {
        System.out.println(s);
      }

    }
  }
}
