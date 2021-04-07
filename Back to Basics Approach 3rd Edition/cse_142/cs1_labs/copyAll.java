package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/copyAll
 *
 * test #1: copyAll({2, 1, 4, 3, 6, 5}, {0, 0, 0, 0, 0, 0});
 *          parameters:{2, 1, 4, 3, 6, 5}
 *          result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:50 PM
 */
class copyAll {

  // pre: You may assume that the second array is always at least
  // as large in length as the first array.
  public static void copyAll(int[] a, int[] b) {
    System.arraycopy(a, 0, b, 0, a.length);
  }
}
