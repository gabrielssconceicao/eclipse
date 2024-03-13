public class Main {
  public static void main(String[] args) {
    Person titular1 = new Person("Max Power", "123456789");
    Person titular2 = new Person("Mary Jane", "455345364");
    Conta myAccount = new Conta();
    myAccount.titular = titular1;
    myAccount.agencia = 123;
    myAccount.numero = 456;
    myAccount.saldo = 1_000.0;
    System.out.println("Nome do Titular: " + myAccount.titular.name);
    System.out.println("Saldo: " + myAccount.saldo);
    // myAccount.nomeTitular = "Max";

    Conta yourAccount = new Conta();
    yourAccount.titular = titular2;
    yourAccount.agencia = 456;
    yourAccount.numero = 789;
    yourAccount.saldo = 20_000.0;
    System.out.println("Nome do Titular: " + yourAccount.titular.name);
    System.out.println("Saldo: " + yourAccount.saldo);

  }
}
