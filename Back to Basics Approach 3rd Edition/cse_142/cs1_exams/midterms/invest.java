package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm11/invest
 *
 * test #1:invest(100.0, 10.0, 5);
 * console output:
 * After year 1: $110.00
 * After year 2: $121.00
 * After year 3: $133.10
 * After year 4: $146.41
 * After year 5: $161.05
 * Total interest earned: $61.05
 *
 * @author Alex Golub
 * @since 11-Apr-21 7:58 PM
 */
class invest {
  public static void main(String[] args) {
    invest(100.0, 10.0, 5);
  }

  public static void invest(double initial, double yearlyInterest, int years) {
    double earned = 0.0;
    double percent = yearlyInterest / 100;
    for (int i = 1; i <= years; i++) {
      earned += initial * percent;
      initial = initial + initial * percent;
      System.out.printf("After year %d: $%.2f\n", i, initial);
    }

    System.out.printf("Total interest earned: $%.2f", earned);
  }
}
