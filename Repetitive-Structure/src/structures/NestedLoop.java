package structures;

import java.util.Scanner;

public class NestedLoop {

  public static void main(String[] args) {
    int rows = 0;
    int columns = 0;
    char symbol;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    rows = sc.nextInt();

    System.out.println("Enter the number of columns: ");
    columns = sc.nextInt();

    System.out.println("Enter the symbol to use: ");
    symbol = sc.next().charAt(0);

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(symbol);
      }
      System.out.println();
    }
    sc.close();
  }
}
