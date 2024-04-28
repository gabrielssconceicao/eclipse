package exercises.ex03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercises.ex03.entities.enums.OrderStatus;
import exercises.ex03.entities.Order;
import exercises.ex03.entities.OrderItem;
import exercises.ex03.entities.Client;
import exercises.ex03.entities.Product;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter Client Data");

    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.nextLine());

    Client client = new Client(name, email, birthDate);
    System.out.println();

    Order order = new Order(client, new Date(), OrderStatus.PENDING_PAYMENT);

    System.out.println("How many items to this order?");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter #" + i + " item data:");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();
      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();
      System.out.print("Quantity: ");
      int quantity = sc.nextInt();
      OrderItem orderItem = new OrderItem(quantity, new Product(productName, productPrice));
      order.addItem(orderItem);
    }

    System.out.println();
    System.out.println("ORDER SUMMARY:");
    System.out.println(order);
    sc.close();
  }
}
