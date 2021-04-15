package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final4/hasMirrorTwice
 *
 * @author Alex Golub
 * @since 13-Apr-21 9:09 PM
 */
class hasMirrorTwice {
  public static void main(String[] args) {
    int[] a1 = {6, 1, 2, 1, 3, 1, 3, 2, 1, 5};
    int[] a2 = {1, 2};
    System.out.println(hasMirrorTwice(a1, a2));
  }

  public static boolean hasMirrorTwice(int[] a1, int[] a2) {
    int mirrorCount = 0;
    for (int i = 0; i <= a1.length - a2.length; i++) {
      int count = 0;

      for (int j = 0; j < a2.length; j++) {
        if (a1[i + j] == a2[a2.length - 1 - j]) {
          count++;
        }
      }

      if (count >= a2.length)
        mirrorCount++;
    }

    return mirrorCount >= 2;
  }
}
