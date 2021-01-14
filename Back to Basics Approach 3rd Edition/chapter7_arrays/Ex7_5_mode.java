package chapter7_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 5. Write a method called mode that returns the most frequently
 * occurring element of an array of integers.
 * Assume that the array has at least one element and that every
 * element in the array has a value between 0 and 100 inclusive.
 * Break ties by choosing the lower value.
 * For example, if the array passed contains the values [27, 15, 15, 11, 27],
 * your method should return 15.
 *
 * Can you write a version of this method that does not rely on
 * the values being between 0 and 100?
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 7:41 PM
 */
class Ex7_5_mode {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Arrays.setAll(arr, i -> (int) (Math.random() * 11));
    System.out.println(Arrays.toString(arr));
    System.out.printf("Number %d occurred the most times\n", mode(arr));
  }

  public static int mode(int[] list) {
    int[] counter        = new int[max(list) + 1];
    int   key            = -1; // key that occurred the most times
    int   maxOccurrences = 0;

    for (int val : list) {
      counter[val]++;

      if (counter[val] > maxOccurrences) {
        // new val candidate for max occurrences
        maxOccurrences = counter[val];
        key = val;
      }

//      System.out.println("Key: " + key + ", Occurrences: " + maxOccurrences);
    }

    return key;
  }

  private static int max(int[] list) {
    if (list == null || list.length == 0)
      return -1;

    int max = list[0];
    for (int i = 1; i < list.length; i++)
      max = Math.max(max, list[i]);
    return max;
  }
}
