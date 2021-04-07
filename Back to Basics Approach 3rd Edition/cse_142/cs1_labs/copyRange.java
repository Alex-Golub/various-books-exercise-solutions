package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/copyRange
 *
 * test #1: copyRange({1, 2, 3}, {4, 5, 6}, 0, 0, 1);
 *          parameters:{1, 5, 6}
 *          result: pass
 * test #2: copyRange({1, 2, 3, 4, 5, 6}, {21, 22, 23, 24, 25, 26}, 0, 3, 2);
 *          parameters:{21, 22, 23, 1, 2, 26}
 *          result: pass
 * test #3: copyRange({1, 2, 3, 4, 5, 6}, {21, 22, 23, 24, 25, 26}, 3, 0, 3);
 *          parameters:{4, 5, 6, 24, 25, 26}
 *          result: pass
 * test #4: copyRange({5, 7, 8, 22, 55, 6, 70, -1, -4, 5, 17, 221, 102, 3, 1415926535}, {1, 2, 3, 4, 5, 6, 7, 8,...
 *          parameters:{1, 2, 55, 6, 70, -1, -4, 5, 17, 10}
 *          result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:52 PM
 */
class copyRange {

  // pre: parameters' values are valid, that the arrays are large enough
  // to hold the data, and so on.
  public static void copyRange(int[] a1, int[] a2, int i1, int i2, int l) {
    System.arraycopy(a1, i1, a2, i2, l);
  }
}
