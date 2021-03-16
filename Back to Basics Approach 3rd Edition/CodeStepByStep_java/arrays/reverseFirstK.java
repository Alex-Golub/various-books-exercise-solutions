package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named reverseFirstK that accepts an array of
 * integers and an index k as parameters and modifies the first
 * k elements of the array to be in reverse order.
 *
 * If the value of k is 1, 0, negative, or greater than
 * the length of the array, do not modify the array.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 10:01 PM
 */
class reverseFirstK {
  public static void main(String[] args) {
    int[] a = {10, -2, 33, 55, 9, 17, 6};
    reverseFirstK(a, 5);
    System.out.println(Arrays.toString(a));
  }

  public static void reverseFirstK(int[] a, int k) {
    if (a == null || k <= 1 || k > a.length)
      return;

    for (int i = 0; i < k / 2; i++) {
      int temp = a[i];
      a[i] = a[k - i - 1];
      a[k - i - 1] = temp;
    }
  }
}
