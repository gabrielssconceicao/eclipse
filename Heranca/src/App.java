import entities.Account;
import entities.BusinessAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    }
}
