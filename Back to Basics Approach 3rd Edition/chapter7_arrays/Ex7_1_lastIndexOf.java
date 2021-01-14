package chapter7_arrays;

/**
 * 1. Write a method called lastIndexOf that accepts an array
 * of integers and an integer value as its parameters and returns
 * the last index at which the value occurs in the array.
 * The method should return –1 if the value is not found.
 * e.g:
 * lastIndexOf([74, 85, 102, 99, 101, 85, 56], 85) -> 5
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 7:13 PM
 */
class Ex7_1_lastIndexOf {
  public static void main(String[] args) {

  }

  public static int lastIndexOf(int[] arr, int target) {
    for (int i = arr.length - 1; i >= 0; i--)
      if (arr[i] == target)
        return i;
    return -1;
  }
}
