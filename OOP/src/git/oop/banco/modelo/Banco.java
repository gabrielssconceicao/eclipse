package git.oop.banco.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
  private List<Conta> contas = new ArrayList<>();

  public Banco() {
    Person pessoa1 = new Person("Joao", "123456789");
    Person pessoa2 = new Person("Maria", "14645");

    Conta conta1 = new ContaInvestimento(pessoa1, 222, 999);
    Conta conta2 = new ContaInvestimento(pessoa1, 333, 888);
    Conta conta3 = new ContaInvestimento(pessoa2, 123, 567);
    Conta conta4 = new ContaEspecial(pessoa1, 123, 188, 1000);
    Conta conta5 = new ContaEspecial(pessoa2, 123, 222, 1000);

    conta1.depositar(120);
    conta2.depositar(130);
    conta3.depositar(500);
    conta5.depositar(12_000);

    contas.add(conta1);
    contas.add(conta2);
    contas.add(conta3);
    contas.add(conta4);
    contas.add(conta5);

  }

  public List<Conta> getContas() {
    return contas;
  }

  public Optional<Conta> buscar(int agencia, int numeroConta) {
    for (Conta conta : getContas()) {
      if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {
        return Optional.of(conta);
      }
    }
    return Optional.empty();
  }
  // public Conta buscar(int agencia, int numeroConta) {
  // for (Conta conta : getContas()) {
  // if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {
  // return conta;
  // }
  // }

  // return null;
  // }
}
