package git.oop.banco.modelo.pagamento;

import git.oop.banco.modelo.Person;

public class Boleto implements DocumentoEstornavel {
  private Person beneficiario;
  private double valor;
  private boolean pago;

  public Boleto(Person beneficiario, double valor) {
    this.beneficiario = beneficiario;
    this.valor = valor;
  }

  @Override
  public boolean estaPago() {
    return pago;
  }

  @Override
  public double getValorTotal() {
    return valor;
  }

  @Override
  public void quitarPagamento() {
    this.pago = true;
  }

  @Override
  public void estornarPagamento() {
    this.pago = false;
  }

  @Override
  public void pegarDados() {
    System.out.println("Nome: " + this.beneficiario.getName());
    System.out.println("Documento: " + this.beneficiario.getDocument());

  }
}
