package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final3/range
 *
 * test #3:range({3, 10000000, 5, -29, 4})
 * return:10000030
 * result: pass
 *
 * @author Alex Golub
 * @since 12-Apr-21 9:28 PM
 */
class range {
  public static int range(int[] arr) {
    int[] minMax = minMax(arr);
    return minMax[1] - minMax[0] + 1;
  }

  /**
   * You may assume that the array contains at least one element
   */
  public static int[] minMax(int[] arr) {
    int min = arr[0];
    int max = min;
    for (int ele : arr) {
      min = Math.min(min, ele);
      max = Math.max(max, ele);
    }

    return new int[] {min, max};
  }
}
