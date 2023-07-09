package org.mrdrprof.solutions.chapter6_Methods;

/**
 * 6.11 (Financial application: compute commissions)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 3:06 PM
 */
class Ex6_11_commissions {
  public static void main(String[] args) {
    final int START = 10_000;
    final int UP_TO = 100_000;

    System.out.printf("%s%13s\n", "Sales Amount", "Commission");
    for (int i = START; i <= UP_TO; i += 5_000) {
      System.out.printf("%-15d%10.1f\n", i, computeCommission(i));
    }
  }

  // Sales Amount          Commission Rate
  // $0.01–$5,000                6 percent
  // $5,000.01–$10,000           8 percent
  // $10,000.01 and above       10 percent
  public static double computeCommission(double salesAmount) {
    double       commission = 0;
    final double AMOUNT_3   = 10_000;
    final double AMOUNT_2   = 5_000;

    if (salesAmount > AMOUNT_3) {
      salesAmount -= AMOUNT_3;
      commission += salesAmount * 0.10;
    }

    if (salesAmount > AMOUNT_2) {
      salesAmount -= AMOUNT_2;
      commission += AMOUNT_2 * 0.08;
    }

    if (salesAmount > 0) {
      commission += salesAmount * 0.06;
    }

    return commission;
  }
}
