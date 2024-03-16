package git.oop.banco.modelo.atm;

import git.oop.banco.modelo.Conta;
import git.oop.banco.modelo.pagamento.DocumentoEstornavel;
import git.oop.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
  public void imprimirSaldo(Conta conta) {
    System.out.println("-------------------------------------");
    System.out.printf("Conta: %d/%d\n", conta.getAgencia(), conta.getNumero());
    System.out.printf("Titular: %s\n", conta.getTitular().getName());
    System.out.printf("Saldo: %.2f\n", conta.getSaldo());
    System.out.printf("Saldo Disponível: %.2f\n", conta.getSaldoDisponivel());

  }

  public void pagar(DocumentoPagavel documento, Conta conta) {
    if (documento.estaPago()) {
      throw new IllegalStateException("Documento já pago");
    }
    conta.sacar(documento.getValorTotal());
    documento.quitarPagamento();
  }

  public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {
    if (!documento.estaPago()) {
      throw new IllegalStateException("Documento não pago");
    }
    conta.depositar(documento.getValorTotal());
    documento.estornarPagamento();
  }
}
