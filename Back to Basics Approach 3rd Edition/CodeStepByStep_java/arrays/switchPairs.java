package CodeStepByStep_java.arrays;

/**
 * Write a method named switchPairs that accepts an array
 * of strings as a parameter and switches the order of pairs
 * of values in the array.
 * Your method should swap the order of the first two values,
 * then switch the order of the next two, and so on.
 *
 * 1. If there are an odd number of values, the final element is not moved.
 * 2. You may assume that the array is not null and that no element of
 * the array is null.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 11:16 PM
 */
class switchPairs {
  public static void switchPairs(String[] a) {
    for (int i = 0; i < a.length - 1; i += 2) {
      String temp = a[i];
      a[i] = a[i + 1];
      a[i + 1] = temp;
    }
  }
}
