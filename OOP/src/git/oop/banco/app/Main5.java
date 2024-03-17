package git.oop.banco.app;

import java.util.Optional;

import git.oop.banco.modelo.Banco;
import git.oop.banco.modelo.Conta;

public class Main5 {

  public static void main(String[] args) {
    Banco banco = new Banco();

    // banco.buscar(123, 222)
    // .ifPresent(conta -> System.out.println(conta.getAgencia() + "/" +
    // conta.getNumero()));
    // Optional<Conta> contaOptional = banco.buscar(123, 222);
    // contaOptional.ifPresent(conta -> System.out.println(conta.getAgencia() + "/"
    // + conta.getNumero()));
    // if (contaOptional.isPresent()) {

    // Conta conta = contaOptional.get();
    // System.out.println(conta.getAgencia() + "/" + conta.getNumero());
    // }
    Conta contaEncontrada = banco.buscar(123, 222).orElseThrow(() -> new RuntimeException("Conta nao encontrada"));
    System.out.println(contaEncontrada.getAgencia() + "/" + contaEncontrada.getNumero());

    double saldo = banco.buscar(123, 322).map(Conta::getSaldo).orElse(0.0);
    System.out.println(saldo);
  }
}
