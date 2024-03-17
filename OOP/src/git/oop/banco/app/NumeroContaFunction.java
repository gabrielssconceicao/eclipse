package git.oop.banco.app;

import java.util.function.ToIntFunction;

import git.oop.banco.modelo.Conta;

public class NumeroContaFunction implements ToIntFunction<Conta> {

  @Override
  public int applyAsInt(Conta conta) {
    return conta.getNumero();
  }
}
