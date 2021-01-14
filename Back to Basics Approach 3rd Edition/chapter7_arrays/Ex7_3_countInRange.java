package chapter7_arrays;

/**
 * 3. Write a method called countInRange that accepts an array of integers,
 * a minimum value, and a maximum value as parameters and returns the count
 * of how many elements from the array fall between the minimum and maximum
 * (inclusive).
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 7:33 PM
 */
class Ex7_3_countInRange {
  public static int countInRange(int[] list, int min, int max) {
    int count = 0;
    for (int val : list)
      if (val >= min && val <= max)
        count++;
    return count;
  }
}
