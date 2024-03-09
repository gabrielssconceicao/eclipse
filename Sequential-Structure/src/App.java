import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
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
}
