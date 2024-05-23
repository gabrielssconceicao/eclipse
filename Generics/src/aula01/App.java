package aula01;

import java.util.Scanner;

import aula01.services.PrintService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Value: ");
            int value = sc.nextInt();
            ps.add(value);
        }
        ps.print();

        System.out.println("First: " + ps.first());
        sc.close();
    }
}
