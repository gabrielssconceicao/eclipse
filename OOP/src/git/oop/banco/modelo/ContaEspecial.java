package git.oop.banco.modelo;

public class ContaEspecial extends Conta {
  private double limite;

  public ContaEspecial(Person titular, int agencia, int numero, double limite) {
    super(titular, agencia, numero);
    this.limite = limite;
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  @Override
  public double getSaldoDisponivel() {
    return getSaldo() + getLimite();
  }

  @Override
  public void debitarTarifaMensal() {

    this.sacar(20.5);
  }

}
