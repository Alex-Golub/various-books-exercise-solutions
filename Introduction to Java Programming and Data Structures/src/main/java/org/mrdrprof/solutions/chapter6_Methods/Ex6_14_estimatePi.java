package org.mrdrprof.solutions.chapter6_Methods;

/**
 * *6.14 (Estimate PI)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 4:08 PM
 */
class Ex6_14_estimatePi {
  public static void main(String[] args) {
    final int FROM = 1;
    final int STEP = 100;
    final int TO   = 901;

    System.out.printf("%-10s%s\n", "i", "m(i)");
    System.out.println("-".repeat(17));
    for (int i = FROM; i <= TO; i += STEP)
      System.out.printf("%-10d%.4f\n", i, pi(i));
  }

  public static double pi(int n) {
    double sum = 0;

    for (int i = 1; i <= n; i++)
      sum += (i % 2 == 1 ? 1 : -1) / (2 * i - 1.0);

    return 4 * sum;
  }
}
