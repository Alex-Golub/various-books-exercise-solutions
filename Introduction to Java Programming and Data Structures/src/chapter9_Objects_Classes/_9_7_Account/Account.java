package chapter9_Objects_Classes._9_7_Account;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 * Created by ag on 19-May-20 3:49 PM
 */
public class Account {

  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  public Account() {
    dateCreated = new Date();
  }

  public Account(int id, double balance) {
    this();
    this.id = id;
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public double getBalance() {
    return balance;
  }

  private void setBalance(double balance) {
    this.balance = balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate * 100;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate / 100; // convert to d.d%
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public double getMonthlyInterestRate() {
    checkAnnualRate();
    return getAnnualInterestRate() / (12 * 100);
  }

  private void checkAnnualRate() {
    if (BigDecimal.valueOf(getAnnualInterestRate()).compareTo(BigDecimal.ZERO) <= 0)
      System.err.println("Annual interest rate hasn't been set yet!");
  }

  public double getMonthlyInterest() {
    checkAnnualRate();
    checkBalance();

    // Allow to check Monthly interest only if balance is > 0
    return getBalance() * getMonthlyInterestRate();
  }

  private void checkBalance() {
    if (BigDecimal.valueOf(getBalance()).compareTo(BigDecimal.ZERO) <= 0)
      System.err.println("Balance is negative or zero!");
  }

  public double withdraw(double amount) {
    checkBalance();
    canWithdraw(amount);
    setBalance(getBalance() - amount);
    return amount;
  }

  private void canWithdraw(double amount) {
    BigDecimal funds = BigDecimal.valueOf(getBalance() - amount);
    if (funds.compareTo(BigDecimal.ZERO) < 0) {
      System.err.println(("Can't withdraw! Insufficient funds, deposit at least another $" +
              funds.negate().setScale(2, RoundingMode.CEILING).toString()));
    }
  }

  public void deposit(double amount) {
    if (BigDecimal.valueOf(amount).compareTo(BigDecimal.ZERO) <= 0) {
      System.err.println(String.format("Amount $%.2f is not valid (>=0)", amount));
      return;
    }
    setBalance(getBalance() + amount);
  }

  public void getInfo() {
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",
            "ID", "Balance", "AIT(%)", "MIT(%)", "MI", "Date Created");
    System.out.printf("%-10d $%-10.2f %-10.2f %-10.2f $%-10.2f %-10s",
            getId(), getBalance(), getAnnualInterestRate(), getMonthlyInterestRate() * 100, getMonthlyInterest(),
            getDateCreated().toString());
  }
}
