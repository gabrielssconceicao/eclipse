package git.oop.banco.app;

import git.oop.banco.modelo.Conta;
import git.oop.banco.modelo.Person;

public class Main {
  public static void main(String[] args) {
    Person titular1 = new Person("Max Power", "123456789");
    Person titular2 = new Person("Mary Jane", "455345364");
    Conta myAccount = new Conta(titular1, 123, 456);
    myAccount.depositar(25_000.34);
    myAccount.sacar(5_000);
    myAccount.sacar(10_000, 0.34);
    System.out.println("Nome do Titular: " + myAccount.getTitular().getName());
    System.out.println("Saldo: " + myAccount.getSaldo());
    // myAccount.nomeTitular = "Max";

    Conta yourAccount = new Conta(titular2, 456, 789);

    yourAccount.depositar(20_000.0);
    System.out.println("Nome do Titular: " + yourAccount.getTitular().getName());
    System.out.println("Saldo: " + yourAccount.getSaldo());

  }
}
