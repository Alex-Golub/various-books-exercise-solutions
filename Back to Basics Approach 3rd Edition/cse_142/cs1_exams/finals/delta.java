package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final12/delta
 *
 * @author Alex Golub
 * @since 15-Apr-21 9:11 PM
 */
class delta {
  public static int[] delta(int[] arr) {
    int[] deltaArr = new int[2 * arr.length - 1];
    deltaArr[0] = arr[0]; // You may assume that the array contains at least one element.

    for (int i = 0; i < arr.length - 1; i++) {
      deltaArr[2 * i] = arr[i];
      deltaArr[2 * i + 2] = arr[i + 1];
      deltaArr[2 * i + 1] = arr[i + 1] - arr[i];
    }

    return deltaArr;
  }
}
