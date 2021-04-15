package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final9/evenBeforeOdd
 *
 * NB: You should not use any temporary arrays to help you solve this problem.
 *
 * @author Alex Golub
 * @since 15-Apr-21 2:40 PM
 */
class evenBeforeOdd {
  public static void evenBeforeOdd(int[] a) {
    int i = 0;

    // locate first odd number (if exists)
    while (i < a.length && a[i] % 2 == 0) {
      i++;
    }

    for (int j = i + 1; j < a.length; j++) {
      if (a[j] % 2 == 0) {
        swap(a, i, j);
        i++;
      }
    }
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
