package structures;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double C, F;
    char continueLoop;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Enter a temperature in Celsius: ");
      C = sc.nextDouble();

      F = (9 * C) / 5 + 32;

      System.out.printf("%.2f degrees Celsius = %.2f degrees Fahrenheit%n", C, F);

      System.out.print("Continue? (y/n): ");
      continueLoop = sc.next().charAt(0);
    } while (continueLoop != 'n');

    sc.close();
  }
}
