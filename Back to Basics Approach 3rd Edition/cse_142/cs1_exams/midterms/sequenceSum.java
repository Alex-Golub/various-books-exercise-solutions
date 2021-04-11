package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm1/sequenceSum
 *
 * test #1:sequenceSum(0.0);
 * console output:
 * result: pass
 *
 * test #2:sequenceSum(0.5);
 * console output:
 * result: pass
 *
 * test #3:sequenceSum(1.0);
 * console output:
 * 1 = 1.000
 * result: pass
 *
 * test #4:sequenceSum(1.2);
 * console output:
 * 1 + 1/2 = 1.500
 * result: pass
 *
 * test #5:sequenceSum(1.5);
 * console output:
 * 1 + 1/2 = 1.500
 * result: pass
 *
 * test #6:sequenceSum(2.0);
 * console output:
 * 1 + 1/2 + 1/3 + 1/4 = 2.083
 * result: pass
 *
 * test #7:sequenceSum(2.345);
 * console output:
 * 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 = 2.450
 * result: pass
 *
 * test #8:sequenceSum(2.7);
 * console output:
 * 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 = 2.718
 * result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 9:28 PM
 */
class sequenceSum {
  public static void main(String[] args) {
    sequenceSum(0.0);
    sequenceSum(1.0);
    sequenceSum(1.5);
    sequenceSum(2.7);
  }

  public static void sequenceSum(double limit) {
    if (limit < 1.0) {
      return;
    }

    double sum = 1;
    System.out.print(1);
    for (int i = 2; Double.compare(sum, limit) < 0; i++) {
      System.out.print(" + " + 1 + "/" + i);
      sum += 1.0 / i;
    }

    System.out.printf(" = %.3f\n", sum);
  }
}
