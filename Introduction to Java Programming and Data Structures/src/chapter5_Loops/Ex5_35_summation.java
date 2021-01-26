package chapter5_Loops;

/**
 * *5.35 (Summation)
 * Write a program to compute the following summation:
 * 1/(1+sqrt(2) + 1/(sqrt(2) +sqrt(3)) + ... + 1/(sqrt(999) + sqrt(1000))
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 4:50 PM
 */
class Ex5_35_summation {
  public static void main(String[] args) {
    // NOTE: using simplification we can see that this
    // summation is -1 + sqrt(1000)
    final int TO = 1_000;

    double sum = 0;
    for (int i = 1; i < TO; i++) {
      sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
    }

    System.out.printf("Using loop = %.3f\n", sum);
    System.out.printf("Simplification = %.3f\n", -1 + Math.sqrt(TO));
  }
}
