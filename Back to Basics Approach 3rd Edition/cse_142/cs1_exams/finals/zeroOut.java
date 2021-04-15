package cse_142.cs1_exams.finals;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final3/zeroOut
 *
 * You may assume that both arrays passed to your method will have lengths
 * of at least 1.
 * If a2 is not found in a1, or if a1's length is shorter than a2's,
 * then a1 is not modified by the call to your method.
 * Please note that a1's contents are being modified in place;
 * you are not supposed to return a new array.
 * Do not modify the contents of a2.
 *
 * @author Alex Golub
 * @since 12-Apr-21 9:33 PM
 */
class zeroOut {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 1, 2, 3, 4, 5};
    int[] a2 = {2, 3, 4};
    zeroOut(a1, a2);
    System.out.println(Arrays.toString(a1));

    int[] a3 = {5, 5, 5, 18, 5, 42, 5, 5, 5, 5};
    int[] a4 = {5, 5};
    zeroOut(a3, a4);
    System.out.println(Arrays.toString(a3));
  }

  public static void zeroOut(int[] a1, int[] a2) {
    int i2 = 0;
    for (int i1 = 0; i1 < a1.length; i1++) {
      if (a1[i1] == a2[i2]) { // match occurred
        i2++;
        if (i2 == a2.length) {
          for (int i = 0; i < a2.length; i++) {
            a1[i1 - i] = 0;
          }
          i2 = 0;
        }
      } else {
        i2 = 0;
      }
    }
  }
}
