package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final12/countCommon
 *
 * @author Alex Golub
 * @since 15-Apr-21 9:02 PM
 */
class countCommon {
  public static int countCommon(String[] a, String[] b, String[] c) {
    int count = 0;
    int to = Math.min(a.length, Math.min(b.length, c.length));
    for (int i = 0; i < to; i++) {
      if (a[i].equals(b[i]) && a[i].equals(c[i])) {
        count++;
      }
    }
    return count;
  }
}
