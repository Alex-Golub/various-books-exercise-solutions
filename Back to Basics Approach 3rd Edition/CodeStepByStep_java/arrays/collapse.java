package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named collapse that accepts an array of integers
 * as a parameter and returns a new array where each pair of integers
 * from the original array has been replaced by the sum of that pair.
 *
 * If the list stores an odd number of elements, the final element
 * is not collapsed.
 * Your method should not change the array that is passed as a parameter.
 *
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 11:18 PM
 */
class collapse {
  public static void main(String[] args) {
//    int[] arr = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(collapse(arr)));
  }

  public static int[] collapse(int[] list) {
    int[] res = new int[(list.length + 1) / 2]; // ceil result

    for (int i = 0, j = 0; i < list.length - 1; i += 2, j++) {
      res[j] = list[i] + list[i + 1];
    }

    if (list.length % 2 != 0)
      res[res.length - 1] = list[list.length - 1];

    return res;
  }
}
