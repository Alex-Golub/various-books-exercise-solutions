package CodeStepByStep_java.arrays;

/**
 * Write a method named maxValue that accepts an array of
 * integers as a parameter and returns the maximum value in the array.
 *
 * 1. You may assume that the array contains at least one element.
 *
 * 2. Your method should not modify the elements of the array.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 3:32 PM
 */
class maxValue {
  public static int maxValue(int[] a) {
    int maxValue = Integer.MIN_VALUE;
    for (int value : a)
      maxValue = Math.max(value, maxValue);
    return maxValue;
  }
}
