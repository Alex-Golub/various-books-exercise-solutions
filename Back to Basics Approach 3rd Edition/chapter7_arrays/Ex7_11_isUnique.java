package chapter7_arrays;

import java.util.Arrays;

/**
 * 11. Write a method called isUnique that accepts an array of integers
 * as a parameter and returns a boolean value
 * indicating whether or not the values in the array are
 * unique (true for yes, false for no).
 * The values in the list are considered unique if there is no pair
 * of values that are equal.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 4:41 PM
 */
class Ex7_11_isUnique {
  public static void main(String[] args) {
    int[] arr = {3, 8, 12, 2, 9, 17, 43, -8, 46};
    System.out.println(isUnique(arr)); // true

    arr = new int[]{4, 7, 3, 9, 12, -47, 3, 74};
    System.out.println(isUnique(arr)); // false;
  }

  public static boolean isUnique(int[] list) {
    if (list == null || list.length == 0)
      return true;

    Arrays.sort(list);
    for (int i = 1; i < list.length; i++) {
      if (list[i - 1] == list[i])
        return false;
    }

    return true;
  }
}
