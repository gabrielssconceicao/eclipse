package git.oop.banco.modelo;

public class CaixaEletronico {
  public void imprimirSaldo(Conta conta) {
    System.out.println("-------------------------------------");
    System.out.printf("Conta: %d/%d\n", conta.getAgencia(), conta.getNumero());
    System.out.printf("Titular: %s\n", conta.getTitular().getName());
    System.out.printf("Saldo: %.2f\n", conta.getSaldo());
    System.out.printf("Saldo Disponível: %.2f\n", conta.getSaldoDisponivel());

  }
}
