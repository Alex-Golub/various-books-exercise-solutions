package cse_142.cs1_exams.finals;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final9/longer
 *
 * @author Alex Golub
 * @since 15-Apr-21 2:33 PM
 */
class longer {
  public static String[] longer(String[] a, String[] b) {
    String[] c = new String[Math.max(a.length, b.length)];
    int i = 0, j = 0;

    while (i < a.length && j < b.length) {
      c[i] = a[i].length() < b[j].length() ? b[j] : a[i];
      i++;
      j++;
    }

    Arrays.fill(c, i, c.length, "oops");
    Arrays.fill(c, j, c.length, "oops");

    return c;
  }
}
