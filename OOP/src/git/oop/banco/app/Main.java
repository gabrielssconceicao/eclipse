package git.oop.banco.app;

import git.oop.banco.modelo.Conta;
import git.oop.banco.modelo.ContaEspecial;
import git.oop.banco.modelo.ContaInvestimento;
import git.oop.banco.modelo.Person;

public class Main {
  public static void main(String[] args) {
    Person titular1 = new Person("Max Power", "123456789");
    Person titular2 = new Person("Mary Jane", "455345364");

    ContaInvestimento myAccount = new ContaInvestimento(titular1, 123, 456);
    ContaEspecial yourAccount = new ContaEspecial(titular2, 456, 789, 1000);

    // myAccount.depositar(25_000.34);
    // myAccount.sacar(10_000, 0.34);
    // myAccount.creditarRendimentos(0.8);
    // System.out.println("Nome do Titular: " + myAccount.getTitular().getName());
    // System.out.println("Saldo: " + myAccount.getSaldo());

    yourAccount.depositar(15_000.0);
    yourAccount.sacar(15_500.0);
    System.out.println("Nome do Titular: " + yourAccount.getTitular().getName());
    System.out.println("Saldo: " + yourAccount.getSaldo());

  }
}
