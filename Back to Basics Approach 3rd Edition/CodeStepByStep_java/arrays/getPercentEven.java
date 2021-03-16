package CodeStepByStep_java.arrays;

/**
 * Write a method named getPercentEven that accepts an array of
 * integers as a parameter and returns the percentage of the
 * integers in the array that are even numbers.
 *
 * 1. If the array contains no even elements or is empty
 * 2. return 0.0. Do not modify the array passed in.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 1:06 PM
 */
class getPercentEven {
  public static void main(String[] args) {
    int[] arr = {6, 4, 9, 11, 5};
    System.out.println(getPercentEven(arr));
  }

  public static double getPercentEven(int[] list) {
    if (list == null || list.length == 0)
      return 0;

    int count = 0;
    for (int value : list)
      if (value % 2 == 0)
        count++;

    return 100.0 * count / list.length;
  }
}
