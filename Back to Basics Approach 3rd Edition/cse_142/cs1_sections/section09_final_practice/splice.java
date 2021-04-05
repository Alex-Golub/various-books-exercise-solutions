package cse_142.cs1_sections.section09_final_practice;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/splice
 *
 * "from index" (inclusive) and "to index" (exclusive) and that returns a
 * new array containing the result of splicing together three segments of
 * the array.
 *
 * arr = [7, 5, 8, 5, 9, 7, 2, 3]
 * splice(arr, 2, 4)
 * [7, 5]           [8, 5]    [9, 7, 2, 3]
 * before sublist   sublist   after sublist
 *
 * The new array should contain the values after the sublist followed by
 * the values in the sublist followed by the values before the sublist.
 * For this example, it would return [9, 7, 2, 3, 8, 5, 7, 5].
 *
 * 1. You may assume that the indexes passed as parameters specify a legal
 * sublist of the list, although it might be empty.
 * 2. The method should not construct any extra data structures other than
 * the array to be returned and it should not alter its array parameter.
 * 3. You are not allowed to call methods of the Arrays class to solve this problem.
 *
 * @author Alex Golub
 * @since 05-Apr-21 11:54 AM
 */
class splice {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(splice(new int[] {7, 5, 8, 5, 9, 7, 2, 3}, 2, 4)));
  }

  // pre: arr != null, from <= to
  public static int[] splice(int[] arr, int from, int to) {
    int[] returnValue = new int[arr.length];
    System.arraycopy(arr, to, returnValue, 0, arr.length - to);
    System.arraycopy(arr, from, returnValue, arr.length - to, to - from);
    System.arraycopy(arr, 0, returnValue, arr.length - (to - from), from);

    return returnValue;
  }
}
