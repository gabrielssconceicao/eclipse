package git.oop.banco.modelo;

import java.util.Objects;
import git.oop.banco.modelo.excecao.SaldoInsuficienteException;

public abstract class Conta {

  private Person titular;
  private int agencia;
  private int numero;
  private double saldo;

  public Conta() {

  }

  public Conta(Person titular, int agencia, int numero) {
    Objects.requireNonNull(titular);
    this.titular = titular;
    this.agencia = agencia;
    this.numero = numero;
  }

  public void depositar(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("Depositos devem ser positivos!");
    }
    this.saldo += value;
  }

  public void sacar(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("Saque devem ser positivos!");
    }
    if (getSaldoDisponivel() - value < 0) {
      throw new SaldoInsuficienteException("Saldo insuficiente!");
    }

    this.saldo -= value;
  }

  public void sacar(double value, double taxaSaque) {
    sacar(value + taxaSaque);

  }

  public Person getTitular() {
    return titular;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getSaldoDisponivel() {
    return this.getSaldo();
  }

  public abstract void debitarTarifaMensal();
}
