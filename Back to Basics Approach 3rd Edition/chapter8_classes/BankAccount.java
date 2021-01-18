package chapter8_classes;

/**
 * @author Mr.Dr.Professor
 * @since 17-Jan-21 2:20 PM
 */
class BankAccount {
  private String id;
  private double balance;
  private int    transactions;

  public BankAccount(String id) {
    if (id == null || id.isEmpty())
      throw new IllegalArgumentException("Illegal id: " + id);

    this.id = id;
    this.balance = 0;
    this.transactions = 0;
  }

  public String getId() {
    return id;
  }

  public double getBalance() {
    return balance;
  }

  public int getTransactions() {
    return transactions;
  }

  public void deposit(double amount) {
    if (amount > 0 && amount <= 500) {
      balance += amount;
      transactions++;
    }
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      transactions++;
    }
  }

  // Ex8_11_transactionFee
  // amount of money to deduct every time the user withdraws money
  public boolean transactionFee(double fee) {
    double deduct = (fee * transactions * (transactions + 1)) / 2;

    if (balance > deduct) {
      balance -= deduct;
      return true;
    }

    balance = 0;
    return false;
  }

  // Ex8_12_toStringBankAccount
  // format: <name>, <sign>$<balance>.<cents 2 digits>
  public String toString() {
    return String.format("%s, %s$%.2f\n",
            id, balance < 0 ? "-" : "", Math.abs(balance));
  }

  // Ex8_13_transferBankAccount
  // - Moves money from this bank account to another account
  // - There is a $5.00 fee for transferring money
  // - A transfer also counts as a transaction on both accounts
  public void transfer(BankAccount other, double amount) {
    if (balance < 5 || amount <= 0 || other == null)
      return;

    balance -= 5;
    other.balance += Math.min(amount, balance);
    balance = Math.max(balance - amount, 0);

    transactions++;
    other.transactions++;
  }
}
