package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final10/swapPairs
 *
 * @author Alex Golub
 * @since 15-Apr-21 4:29 PM
 */
class swapPairs {
  public static void swapPairs(String[] a) {
    for (int i = 1; i < a.length; i += 2) {
      String temp = a[i - 1];
      a[i - 1] = a[i];
      a[i] = temp;
    }
  }
}
