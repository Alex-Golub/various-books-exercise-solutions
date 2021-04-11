package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm8/findAllPerfectUpTo
 * A "perfect number" is a positive integer that is the sum of all its
 * proper factors (that is, factors including 1 but not the number itself).
 *
 * test #1:findAllPerfectUpTo(1);
 * console output:
 * Perfect numbers up to 1:
 * result: pass
 *
 * test #2:findAllPerfectUpTo(6);
 * console output:
 * Perfect numbers up to 6: 6
 * result: pass
 *
 * test #3:findAllPerfectUpTo(500);
 * console output:
 * Perfect numbers up to 500: 6 28 496
 * result: pass
 *
 * test #4:findAllPerfectUpTo(20);
 * console output:
 * Perfect numbers up to 20: 6
 * result: pass
 *
 * test #5:findAllPerfectUpTo(2345);
 * console output:
 * Perfect numbers up to 2345: 6 28 496
 * result: pass
 *
 * @author Alex Golub
 * @since 11-Apr-21 5:49 PM
 */
class findAllPerfectUpTo {
  public static void main(String[] args) {
    findAllPerfectUpTo(1);
    findAllPerfectUpTo(6);
    findAllPerfectUpTo(500);
  }

  /**
   * prints out all perfect numbers that are less than or equal to max.
   */
  public static void findAllPerfectUpTo(int max) {
    System.out.print("Perfect numbers up to " + max + ":");
    if (max < 6) {
      return;
    }

    for (int i = 6; i <= max; i++) {
      if (sumOfFactors(i) == i) {
        System.out.print(" " + i);
      }
    }
    System.out.println();
  }

  private static int sumOfFactors(int n) {
    int sum = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        sum += i;

        if (n / i != i) {
          sum += n / i;
        }
      }
    }

    return sum - n;
  }
}
