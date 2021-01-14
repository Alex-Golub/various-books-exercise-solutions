package chapter7_arrays;

/**
 * 10. Write a method called percentEven that accepts an array of
 * integers as a parameter and returns the percentage of
 * even numbers in the array as a real number.
 * For example, if the array stores the elements
 * [6, 2, 9, 11, 3], then your method should return 40.0.
 * If the array contains no even elements or no elements at all, return 0.0.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 4:37 PM
 */
class Ex7_10_percentEven {
  public static void main(String[] args) {
    System.out.println(percentEven(new int[]{6, 2, 9, 11, 3})); // 40
  }

  public static double percentEven(int[] list) {
    if (list == null || list.length == 0)
      return 0.0;

    int evens = 0;
    for (int val : list)
      evens += val % 2 == 0 ? 1 : 0;

    return 100.0 * evens / list.length;
  }
}
