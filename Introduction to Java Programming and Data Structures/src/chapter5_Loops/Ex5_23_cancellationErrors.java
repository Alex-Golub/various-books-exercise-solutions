package chapter5_Loops;

/**
 * *5.23 (Demonstrate cancellation errors) A cancellation error occurs when you are
 * manipulating a very large number with a very small number. The large number
 * may cancel out the smaller number.
 * For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0.
 * To avoid cancellation errors and obtain more accurate results,
 * carefully select the order of computation.
 * For example, in computing the following summation, you will obtain more
 * accurate results by computing from right to left rather than from left
 * to right
 * 1 + 1/2 + 1/3 + ... + 1/n
 * <p>
 * Write a program that compares the results of the summation of the preceding
 * series, computing from left to right and from right to left with n = 50000.
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 5:34 PM
 */
class Ex5_23_cancellationErrors {
  public static void main(String[] args) {
    final int N           = 50_000;
    double    leftToRight = leftToRight(N);
    double    rightToLeft = rightToLeft(N);

    System.out.println("Left to Right summation: " + leftToRight);
    System.out.println("Right to Left summation: " + rightToLeft);

    double diff = leftToRight - rightToLeft;
    System.out.println("Difference = " + diff);
  }

  private static double rightToLeft(int n) {
    double sum = 0;
    for (int i = n; i > 0; i--)
      sum += 1.0 / i;
    return sum;
  }

  private static double leftToRight(int n) {
    double sum = 0;
    for (int i = 1; i <= n; i++)
      sum += 1.0 / i;
    return sum;
  }
}
