package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * ***8.17 (Financial tsunami)
 * Write a program to find all the unsafe banks.
 *
 * A bank’s total assets are its current balance plus its loans to other banks.
 *
 * If a bank’s total assets are under a certain limit, the bank is unsafe.
 *
 * The money it borrowed cannot be returned to the lender,
 * and the lender cannot count the loan in its total assets.
 *
 * Consequently, the lender may also be unsafe, if its total assets are
 * under the limit.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 9:12 PM
 */
class Ex8_17_financialTsunami {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double unsafeThreshold = sc.nextDouble(); // lower then this threshold bank considered unsafe

    double[][][] data = new double[n][2][];
    for (int i = 0; i < n; i++) {
      double bankBalance = sc.nextDouble();
      int banksLoanedTo = sc.nextInt();
      double[][] borrowers = new double[banksLoanedTo][2];

      for (int j = 0; j < borrowers.length; j++) {
        borrowers[j][0] = sc.nextDouble();
        borrowers[j][1] = sc.nextDouble();
      }

      // TODO
    }
  }
}
