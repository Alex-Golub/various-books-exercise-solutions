package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/reverse
 *
 * test #1: reverse({11, 42, -5, 27, 0, 89});
 *          parameters:{89, 0, 27, -5, 42, 11}
 *          result: pass
 *
 * test #2: reverse({10, 20, 30, 40, 50});
 *          parameters:{50, 40, 30, 20, 10}
 *          result: pass
 *
 * test #3: reverse({1111, 19, 28, 37, 46, 55, 0, 24, 68, 100, -1, 99});
 *          parameters:{99, -1, 100, 68, 24, 0, 55, 46, 37, 28, 19, 1111}
 *          result: pass
 *
 * test #4: reverse({42, 999});
 *          parameters:{999, 42}
 *          result: pass
 *
 * test #5: reverse({42});
 *          parameters:{42}
 *          result: pass
 *
 * test #6: reverse({});
 *          parameters:{}
 *          result: pass
 *
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:39 PM
 */
class reverse {
  public static void reverse(int[] arr) {
    int length = arr.length;
    for (int i = 0; i < length / 2; i++) {
      swap(arr, i, length - i - 1);
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
