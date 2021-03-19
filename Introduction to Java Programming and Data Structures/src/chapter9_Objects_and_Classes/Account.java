package chapter9_Objects_and_Classes;

import java.util.Date;

/**
 * 9.7 (The Account class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 13:12
 */
/*public*/ class Account {
  private int id;
  private double balance;
  private double annulInterestRate;
  private Date dateCreated;

  public Account() {
    this(0, 0, 0);
  }

  public Account(int id, double balance) {
    this(id, balance, 0);
  }

  public Account(int id, double balance, double annulInterestRate) {
    this.id = id;
    this.balance = balance;
    this.annulInterestRate = annulInterestRate / 100;
    this.dateCreated = new Date();
  }

  public int getId() {
    return id;
  }

  public double getBalance() {
    return balance;
  }

  public double getAnnulInterestRate() {
    return annulInterestRate;
  }

  /* Account we negative balance can't be created */
  public void setBalance(double balance) {
    if (balance < 0) {
      return;
    }

    this.balance = balance;
  }

  public void setAnnulInterestRate(double annulInterestRate) {
    this.annulInterestRate = annulInterestRate / 100;
  }

  /* return copy of mutable object */
  public Date getDateCreated() {
    return (Date) dateCreated.clone();
  }

  public double getMonthlyInterest() {
    return balance * getMonthlyInterestRate();
  }

  public double getMonthlyInterestRate() {
    return getAnnulInterestRate() / 12;
  }

  public double withdraw(double amount) {
    if (balance - amount < 0) {
      System.out.println("Insufficient funds\n");
      return 0;
    }

    balance -= amount;
    return amount;
  }

  public void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("Invalid amount: " + amount);
      return;
    }

    balance += amount;
  }

  @Override
  public String toString() {
    return "ID: " + getId() + "\n" +
           "Balance: $" + getBalance() + "\n" +
           "Annual interest rate: " + getAnnulInterestRate() * 100 + "%\n" +
           "Date created: " + dateCreated + "\n";
  }


  public static void main(String[] args) {
    Account account = new Account(1122, 20_000, 4.5);
    System.out.println(account);
    account.withdraw(25_000);
    System.out.println(account);
    account.withdraw(2000);
    System.out.println(account);
    account.deposit(1500);
    System.out.println(account);
  }
}
