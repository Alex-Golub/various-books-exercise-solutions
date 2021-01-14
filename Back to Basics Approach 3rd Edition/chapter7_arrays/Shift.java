package chapter7_arrays;

import java.util.Arrays;

/**
 * @author Mr.Dr.Professor
 * @since 07-Jan-21 11:23 PM
 */
class Shift {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    shift(arr, 3);
  }

  public static void shift(int[] arr, int by) {
    System.out.println(Arrays.toString(arr));
    reverse(arr, 0, by - 1);
    System.out.println(Arrays.toString(arr));
    reverse(arr, by, arr.length - 1);
    System.out.println(Arrays.toString(arr));
    reverse(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void reverse(int[] arr, int l, int r) {
    int tmp;
    while (l < r) {
      tmp = arr[l];
      arr[l] = arr[r];
      arr[r] = tmp;
      l++;
      r--;
    }
  }
}
