import java.util.Objects;

public class Conta {

  Person titular;
  int agencia;
  int numero;
  double saldo;

  Conta(Person titular, int agencia, int numero) {
    Objects.requireNonNull(titular);
    this.titular = titular;
    this.agencia = agencia;
    this.numero = numero;
  }

  void depositar(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("Depositos devem ser positivos!");
    }
    this.saldo += value;
  }

  void sacar(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("Saque devem ser positivos!");
    }
    if (saldo - value < 0) {
      throw new IllegalStateException("Saldo insuficiente!");
    }

    saldo -= value;
  }

  void sacar(double value, double taxaSaque) {
    sacar(value + taxaSaque);

  }
}
