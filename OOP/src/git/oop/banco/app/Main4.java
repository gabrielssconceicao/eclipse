package git.oop.banco.app;

import java.util.Comparator;
import java.util.stream.Stream;

import git.oop.banco.modelo.Banco;
import git.oop.banco.modelo.Conta;

public class Main4 {
  public static void main(String[] args) {
    Banco banco = new Banco();
    banco.getContas().stream()
        .filter(conta -> conta.getSaldo() > 30)
        .filter(conta -> conta.getNumero() > 100)
        .sorted(Comparator.comparingInt(Conta::getNumero))
        .map(conta -> conta.getTitular())
        .distinct()
        .forEach(System.out::println);
    // .forEach(titular -> {
    // System.out.println(tittular);
    // });
    // banco.getContas().stream()
    // .filter(conta -> conta.getSaldo() > 30)
    // .filter(conta -> conta.getNumero() > 100)
    // .sorted(Comparator.comparingInt(Conta::getNumero))
    // .forEach(conta -> System.out.printf("%d/%d: %.2f\n", conta.getAgencia(),
    // conta.getNumero(), conta.getSaldo()));

    // Stream -> Collection of Objects (Contas)
    // Stream<Conta> stream = banco.getContas().stream();
    // Stream<Conta> stream2 = stream.filter(conta -> conta.getSaldo() < 130);
    // Stream<Conta> stream3 = stream2.filter(conta -> conta.getNumero() > 300);

    // stream3.forEach((conta) -> {

    // System.out.printf("%d/%d: %.2f\n", conta.getAgencia(), conta.getNumero(),
    // conta.getSaldo());
    // });
    // stream.forEach((conta) -> {
    // conta.depositar(conta.getAgencia() + conta.getNumero());
    // System.out.printf("%d/%d: %.2f\n", conta.getAgencia(), conta.getNumero(),
    // conta.getSaldo());
    // });

    // Stream<Conta> stream2 = banco.getContas().stream().filter(conta ->
    // conta.getSaldo() < 1000);
    // stream2.forEach((conta) -> {

    // System.out.printf("%d/%d: %.2f\n", conta.getAgencia(), conta.getNumero(),
    // conta.getSaldo());
    // });

  }
}
