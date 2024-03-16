package git.oop.banco.modelo.pagamento;

public interface DocumentoPagavel {

  double getValorTotal();

  boolean estaPago();

  void quitarPagamento();

  void pegarDados();

  default void imprimirRecibo() {
    System.out.println("-------------------------------------");
    System.out.println("Recibo:");
    this.pegarDados();
    System.out.println("Valor total: " + this.getValorTotal());
    System.out.println("Esta pago: " + this.estaPago());
    System.out.println("-------------------------------------\n");

  }
}
