package git.oop.banco.modelo.pagamento;

import git.oop.banco.modelo.Person;

public class Holerite implements DocumentoPagavel {
  private Person funcionario;
  private double valorHora;
  private int horasTrabalhadas;
  private boolean pago;

  public Holerite(Person funcionario, double valorHora, int horasTrabalhadas) {
    this.funcionario = funcionario;
    this.valorHora = valorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }

  @Override
  public boolean estaPago() {

    return pago;
  }

  @Override
  public double getValorTotal() {

    return valorHora * horasTrabalhadas;
  }

  @Override
  public void quitarPagamento() {
    this.pago = true;
  }

  @Override
  public void pegarDados() {
    System.out.println("Funcionário: " + this.funcionario.getName());
    System.out.println("Funcionário: " + this.funcionario.getDocument());
  }
}
