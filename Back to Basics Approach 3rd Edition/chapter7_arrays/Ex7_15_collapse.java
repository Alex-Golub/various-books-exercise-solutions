package chapter7_arrays;

import java.util.Arrays;

/**
 * 15. Write a method called collapse that accepts an array of integers
 * as a parameter and returns a new array containing the result of replacing
 * each pair of integers with the sum of that pair.
 *
 * If the list stores an odd number of elements, the final element
 * is not collapsed.
 * Your method should not change the array that is passed as a parameter.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 7:47 PM
 */
class Ex7_15_collapse {
  public static void main(String[] args) {
    int[] list = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
    int[] res  = {9, 17, 17, 8, 19};
    System.out.println(Arrays.equals(collapse(list), res)); // true

    list = new int[]{1, 2, 3, 4, 5};
    res = new int[]{3, 7, 5};
    System.out.println(Arrays.equals(collapse(list), res)); // true
  }

  public static int[] collapse(int[] list) {
    int[] sum = new int[(list.length + 1) / 2];
    int   j   = 0;

    for (int i = 1; i < list.length; i += 2, j++) // look back approach
      sum[j] = list[i - 1] + list[i];

    // if |list| == 2n - 1 then last element will always
    // be in sum array
    if (list.length % 2 != 0)
      sum[j] = list[list.length - 1];

    return sum;
  }
}
