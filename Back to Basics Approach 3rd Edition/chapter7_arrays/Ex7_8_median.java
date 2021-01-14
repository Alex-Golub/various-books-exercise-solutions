package chapter7_arrays;

import java.util.Arrays;

/**
 * 8. Write a method called median that accepts an array of integers
 * as its parameter and returns the median of the numbers in the array.
 * The median is the number that appears in the middle of the list if
 * you arrange the elements in order.
 * Assume that the array is of odd size (so that one sole element
 * constitutes the median) and that the numbers in the
 * array are between 0 and 99 inclusive.
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 10:20 PM
 */
class Ex7_8_median {
  public static void main(String[] args) {
//    int[] list = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17}; // 5
    int[] list   = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27}; // 25
    int   median = median(list);
    System.out.println(median);
  }

  public static int median(int[] list) {
    Arrays.sort(list);
    return list[list.length / 2];
  }
}