package app;

import java.util.Scanner;

import app.service.PrintService;

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
