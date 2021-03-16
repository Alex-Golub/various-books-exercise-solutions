package CodeStepByStep_java.arrays;

/**
 * Write a method named isMonotonic that accepts an array of integers
 * as a parameter and returns true if the array's element values are monotonic;
 * that is, whether the array is entirely in ascending or descending order.
 *
 * 1. An empty, one-element, or two-element array is always
 * considered to be monotonic.
 *
 * 2. An optimal solution runs in O(N) time and uses a constant
 * amount of extra space.
 *
 * 3. You should not modify the contents of the array passed to your method.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 2:20 PM
 */
class isMonotonic {
  public static boolean isMonotonic(int[] a) {
    boolean ascending = true;
    boolean descending = true;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] < a[i + 1])
        descending = false;

      if (a[i] > a[i + 1])
        ascending = false;
    }

    return ascending || descending;
  }
}

