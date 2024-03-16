package git.oop.banco.app;

import git.oop.banco.modelo.ContaEspecial;
import git.oop.banco.modelo.ContaInvestimento;
import git.oop.banco.modelo.Person;
import git.oop.banco.modelo.atm.CaixaEletronico;
import git.oop.banco.modelo.pagamento.Boleto;
import git.oop.banco.modelo.pagamento.Holerite;

public class Main {
  public static void main(String[] args) {
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    Person titular1 = new Person("Max Power", "123456789");
    Person titular2 = new Person("Mary Jane", "455345364");

    ContaInvestimento myAccount = new ContaInvestimento(titular1, 123, 456);
    ContaEspecial yourAccount = new ContaEspecial(titular2, 456, 789, 1000);

    myAccount.depositar(25_000.34);
    myAccount.sacar(10_000, 0.34);
    myAccount.creditarRendimentos(0.8);
    myAccount.debitarTarifaMensal();

    yourAccount.depositar(15_000.0);
    yourAccount.sacar(15_500.0);
    yourAccount.debitarTarifaMensal();
    System.out.println(yourAccount.getSaldo());

    Boleto boletoEscola = new Boleto(titular2, 1_500);
    Holerite salarioFuncionario = new Holerite(titular1, 100, 13);

    caixaEletronico.pagar(boletoEscola, myAccount);
    System.out.println("Boleto pago: " + boletoEscola.estaPago());
    boletoEscola.imprimirRecibo();
    caixaEletronico.estornarPagamento(boletoEscola, myAccount);

    caixaEletronico.pagar(salarioFuncionario, myAccount);
    System.out.println("Holerite pago: " + salarioFuncionario.estaPago());

    boletoEscola.imprimirRecibo();
    salarioFuncionario.imprimirRecibo();

    caixaEletronico.imprimirSaldo(myAccount);
    caixaEletronico.imprimirSaldo(yourAccount);

  }
}
