package cse_142.cs1_sections.section07_arrays;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/4192?categoryid=120
 *
 * The first value in the result should be the sum of every fifth number
 * in the list starting with the first number (1st, 6th, 11th, 16th, etc),
 * the second value in the result should be the sum of every fifth number
 * in the list starting with the second number (2nd, 7th, 12th, 17th, etc),
 * the third value in the result should be the sum of every fifth number in
 * the list starting with the third number (3rd, 8th, 13th, 18th, etc), and so on.
 *
 * test #1:sum5({7, 2, 8, 9, 4, 13, 7, 1, 9, 10})
 * return:{20, 9, 9, 18, 14}
 * result: pass
 *
 * test #2:sum5({1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
 * return:{7, 9, 11, 13, 15}
 * result: pass
 *
 * test #3:sum5({1, 1})
 * return:{1, 1, 0, 0, 0}
 * result: pass
 *
 *
 * @author Alex Golub
 * @since 04-Apr-21 12:03 PM
 */
class sum5 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(sum5(new int[]{7, 2, 8, 9, 4, 13, 7, 1, 9, 10})));
  }

  public static int[] sum5(int[] arr) {
    int[] sum5 = new int[5];
    for (int i = 0; i < arr.length; i++) {
      sum5[i % 5] += arr[i];
    }

    return sum5;
  }
}
