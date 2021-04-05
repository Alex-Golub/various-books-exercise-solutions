package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section7/findMin
 *
 * test #1:findMin({16, 12, 25, 44})
 * return:12
 * result: pass
 *
 * test #2:findMin({1, 2, 3, 4})
 * return:1
 * result: pass
 *
 * test #3:findMin({4, 17, -9, 3, -2, 21})
 * return:-9
 * result: pass
 *
 * test #4:findMin({42})
 * return:42
 * result: pass
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:47 AM
 */
class findMin {
  // pre: arr.length >= 1
  public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i : arr) {
      min = Math.min(i, min);
    }
    return min;
  }
}
