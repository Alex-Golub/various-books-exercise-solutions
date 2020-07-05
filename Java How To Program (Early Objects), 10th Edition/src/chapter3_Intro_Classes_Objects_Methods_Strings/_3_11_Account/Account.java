package chapter3_Intro_Classes_Objects_Methods_Strings._3_11_Account;

/**
 * Created by ag on 18-Jun-20 3:33 PM
 */
public class Account {

  private String name;
  private double balance;

  public Account(String name, double balance) {
    this.name = name;

    if (balance > 0.0)
      this.balance = balance;
  }

  public void deposit(double depositAmount) {
    if (depositAmount > 0.0)
      this.balance += depositAmount;
  }

  public void withdraw(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      return;
    }

    System.out.println("\nWithdrawal amount exceeded account balance.\n");
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }
}
