package CodeStepByStep_java.arrays.multi_dimensional_arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a method named isUnique that accepts a 2-D array of integers
 * as a parameter and that returns a boolean value indicating whether
 * or not the values in the array are unique (true for yes, false for no).
 * The values in the list are considered unique if there is no pair of
 * values that are equal.
 *
 * Constraints:
 * 1. You may use one auxiliary data structure of your choice to
 * help you solve this problem.
 *
 * 2. Your method should not modify the array that is passed in.
 *
 * 3. An array of 0 or 1 elements would be considered unique.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 5:15 PM
 */
class isUnique {
  public static void main(String[] args) {
    int[][] matrix = {{3, 8, 12}, {2, 9, 17}, {43, -8, 46}, {203, 14, 97}};
    System.out.println(isUnique(matrix)); // true
  }

  public static boolean isUnique(int[][] m) {
    Set<Integer> set = new HashSet<>();
    for (int[] row : m) {
      for (int value : row) {
        if (set.contains(value)) {
          return false;
        }

        set.add(value);
      }
    }

    return true;
  }
}
