package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final10/banish
 *
 * @author Alex Golub
 * @since 15-Apr-21 4:32 PM
 */
class banish {
  public static void banish(int[] a1, int[] a2) {
    for (int i = 0; i < a1.length; i++) {
      boolean found = false;

      for (int k : a2) {
        if (a1[i] == k) {
          // value in a1 appeared in a2
          found = true;
          break;
        }
      }

      if (found) { // shift a1 place to the left and conver last value to 0
        if (a1.length >= i + 1) {
          System.arraycopy(a1, i + 1,
                           a1, i,
                           a1.length - (i + 1));
        }

        a1[a1.length - 1] = 0;
        i--; // compensate the left shift
      }
    }
  }
}
