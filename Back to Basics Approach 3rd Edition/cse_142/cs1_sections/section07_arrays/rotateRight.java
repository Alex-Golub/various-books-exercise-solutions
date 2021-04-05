package cse_142.cs1_sections.section07_arrays;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section7/rotateRight
 *
 * test #1:rotateRight({3, 8, 19, 7});
 * parameters:{7, 3, 8, 19}
 * result: pass
 *
 * test #2:rotateRight({10, 20, 30, 40, 50, 60, 70});
 * parameters:{70, 10, 20, 30, 40, 50, 60}
 * result: pass
 *
 * test #3:rotateRight({100, 200});
 * parameters:{200, 100}
 * result: pass
 *
 * test #4:rotateRight({42});
 * parameters:{42}
 * result: pass
 *
 *
 * @author Alex Golub
 * @since 04-Apr-21 12:26 PM
 */
class rotateRight {
  public static void main(String[] args) {
    int[] arr = {3, 8, 19, 7};
    rotateRight(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void rotateRight(int[] arr) {
    int[] temp = new int[arr.length];
    int rotateBy = 1; // can work for any +ve number

    // copy last n numbers from arr to temp
    System.arraycopy(arr, arr.length - rotateBy, temp, 0, rotateBy);

    // copy arr.length - rotateBy elements from start of arr
    System.arraycopy(arr, 0, arr, rotateBy, arr.length - rotateBy);

    // copy from temp rotateBy elements back to arr
    System.arraycopy(temp, 0, arr, 0, rotateBy);
  }
}
