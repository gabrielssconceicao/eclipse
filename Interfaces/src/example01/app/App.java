package example01.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import example01.entities.CarRental;
import example01.entities.Vehicle;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    System.out.println("Entre com os dados do aluguel: ");

    System.out.print("Modelo do carro: ");
    String carModel = sc.nextLine();

    System.out.println("Retira (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

    System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

    CarRental carRental = new CarRental(new Vehicle(carModel), start, finish);

    sc.close();
  }
}
