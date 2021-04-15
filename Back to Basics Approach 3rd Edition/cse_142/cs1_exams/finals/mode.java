package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final5/mode
 *
 * @author Alex Golub
 * @since 13-Apr-21 10:22 PM
 */
class mode {
  public static void main(String[] args) {
//    int[] list = {-3, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 9, 11, 11, 11, 12, 14, 14};
//    int[] list = {1, 2, 2, 2, 5, 7, 9, 9, 9};
    int[] list = {1, 3, 4, 5, 45, 53, 65};
    System.out.println(mode(list));
  }

  public static int mode(int[] a) {
    int maxSoFar = 0;
    int curr = 1;
    int value = 0;

    for (int i = 1; i < a.length; i++) {
      if (a[i] == a[i - 1]) {
        curr++;
      } else if (curr > maxSoFar) {
        maxSoFar = curr;
        value = a[i - 1]; // this value occurred the most in sequence
        curr = 1;
      }
    }

    return maxSoFar < curr ? a[a.length - 1] : value;
  }
}
