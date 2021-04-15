package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final4/sweep
 *
 * If a pair of adjacent elements are out of order
 * (if the element at the lower index has a greater value than the element
 * at the higher index), your method should swap them.
 * If your method ends up swapping any elements, it should return
 * true to indicate that the array was changed.
 *
 * test #5: sweep({2, 3, 5, 7, 11, 13})
 *          return:false
 *          parameters:{2, 3, 5, 7, 11, 13}
 *          result: pass
 *
 * test #6: sweep({42})
 *          return:false
 *          parameters:{42}
 *          result: pass
 *
 * @author Alex Golub
 * @since 13-Apr-21 9:04 PM
 */
class sweep {
  public static boolean sweep(int[] arr) {
    boolean swapped = false;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1] > arr[i]) {
        swapped = true;
        int temp = arr[i - 1];
        arr[i - 1] = arr[i];
        arr[i] = temp;
      }
    }

    return swapped;
  }
}
