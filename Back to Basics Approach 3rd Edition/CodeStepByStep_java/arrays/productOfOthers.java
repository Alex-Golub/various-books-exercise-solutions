package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named productOfOthers that accepts an array
 * of integers a as its parameter and returns a new array where
 * each element at index i stores the product of all elements
 * in a excluding a[i].
 *
 * For example, if the array a stores {1, 4, 3, 4, 2},
 * the call of productOfOthers(a) should return {96, 24, 32, 24, 48}.
 *
 * 1. You may assume that the product of all elements in the array
 * is within the domain of integers (type int).
 *
 * 2. This problem can be solved in O(N) time and with O(1) memory usage.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 4:32 PM
 */
class productOfOthers {
  public static void main(String[] args) {
    int[] a = {1, 4, 3, 4, 2};
    System.out.println(Arrays.toString(productOfOthers(a)));
  }

  public static int[] productOfOthers(int[] a) {
    int product = 1;
    for (int value : a)
      product *= value;

    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] == 0 ? 0 : product / a[i];
    }

    return a;
  }
}
