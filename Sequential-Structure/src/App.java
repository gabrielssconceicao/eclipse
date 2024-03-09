import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25);
        System.out.println("A raiz quadrada de " + x + " é: " + A);
        System.out.println("A raiz quadrada de " + y + " é: " + B);
        System.out.println("A raiz quadrada de 25 é: " + C);
        System.out.println();

        A = Math.pow(x, y);
        B = Math.pow(y, 2);
        C = Math.pow(5, 2);
        System.out.printf("%.1f elevado a %.1f é %.2f \n", x, y, A);
        System.out.printf("%.1f elevado ao quadrado é %.2f \n", y, B);
        System.out.printf("5 elevado ao quadrado é %.2f \n", C);
        System.out.println();

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("O valor absoluto de " + y + " é: " + A);
        System.out.println("O valor absoluto de " + z + " é: " + B);
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
