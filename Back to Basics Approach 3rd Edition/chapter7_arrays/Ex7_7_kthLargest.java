package chapter7_arrays;

import java.util.Arrays;

/**
 * 7. Write a method called kthLargest that accepts an integer k
 * and an array a as its parameters and returns the element such
 * that k elements have greater or equal value.
 * If k = 0, return the largest element;
 * if k = 1, return the second-largest element, and so on.
 * For example, if the array passed contains the values
 * [74, 85, 102, 99, 101, 56, 84] and the integer k passed is 2,
 * your method should return 99 because there are two values at
 * least as large as 99 (101 and 102).
 * Assume that 0 <= k < a.length
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 8:44 PM
 */
class Ex7_7_kthLargest {
  public static int kthLargest(int k, int[] list) {
    int[] copy = Arrays.copyOf(list, list.length);
    Arrays.sort(copy);
    return copy[copy.length - k - 1];
  }
}
