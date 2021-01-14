package chapter7_arrays;

import java.util.Arrays;

/**
 * Write a method called evenBeforeOdd that accepts an array of
 * integers and rearranges its elements so that all even values
 * appear before all odds.
 *
 * The array might contain no even elements or no odd elements.
 * Do not use any temporary arrays in your solution,
 * and do not call Arrays.sort.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 9:07 PM
 */
class Ex7_18_2_evenBeforeOdd {
  public static void main(String[] args) {
    int[] arr = {5, 4, 2, 11, 9, 10, 4, 7, 3};
    int[] res = {4, 2, 10, 4, 5, 11, 9, 7, 3};

    evenBeforeOdd(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.equals(res, arr));
  }

  public static void evenBeforeOdd(int[] arr) {
    // O(n^2)
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = i + 1; j < arr.length; j++) {
//        if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
//          swap(arr, i, j);
//          break;
//        }
//      }
//    }

    // Optimized version O(n)
    // possibilities:
    // a[i]  a[j]  action
    // odd   odd   j--
    // odd   even  swap
    // even  odd   i++, j--
    // even  even  i++
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      boolean even = arr[i] % 2 == 0;
      boolean odd  = arr[j] % 2 != 0;

      if (!even && odd)
        j--;

      if (!even && !odd)
        swap(arr, i, j);

      if (even && odd) {
        i++;
        j--;
      }

      if (even && !odd) i++;
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
}
