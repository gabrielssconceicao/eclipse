package example01.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import example01.model.entities.CarRental;
import example01.model.entities.Vehicle;
import example01.model.services.BrazilTaxService;
import example01.model.services.RentalService;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    System.out.println("Entre com os dados do aluguel: ");

    System.out.print("Modelo do carro: ");
    String carModel = sc.nextLine();

    System.out.print("Retira (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

    System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

    CarRental carRental = new CarRental(new Vehicle(carModel), start, finish);

    System.out.print("Entre com o preço por dia: ");
    double pricePerDay = sc.nextDouble();

    System.out.print("Entre com o preço por hora: ");
    double pricePerHour = sc.nextDouble();

    RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

    rentalService.processInvoice(carRental);

    System.out.println("FATURA:");
    System.out.println("Pagamento basico: R$" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
    System.out.println("Imposto: R$" + String.format("%.2f", carRental.getInvoice().getTax()));
    System.out.println("Pagamento total: R$" + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
    sc.close();
  }
}
