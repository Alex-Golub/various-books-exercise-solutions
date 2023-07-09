package org.mrdrprof.solutions.utils.chapter_11;

import lombok.Getter;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * 9.7 (The Account class)
 * **11.8 (New Account class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 13:12
 */
@Getter
public class Account {

  public static final NumberFormat CURRENCY_INSTANCE = NumberFormat.getCurrencyInstance(Locale.US);

  private final int id;
  private final LocalDateTime dateCreated;
  private final List<Transaction> transactions;
  private String name;
  private Double balance;
  private Double annulInterestRate;

  public Account(int id, double balance, double annulInterestRate) {
    this.id = id;
    this.balance = balance;
    setAnnulInterestRate(annulInterestRate / 100);
    this.dateCreated = LocalDateTime.now();
    this.transactions = new ArrayList<>();
  }

  private void setBalance(double balance) {
    if (balance < 0) {
      return;
    }

    this.balance = balance;
  }

  public void setAnnulInterestRate(double annulInterestRate) {
    this.annulInterestRate = annulInterestRate / 100;
  }

  public double getMonthlyInterest() {
    return balance * getMonthlyInterestRate();
  }

  public double getMonthlyInterestRate() {
    return getAnnulInterestRate() / 12;
  }

  public void withdraw(double amount) {
    if (amount < 0) {
      transactions.add(new Transaction(LocalDateTime.now(),
                                       Type.W,
                                       amount,
                                       getBalance(),
                                       "You can't withdraw negative amount"));
      return;
    }

    if (getBalance() - amount < 0) {
      transactions.add(new Transaction(LocalDateTime.now(),
                                       Type.W,
                                       amount,
                                       getBalance(),
                                       "Insufficient funds"));
      return;
    }

    setBalance(getBalance() - amount);
    transactions.add(new Transaction(LocalDateTime.now(),
                                     Type.W,
                                     amount,
                                     getBalance(),
                                     "Successful %s of %s, new balance: %s".formatted(Type.W.getType().toLowerCase(),
                                                                                      CURRENCY_INSTANCE.format(amount),
                                                                                      CURRENCY_INSTANCE.format(getBalance()))));
  }

  public void deposit(double amount) {
    if (amount < 0) {
      String toDeposit = CURRENCY_INSTANCE.format(amount);
      transactions.add(new Transaction(LocalDateTime.now(),
                                       Type.D,
                                       amount,
                                       getBalance(),
                                       String.format("Invalid amount: %s%n", toDeposit)));
      throw new RuntimeException("Deposit of " + toDeposit + " is forbidden");
    }

    setBalance(getBalance() + amount);
    transactions.add(new Transaction(LocalDateTime.now(),
                                     Type.D,
                                     amount,
                                     getBalance(),
                                     "Successful %s of %s, new balance: %s".formatted(Type.D.getType().toLowerCase(),
                                                                                      amount,
                                                                                      getBalance())));
  }

  @Override
  public String toString() {
    return "ID: " + getId() + "\n" +
           "Balance: $" + getBalance() + "\n" +
           "Annual interest rate: " + getAnnulInterestRate() * 100 + "%\n" +
           "Date created: " + dateCreated + "\n";
  }
}
