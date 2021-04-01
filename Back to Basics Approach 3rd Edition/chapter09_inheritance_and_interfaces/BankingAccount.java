package chapter09_inheritance_and_interfaces;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Alex Golub
 * @since 30-Mar-21 3:33 PM
 */
class BankingAccount {
  private final List<String> historyTransaction;
  private final List<String> historyBalance;
  private int balance;

  public BankingAccount() {
    historyTransaction = new LinkedList<>();
    historyBalance = new LinkedList<>();
  }

  public BankingAccount(Startup s) {
    this.balance = s.startup_getBalance();
    historyTransaction = new LinkedList<>();
    historyBalance = new LinkedList<>();

    historyTransaction.add(valueToHistory(s.startup_getBalance()));
    historyBalance.add(toString());
  }

  public void debit(Debit d) {
    balance += d.debit_getBalance();

    historyTransaction.add(valueToHistory(d.debit_getBalance()));
    historyBalance.add(toString());
  }

  public void credit(Credit c) {
    balance += c.credit_getBalance();

    historyTransaction.add(valueToHistory(c.credit_getBalance()));
    historyBalance.add(toString());
  }

  public int getBalance() {
    return balance;
  }

  public boolean equals(Object o) {
    if (o instanceof BankingAccount) {
      return (this.getBalance() == ((BankingAccount) o).getBalance());
    }
    return false;
  }

  private String valueToHistory(int value) {
    int absValue = Math.abs(value);
    return (value < 0 ? "(-" : "") + (absValue / 100) + "." + (absValue % 100 / 10) + (absValue % 100 % 10) + (value < 0 ? ")" : " ");
  }

  public String toString() {
    int absBalance = Math.abs(balance);
    return (balance < 0 ? "-" : "") + "$" + (absBalance / 100) + "." + (absBalance % 100 / 10) + (absBalance % 100 % 10);
  }

  public String historyBalanceToString() {
        /*int maxLength = 0;
        for(String piece : historyBalance) {
            maxLength = Math.max(maxLength, piece.length());
        }*/
    int maxLength = 8;

    StringBuilder build = new StringBuilder();
    for (int i = 0; i < historyBalance.size(); i++) {
      build.append(" ".repeat(Math.max(0, maxLength - historyBalance.get(i).length())));
      build.append(historyBalance.get(i));
      if (i != historyBalance.size() - 1) {
        build.append("\n");
      }
    }

    return build.toString();
  }

  public String historyTransactionToString() {
    String total = toString() + " ";

    int maxLength = 0;
    for (String piece : historyTransaction) {
      maxLength = Math.max(maxLength, piece.length() + 2);
    }
    maxLength = Math.max(maxLength, total.length() + 2);

    StringBuilder build = new StringBuilder();
    for (int i = 0; i < historyTransaction.size() - 1; i++) {
      build.append(" ".repeat(Math.max(0, maxLength - historyTransaction.get(i).length())));
      build.append(historyTransaction.get(i));
      build.append("\n");
    }

    build.append("+");
    build.append(" ".repeat(Math.max(0, maxLength - (historyTransaction.get(historyTransaction.size() - 1).length() + 1))));
    build.append(historyTransaction.get(historyTransaction.size() - 1));
    build.append("\n");

    build.append("-".repeat(maxLength));
    build.append("\n");

    build.append(" ".repeat(Math.max(0, maxLength - total.length())));
    build.append(total);

    return build.toString();
  }

  public static class Startup {
    private final int balance;

    public Startup(int balance) {
      this.balance = balance;
    }

    public int startup_getBalance() {
      return balance;
    }
  }

  public static class Debit {
    private final int balance;

    public Debit(int balance) {
      this.balance = balance;
    }

    public int debit_getBalance() {
      return balance;
    }
  }

  public static class Credit {
    private final int balance;

    public Credit(int balance) {
      this.balance = balance;
    }

    public int credit_getBalance() {
      return balance;
    }
  }
}

/**
 * BJP3 Exercise 9.9: MinMaxAccount
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter9/e9-MinMaxAccount
 */
class MinMaxAccount extends BankingAccount {
  private int min;
  private int max;

  public MinMaxAccount(Startup s) {
    super(s);
    min = max = getBalance();
  }

  @Override
  public void debit(Debit d) {
    super.debit(d);
    updateMinMax();
  }

  @Override
  public void credit(Credit c) {
    super.credit(c);
    updateMinMax();
  }

  private void updateMinMax() {
    min = Math.min(min, getBalance());
    max = Math.max(max, getBalance());
  }

  public int getMin() {
    return min;
  }

  public int getMax() {
    return max;
  }
}
