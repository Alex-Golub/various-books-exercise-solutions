package cse_142.cs1_labs;

/**
 * @author Alex Golub
 * @since 07-Apr-21 5:39 PM
 */
class BankAccount {
  String name;
  double balance;
  double transactionFee;

  public final void deposit(double amount) {
    balance = balance + amount;
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab8/BankAccountFee
   *
   * test #1:$100, $0 fee, withdraw $10
   * console output: 90.0
   * result: pass
   *
   * test #2:$100, $1 fee, withdraw $10
   * console output: 89.0
   * result: pass
   *
   * test #3:$100, $5 fee, withdraw $10, $20, $2
   * console output: first withdraw of $10 : 85.0
   *                 second withdraw of $20: 60.0
   *                 third withdraw of $2  : 53.0
   * result: pass
   *
   * test #4:$50, $6.25 fee, withdraw $35, $10, $1, $5, $.50
   * console output: first withdraw of $35 : 8.75
   *                 second withdraw of $10: 8.75
   *                 third withdraw of $1  : 1.5
   *                 fourth withdraw of $5 : 1.5
   *                 fifth withdraw of $.50: 1.5
   * result: pass
   *
   * test #5:$100, $99 fee, withdraw $1
   * console output: 0.0
   * result: pass
   *
   */
  public final void withdraw(double amount) {
    double deduct = amount + transactionFee;
    if (balance >= deduct) {
      balance = balance - deduct;
    }
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab8/toStringBankAccount
   *
   * test #1:test1
   * console output:
   * "user, $90.01"
   * result: pass
   *
   * test #2:test2
   * console output:
   * "Marty, $123.45"
   * result: pass
   *
   * test #3:test3
   * console output:
   * "Jessica, $1.59"
   * result: pass
   *
   * test #4:test4
   * console output:
   * "poor man, $0.01"
   * result: pass
   *
   * test #5:test5
   * console output:
   * "Mister Zero, $0.00"
   * result: pass
   *
   * test #6:test6
   * console output:
   * "In Debt Donnie, -$1.23"
   * result: pass
   *
   * test #7:test7
   * console output:
   * "college student, -$850.76"
   * result: pass
   *
   * test #8:test8
   * console output:
   * "Car Loan Guy, -$1000.50"
   * result: pass
   *
   * test #9:test9
   * console output:
   * "Bankrupt Government, -$765432.10"
   * result: pass
   *
   */
  public String toString() {
    return String.format("%s, %s$%.2f",
                         name,
                         balance < 0 ? "-" : "",
                         Math.abs(balance));
  }
}
