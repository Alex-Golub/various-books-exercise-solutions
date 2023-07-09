package org.mrdrprof.solutions.chapter5_Loops;

/**
 * 5.12 (Find the smallest n such that n^3 > 12,000)
 * Use a while loop to find the smallest
 * integer n such that n3 is greater than 12,000.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 7:30 PM
 */
class Ex5_12_smallestN {
  public static void main(String[] args) {
    final int BOUND = 12_000;
    int       n     = 1;

    while (n * n * n < 12_000) {
      n++;
    }

    n--;

    System.out.printf("Smallest number such that n^3 < %,d is %d\n", BOUND, n);
    System.out.printf("%d^3 = %,d\n", n - 1, (n - 1) * (n - 1) * (n - 1));
    System.out.printf("%d^3 = %,d\n", n, n * n * n);
    System.out.printf("%d^3 = %,d\n", n + 1, (n + 1) * (n + 1) * (n + 1));
  }
}
