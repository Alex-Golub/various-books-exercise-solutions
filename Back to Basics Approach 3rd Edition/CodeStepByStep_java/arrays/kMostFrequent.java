package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named kMostFrequent that accepts an array of
 * integers and an integer k and returns an array of the k unique
 * values in the array that occur most frequently.
 *
 * 1. You should return the values sorted in decreasing order by
 * number of occurrences.
 * 2. You may assume that k is a positive integer.
 * 3. There are at least k unique values in the array
 * 4. There will not be any ties for most frequent.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 2:31 PM
 */
class kMostFrequent {
  public static void main(String[] args) {
    int[] a = {7, 4, 5, 1, 4, 4, 5, 6};
    int k = 2;

    System.out.println(Arrays.toString(kMostFrequent(a, k))); // [4, 5]
  }

  public static int[] kMostFrequent(int[] a, int k) {
    return null; // TODO
  }
}
