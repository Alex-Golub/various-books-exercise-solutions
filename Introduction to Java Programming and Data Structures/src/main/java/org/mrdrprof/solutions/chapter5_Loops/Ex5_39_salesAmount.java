package org.mrdrprof.solutions.chapter5_Loops;

/**
 * *5.39 (Financial application: find the sales amount)
 * <p>
 * Sales Amount          Commission Rate
 * $0.01–$5,000                6 percent
 * $5,000.01–$10,000           8 percent
 * $10,000.01 and above       10 percent
 * <p>
 * Write a program to find the minimum sales you have to
 * generate in order to make $30,000.
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 6:37 PM
 */
class Ex5_39_salesAmount {
  public static void main(String[] args) {

    double commission;
    double salesAmount = 0.01;
    do {
      salesAmount += 0.01;

      if (salesAmount > 10_000.0) {
        commission = 900.0 + (salesAmount - 10000.0) * 0.10;
      } else if (salesAmount > 5000.0) {
        commission = 400.0 + (salesAmount - 5000.0) * 0.08;
      } else {
        commission = salesAmount * 0.06;
      }
    } while (commission < 30_000.0);

    System.out.println("You need $" + (int) (salesAmount * 100.0) / 100.0 +
                       " sales amount to make a commission of $25000");
  }
}
