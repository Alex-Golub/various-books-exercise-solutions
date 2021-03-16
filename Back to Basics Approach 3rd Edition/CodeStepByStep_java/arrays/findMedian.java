package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named findMedian that accepts an array of integers as
 * its parameter and returns the median of the numbers in the array.
 * The median is the number that will appear in the middle if you arrange
 * the elements in order.
 *
 * Constrains:
 * 1. Assume that the array is of odd size
 * (so that one sole element constitutes the median)
 * 2. numbers in the array are between 0 and 99 inclusive.
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 6:28 PM
 */
class findMedian {
  public static void main(String[] args) {
//    int[] arr = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
    int[] arr = {4, 5, 2, 3, 2, 10, 4};
    System.out.println(findMedian(arr)); // 5

    int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
    System.out.println(findMedian(arr2)); // 25
  }

  public static int findMedian(int[] list) {
    int[] copy = Arrays.copyOf(list, list.length);
    Arrays.sort(copy);
    return copy[copy.length / 2];
  }
}
