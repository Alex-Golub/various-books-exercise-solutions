package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm6/hopscotch
 *
 * test #1:hopscotch(3);
 * console output:
 *    1
 * 2     3
 *    4
 * 5     6
 *    7
 * 8     9
 *    10
 * result: pass
 *
 * test #2:hopscotch(2);
 * console output:
 *    1
 * 2     3
 *    4
 * 5     6
 *    7
 * result: pass
 *
 * test #3:hopscotch(1);
 * console output:
 *    1
 * 2     3
 *    4
 * result: pass
 *
 * test #4:hopscotch(0);
 * console output:
 *    1
 * result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 5:01 PM
 */
class hopscotch {
  public static void main(String[] args) {
    hopscotch(2);
    System.out.println();
    hopscotch(3);
  }

  /**
   * A "hop" is defined as the split into two numbers and then
   * back together again into one.
   * x+1     x+2
   *     x+3
   */
  public static void hopscotch(int hops) {
    if (hops < 0) return;

    System.out.println("   1");
    for (int i = 1; hops > 0; i += 3, hops--) {
      System.out.printf("%d     %d\n", i + 1, i + 2);
      System.out.printf("   %d\n", i + 3);
    }
  }
}
