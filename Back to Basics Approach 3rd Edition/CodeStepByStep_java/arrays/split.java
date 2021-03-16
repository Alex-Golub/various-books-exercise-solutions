package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named split that accepts an array of integers
 * as a parameter and returns a new array twice as large as the original,
 * replacing every integer from the original array with a pair of integers,
 * each half the original.
 *
 * If a number in the original array is odd, then the first number in
 * the new pair should be one higher than the second so that the sum
 * equals the original number.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 11:07 PM
 */
class split {
  public static void main(String[] args) {
    int[] a = {18, 7, 4, 24, 11};
    System.out.println(Arrays.toString(split(a)));
  }

  public static int[] split(int[] a) {
    int[] split = new int[a.length * 2];

    for (int i = 0; i < a.length; i++) {
      int first = a[i] / 2;
      int second = first;

      if (a[i] % 2 == 1) {
        first++;
      }

      split[2 * i] = first;
      split[2 * i + 1] = second;
    }

    return split;
  }
}
