package example02.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import example02.entities.Contract;
import example02.entities.Installment;
import example02.services.ContractService;
import example02.services.PaypalService;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre com os dados do contrato: ");

    System.out.print("Nuumero: ");
    int number = sc.nextInt();

    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.next(), fmt);

    System.out.print("Valor do contrato: ");
    double totalValue = sc.nextDouble();

    Contract contract = new Contract(number, totalValue, date);

    System.out.print("Entre com o nuumero de parcelas: ");
    int months = sc.nextInt();

    ContractService contractService = new ContractService(new PaypalService());
    contractService.processContract(contract, months);

    System.out.println("Parcelas: ");
    for (Installment installment : contract.getInstallments()) {
      System.out.println(installment);
    }
    sc.close();
  }
}
