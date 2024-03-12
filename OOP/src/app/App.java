package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Triangle t1, t2;

    t1 = new Triangle();
    t2 = new Triangle();

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the measures of triangle X: ");
    t1.a = sc.nextDouble();
    t1.b = sc.nextDouble();
    t1.c = sc.nextDouble();

    System.out.println("Enter the measures of triangle Y: ");
    t2.a = sc.nextDouble();
    t2.b = sc.nextDouble();
    t2.c = sc.nextDouble();

    System.out.println(t1);
    System.out.println(t1.area());
    System.out.println(t2.area());
    sc.close();
  }
}
