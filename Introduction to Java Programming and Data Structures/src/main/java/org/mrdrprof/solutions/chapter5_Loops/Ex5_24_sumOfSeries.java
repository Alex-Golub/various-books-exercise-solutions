package org.mrdrprof.solutions.chapter5_Loops;

/**
 * *5.24 (Sum a series) Write a program to compute the following summation
 * 1/3 + 3/5 + 5/7 + ... + (2n + 1)/(2n + 3)
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 5:46 PM
 */
class Ex5_24_sumOfSeries {
  public static void main(String[] args) {
    final int PER_LINE = 10;
    final int TO       = 97;
    double    sum      = 0;

    for (int i = 1; i <= TO; i += 2) {

      System.out.printf("%d/%d", i, i + 2);
      if ((i + 1) % PER_LINE != 0)
        System.out.print(" + ");
      else
        System.out.println(" + ");

      sum += i / (i + 2.0);
    }

    System.out.println("\nSeries sum = " + sum);
  }
}
