package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named nCopies that accepts an array of integers a as
 * a parameter and returns a new array a2, with each element value n
 * from a replaced by n consecutive copies of the value n at the same
 * relative location in the array.
 *
 * 1. Any element whose value is 0 or negative should not be kept in
 * the returned array.
 *
 * 2. The array you return must have a length that is exactly long
 * enough to fit its elements.
 *
 * 3. In solving this problem, you must create a single new array
 * to be returned, but aside from that, do not create any other data
 * structures such as temporary arrays or strings.
 *
 * 4. You may use as many simple variables (such as ints) as you like.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 3:53 PM
 */
class nCopies {
  public static void main(String[] args) {
    int[] a = {3, 5, 0, 2, 2, -7, 0, 4};
    System.out.println(Arrays.toString(nCopies(a)));
  }

  public static int[] nCopies(int[] a) {
    int[] res = new int[getSize(a)];

    int i = 0;
    for (int value : a) {
      int times = value;

      while (times-- > 0) {
        res[i++] = value;
      }
    }

    return res;
  }

  private static int getSize(int[] a) {
    int sum = 0;
    for (int value : a)
      sum += Math.max(value, 0);
    return sum;
  }
}
