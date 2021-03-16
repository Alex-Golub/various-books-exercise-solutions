package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named evenBeforeOdd that accepts an array of
 * integers as a parameter and rearranges its elements so that
 * all even values appear before all odds.
 *
 * Constrains:
 * 1. The exact order of the elements does not matter
 * 2. Do not make any assumptions about the length of the array or
 * the range of values it might contain.
 * 3. You should not use any temporary arrays to help you solve this problem.
 * 4. You may not use any other data structures such as Strings orArrayLists.
 * 5. You should not use Arrays.sort in your solution.
 *
 * Approach:
 * Use two pointers low, high at the extremes of the array.
 * 4 possible situations can be observer:
 * even even => low--
 * even odd  => low++, high--
 * odd  even => swap, low++, high--
 * odd  odd  => high--
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 5:57 PM
 */
class evenBeforeOdd {
  public static void main(String[] args) {
    int[] arr = {5, 2, 4, 9, 3, 6, 2, 1, 11, 1, 10, 4, 7, 3};
    System.out.println(Arrays.toString(evenBeforeOdd(arr)));
  }

  public static int[] evenBeforeOdd(int[] arr) {
    int low  = 0;
    int high = arr.length - 1;

    while (low < high) {
      if (arr[low] % 2 == 0 && arr[high] % 2 == 0) {
        low++;
      } else if (arr[low] % 2 == 0 && arr[high] % 2 == 1) {
        low++;
        high--;
      } else if (arr[low] % 2 == 1 && arr[high] % 2 == 0) {
        swap(arr, low, high);
        low++;
        high--;
      } else {
        high--;
      }
    }

    return arr;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

