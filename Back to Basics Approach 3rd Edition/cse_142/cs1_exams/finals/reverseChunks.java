package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final6/reverseChunks
 *
 * If a's length is not evenly divisible by s, the remaining elements are untouched.
 * You may assume that s is 1 or greater (an s of 1 would not modify the array).
 *
 * test #5:reverseChunks({}, 1);
 * parameters:{}
 * result: pass
 *
 * test #1:reverseChunks({1, 2, 3, 4, 5, 6, 7, 8}, 3);
 * parameters:{3, 2, 1, 6, 5, 4, 7, 8}
 * result: pass
 *
 * @author Alex Golub
 * @since 14-Apr-21 8:18 PM
 */
class reverseChunks {
  public static void reverseChunks(int[] arr, int s) {
    for (int i = 0; i <= arr.length - s; i += s) {
      reverse(arr, i, i + s - 1);
    }
  }

  private static void reverse(int[] arr, int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
}
