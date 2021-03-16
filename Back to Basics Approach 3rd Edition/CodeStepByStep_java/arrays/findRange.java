package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named findRange that accepts an array of integers
 * as a parameter and returns the range of values contained in the array,
 * which is equal to one more than the difference between its largest and
 * smallest element.
 * For example, if the largest element is 17 and the smallest is 6,
 * the range is 12.
 * If the largest and smallest values are the same, the range is 1.
 *
 * Constraints:
 * 1. You may assume that the array contains at least one element
 * (that its length is at least 1).
 * 2. You should not modify the contents of the array.
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 6:44 PM
 */
class findRange {
  public static void main(String[] args) {
    int[] list = {12, 10, 11, 8, 9, 10, 17, 17, 6};
    System.out.println(Arrays.toString(list));
    System.out.println(findRange(list)); // 12
  }

  public static int findRange(int[] list) {
    int[] minmax = minmax(list);
    return minmax[1] - minmax[0] + 1;
  }

  private static int[] minmax(int[] list) {
    int[] minmax = {list[0], list[0]};
    for (int value : list) {
      minmax[0] = Math.min(minmax[0], value);
      minmax[1] = Math.max(minmax[1], value);
    }

    return minmax;
  }
}
