package org.mrdrprof.solutions.chapter6_Methods;

/**
 * *6.13 (Sum series)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 3:49 PM
 */
class Ex6_13_sumSeries {
  public static void main(String[] args) {
    final int FROM = 1;
    final int UP_TO = 20;
    System.out.printf("%-6s%s\n", "i", "m(i)");
    System.out.println("-".repeat(20));
    for (int i = FROM; i <= UP_TO; i++)
      System.out.printf("%-6d%.4f\n", i, seriesSum(i));
  }

  // m(i) = 1/3 + 2/5 + 3/7 + ... + i / (i + 2)
  public static double seriesSum(int n) {
    double sum = 0;
    for (int i = 1; i <= n; i++)
      sum += i / (i + 2.0);
    return sum;
  }
}
