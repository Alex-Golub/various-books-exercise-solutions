package cse_142.cs1_sections.section07_arrays;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section7/countLastDigits
 *
 * test #1:countLastDigits({9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20})
 * return:{1, 0, 4, 1, 1, 1, 1, 0, 0, 2}
 * result: pass
 *
 * test #2:countLastDigits({87, 76, 897, 7632, 907, 8907, 786, 7564})
 * return:{0, 0, 1, 0, 1, 0, 2, 4, 0, 0}
 * result: pass
 *
 * test #3:countLastDigits({42})
 * return:{0, 0, 1, 0, 0, 0, 0, 0, 0, 0}
 * result: pass
 *
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:54 AM
 */
class countLastDigits {
  public static void main(String[] args) {
    int[] countLastDigits = countLastDigits(new int[]{9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20});
    System.out.println(Arrays.toString(countLastDigits));
  }

  // return an array of counters
  public static int[] countLastDigits(int[] arr) {
    int[] counter = new int[10]; // default value of each cell is 0
    for (int i : arr) {
      counter[i % 10]++; // take last digit and increment the required cell in counter
    }

    return counter;
  }
}
