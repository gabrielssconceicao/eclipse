package git.oop.banco.app;

import java.math.BigDecimal;

public class TesteCalculo {
  // BigDecimal = número com casas decimais e arredondamento usado para dinheiro
  public static void main(String[] args) {
    BigDecimal x = new BigDecimal("1.0");
    x = x.subtract(new BigDecimal("0.10"));
    x = x.subtract(new BigDecimal("0.20"));
    x = x.subtract(new BigDecimal("0.30"));

    System.out.println(x);

    x = x.multiply(BigDecimal.valueOf(70.5)).divide(new BigDecimal("7"), 2, BigDecimal.ROUND_HALF_EVEN);
    System.out.println(x);
  }
}
