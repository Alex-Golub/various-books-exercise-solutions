package chapter09_inheritance_and_interfaces;

/**
 * BJP3 Exercise 9.11: FilteredAccount
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter9/e11-FilteredAccount
 *
 * @author Alex Golub
 * @since 30-Mar-21 4:45 PM
 */
class Account {
  public boolean __processCalled;

  public Account(Client c) {
    __processCalled = false;
  }

  /***
   * processes the next transaction, returning true if transaction
   * was approved, false otherwise
   */
  public boolean process(Transaction t) {
    __processCalled = true;
    return t.value() > -100 && t.value() < 1_000_000;
  }

  public static class Client {}

  public static class Transaction {
    private final int value;

    public Transaction(int v) {
      value = v;
    }

    /**
     * returns the value of this transaction in pennies
     * (could be negative, positive or zero)
     */
    public int value() {
      return value;
    }
  }
}

/**
 * class should indicate that a zero-valued transaction was approved
 * but shouldn't call the process method in the Account class to process it.
 */
class FilteredAccount extends Account {
  private int totalTransactions;
  private int filteredTransactions;

  public FilteredAccount(Client c) {
    super(c);
  }

  @Override
  public boolean process(Transaction t) {
    totalTransactions++;

    if (t.value() == 0) {
      filteredTransactions++;
      return true;
    }

    return super.process(t);
  }

  /***
   * returns the percent of transactions filtered out
   * (between 0.0 and 100.0);
   * returns 0.0 if no transactions submitted
   */
  public double percentFiltered() {
    return totalTransactions == 0 ?
           0.0 :
           100.0 * filteredTransactions / totalTransactions;
  }
}

