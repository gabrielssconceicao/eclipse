package entities;

public class Account {

  private Integer number;
  private Integer holder;
  protected Double balance;

  public Account() {
  }

  public Account(Integer number, Integer holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Integer getHolder() {
    return holder;
  }

  public void setHolder(Integer holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public void withdraw(Double amount) {
    balance -= amount;
  }

  public void deposit(Double amount) {
    balance += amount;
  }
}
