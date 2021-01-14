package chapter7_arrays;

import java.util.Arrays;

/**
 * 2. Write a method called range that returns the range of
 * values in an array of integers. The range is defined as 1 more
 * than the difference between the maximum and minimum values in
 * the array.
 * You may assume that the array has at least one element.
 * e.g: range([36, 12, 25, 19, 46, 31, 22]) -> 35
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 7:16 PM
 */
class Ex7_2_range {
  public static void main(String[] args) {
    int[] minmax = minmax(new int[]{});
    System.out.println(Arrays.toString(minmax));
  }

  public static int range(int[] list) {
    int[] minmax = minmax(list);
    return minmax[1] - minmax[0] + 1;
  }

  private static int[] minmax(int[] list) {
    int min = list[0];
    int max = min;
    for (int val : list) {
      max = Math.max(val, max);
      min = Math.min(val, min);
    }
    return new int[]{min, max};
  }
}
