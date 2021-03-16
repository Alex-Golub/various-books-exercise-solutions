package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named banish that accepts two arrays of integers a1 and a2
 * as parameters and removes all occurrences of a2's values from a1.
 * An element is "removed" by shifting all subsequent elements one index to
 * the left to cover it up, placing a 0 into the last index.
 * The original relative ordering of a1's elements should be retained.
 *
 * Constrains:
 * 1. Do not make any assumptions about the length of the arrays
 * or the ranges of values each might contain.
 * 2. You may assume that the arrays passed are not null.
 * 3. You may assume that the values stored in a2 are unique and that a2
 * does not contain the value 0.
 * 4. You may not use any temporary arrays to help you solve this problem.
 * 5. You also may not use any other data structures or complex types such
 * as Strings, or other data structures such as the ArrayList class.
 *
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 10:09 PM
 */
class banish { // TODO
  public static void main(String[] args) {
    int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
    int[] a2 = {42, 2222, 9};
    banish(a1, a2);

    System.out.println(Arrays.toString(a1));
  }

  public static void banish(int[] a1, int[] a2) {

  }
}



















