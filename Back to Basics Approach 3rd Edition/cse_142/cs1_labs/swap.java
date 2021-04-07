package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/swap
 *
 * test #1: swap({11, 42, -5, 27, 0, 89}, 1, 3);
 *          parameters:{11, 27, -5, 42, 0, 89}
 *          result: pass
 *
 * test #2: swap({10, 20, 30, 40, 50, 60, 70}, 0, 5);
 *          parameters:{60, 20, 30, 40, 50, 10, 70}
 *          result: pass
 *
 * test #3: swap({10, 20, 30, 40, 50, 60, 70}, 6, 3);
 *          parameters:{10, 20, 30, 70, 50, 60, 40}
 *          result: pass
 *
 * test #4: swap({42, 999}, 1, 0);
 *          parameters:{999, 42}
 *          result: pass
 *
 * test #5: swap({42, 999}, 1, 1);
 *          parameters:{42, 999}
 *          result: pass
 *
 * test #6: swap({42}, 0, 0);
 *          parameters:{42}
 *          result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:45 PM
 */
class swap {
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
