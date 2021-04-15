package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final13/repeatedSequence
 *
 * @author Alex Golub
 * @since 15-Apr-21 10:45 PM
 */
class repeatedSequence {
  public static boolean repeatedSequence(int[] a1, int[] a2) {
    if (a2.length % a1.length != 0) {
      return false;
    }

    for (int i = 0; i < a2.length; i++) {
      if (a2[i] != a1[i % a1.length]) {
        return false;
      }
    }

    return true;
  }
}
