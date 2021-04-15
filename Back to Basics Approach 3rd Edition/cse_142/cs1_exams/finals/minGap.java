package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final2/minGap
 *
 * test #3:minGap({60})
 * return:0
 * result: pass
 *
 * test #5:minGap({3, 5, 11, 4, 8})
 * return:-7
 * result: pass
 *
 * @author Alex Golub
 * @since 12-Apr-21 7:25 PM
 */
class minGap {
  public static int minGap(int[] arr) {
    if (arr.length < 2) {
      return 0;
    }

    int minGap = arr[1] - arr[0];
    for (int i = 2; i < arr.length; i++) {
      minGap = Math.min(minGap, arr[i] - arr[i - 1]);
    }

    return minGap;
  }
}
