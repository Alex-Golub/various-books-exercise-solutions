package CodeStepByStep_java.classes_and_objects;

/**
 * Add the following method to the BankAccount class:
 * 1. If the balance is negative, put the - sign before the dollar sign.
 * 2. always display the cents as a two-digit number.
 *
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 1:59 PM
 */
class BankAccount {
  private String name;
  private double balance;
  private int transactions;

  // Format: <name>, <sign>$<dollars>.<cents>
  public String toString() {
    return String.format("%s, %s$%.2f",
            name, balance < 0 ? "-" : "", Math.abs(balance));
  }

  public boolean transactionFee(double fee) {
    double deduct = (fee * transactions * (transactions + 1)) / 2;

    if (balance > deduct) {
      balance -= deduct;
      return true;
    }

    balance = 0;
    return false;
  }

  public void transfer(BankAccount other, double amount) {
    if (balance < 5 || amount <= 0 || other == null)
      return;

    balance -= 5; // deduct fee
    other.balance += Math.min(amount, balance);
    balance = Math.max(balance - amount, 0);

    transactions++;
    other.transactions++;
  }
}
