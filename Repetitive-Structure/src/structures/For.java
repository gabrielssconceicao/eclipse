package structures;

import java.util.Scanner;

public class For {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma = 0;

    System.out.println("Enter a quantity of numbers: ");
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      System.out.println("Enter a number: ");
      int x = sc.nextInt();
      soma += x;
    }
    System.out.printf("The sum is: %d", N, soma);
    sc.close();
  }
}
