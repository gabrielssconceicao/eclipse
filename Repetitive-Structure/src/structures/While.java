package structures;

import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    int soma = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = sc.nextInt();
    while (x != 0) {
      soma += x;
      System.out.println("Enter a number: ");
      x = sc.nextInt();
    }
    System.out.println("The sum is: " + soma);

    sc.close();
  }
}
