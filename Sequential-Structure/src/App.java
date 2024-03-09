import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    }

    static private void saidaDeDados() {
        double x = 32.32556;
        int y = 32;
        String name = "John";
        int age = 42;
        double renda = 4000.0;
        Locale.setDefault(Locale.US);
        System.out.println("Hello, World!");
        System.out.println("Good Morning");

        System.out.printf("The value of y is %d %n", y);
        System.out.printf("The value of x is %f %n", x);
        System.out.printf("The value of x is %.2f %n", x);
        System.out.printf("The value of x is %.4f\n", x);

        System.out.printf("%s tem %d anos, e ganha R$%.2f reais %n", name, age, renda);
    }

    static private void entradaDeDados() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char w;
        String x;
        int y;
        double z;

        System.out.println("Digite algo: ");
        x = sc.nextLine();
        System.out.println("Você escreveu: " + x + "\n");

        System.out.println("Digite um caractere: ");
        w = sc.next().charAt(0);
        System.out.println("O caractere digitado é: " + w + "\n");

        System.out.println("Digite um valor: ");
        y = sc.nextInt();
        System.out.println("O valor digitado é: " + y + "\n");

        System.out.println("Digite um valor decimal: ");
        z = sc.nextDouble();
        System.out.println("O valor digitado é: " + z + "\n");
        sc.close();
    }
}
