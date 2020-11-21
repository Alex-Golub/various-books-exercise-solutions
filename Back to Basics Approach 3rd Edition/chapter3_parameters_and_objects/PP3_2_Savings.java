package chapter3_parameters_and_objects;

/**
 * 2. A certain bank offers 6.5% interest on savings accounts,
 * compounded annually.
 * Create a table that shows how much money a person will accumulate
 * over a period of 25 years, assuming that the person makes an initial
 * investment of $1000 and deposits $100 each year after the first.
 * Your table should indicate for each year the current balance, the
 * interest, the new deposit, and the new balance.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 10:14 PM
 */
class PP3_2_Savings {
  static final double INTEREST          = 6.5;
  static final int    YEARS             = 25;
  static final double INITIAL           = 1000;
  static final double EACH_YEAR_DEPOSIT = 100;

  public static void main(String[] args) {
    double rate       = 1 + (INTEREST / 100.0);
    double newBalance = INITIAL * rate;

    System.out.printf("%-6s%-10s%-15s%-10s%-10s\n",
            "Year", "Balance", "Interest(%)", "Deposit", "New Balance");
    System.out.printf("%-6d%-10.2f%-15.2f%-10s%-10.2f\n",
            2020, INITIAL, INTEREST, "-", newBalance);

    for (int i = 1; i <= YEARS; i++) {
      double startBalance = newBalance;
      newBalance = (newBalance + EACH_YEAR_DEPOSIT) * rate;
      System.out.printf("%-6d%-10.2f%-15.2f%-10.2f%-10.2f\n",
              2020 + i, startBalance, INTEREST, EACH_YEAR_DEPOSIT, newBalance);
    }
  }
}
