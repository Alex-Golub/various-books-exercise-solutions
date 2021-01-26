package chapter5_Loops;

/**
 * **5.25 (Compute p)
 * Write a program that displays the p value
 * for i = 10_000, 20_000, …, and 100_000.
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 6:07 PM
 */
class Ex5_25_computePi {
  public static void main(String[] args) {
    final int PERIOD = 10_000;
    final int TO     = 100_000;

    double sum = 0;
    for (int i = 1; i <= TO; i++) {
      sum += Math.pow(-1, i + 1) / (2 * i - 1);

      if (i % PERIOD == 0) {
        System.out.printf("PI = %.15f %,8d Iterations\n", 4 * sum, i);
      }
    }
  }
}
