package chapter10_Object_Oriented_Thinking;

import java.util.Date;

/**
 * 9.7 (The Account class)
 * Used for programming exercise 10.7
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

  /* Account with negative balance can't be created */
  public void setBalance(double balance) {
    if (balance < 0) {
      return;
    }

    this.balance = balance;
  }

  public double getAnnulInterestRate() {
    return annulInterestRate;
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

  public void withdraw(double amount) {
    if (amount < 0) {
      System.out.println("You can't withdraw negative amount");
    }

    if (balance - amount < 0) {
      System.out.println("\nInsufficient funds");
    }

    balance -= amount;
  }

  public void deposit(double amount) {
    if (amount < 0) {
      System.out.println("Invalid amount: -$" + Math.abs(amount));
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
}
