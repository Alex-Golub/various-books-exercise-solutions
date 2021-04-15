package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final13/evenOdd
 *
 * The array passed in will always contain exactly as many even values as odd values.
 * starting with even.
 * You may not create an additional array or use a String to solve this problem.
 *
 * @author Alex Golub
 * @since 15-Apr-21 10:53 PM
 */
class evenOdd {
  public static void evenOdd(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != i % 2) {
        int j = i;

        while (j < a.length - 1 && a[j] % 2 != i % 2) {
          j++;
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
  }
}
