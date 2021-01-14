package chapter7_arrays;

/**
 * 4. Write a method called isSorted that accepts an array of
 * real numbers as a parameter and returns true if the list is
 * in sorted (non-decreasing) order and false otherwise.
 * Assume the array has at least one element.
 * A one element array is considered to be sorted
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 7:37 PM
 */
class Ex7_4_isSorted {
  public static boolean isSorted(double[] list) {
    for (int i = 0; i < list.length - 1; i++)
      if (list[i] > list[i + 1])
        return false;
    return true;
  }
}
