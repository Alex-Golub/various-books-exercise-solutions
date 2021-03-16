package CodeStepByStep_java.arrays;

/**
 * Write a method named indexOf that returns the index of a
 * particular value in an array of integers.
 *
 * 1. The method should return the index of the first occurrence of
 * the target value in the array.
 *
 * 2. If the value is not in the array, it should return -1.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 2:18 PM
 */
class indexOf {
  public static int indexOf(int[] list, int value) {
    for (int i = 0; i < list.length; i++)
      if (list[i] == value)
        return i;
    return -1;
  }
}
