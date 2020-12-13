package chapter4_conditionals;

/**
 * 1. Write a method called fractionSum that accepts an integer
 * parameter n and returns as a double the sum of the
 * first n terms of the sequence. 1 + (1/2) + (1/3) + (1/4) + (1/5) + ...
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 12:42 PM
 */
class Ex4_1_fractionSum {
  public static double fractionSum(int n) {
    double sum = 0;
    for (int i = 1; i <= n; i++)
      sum += 1.0 / i;
    return sum;
  }
}
