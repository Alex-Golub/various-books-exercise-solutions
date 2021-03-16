package CodeStepByStep_java.arrays;

/**
 * Write a method named countUnique that accepts an array of integers
 * as a parameter and returns a count of the number of unique values
 * that occur in the array.
 * If the array contains multiple occurrences of the same element value,
 * only one of those occurrences should count toward your total.
 *
 * Constraints:
 * 1. In solving this problem, do not create any other data structures
 * such as arrays, strings, etc.,
 * though you may create as many simple variables (e.g. int, double) as you like.
 * 2. Do not modify the array passed to your method as the parameter,
 * such as by sorting or rearranging its element values.
 *
 * @author Mr.Dr.Professor
 * @since 15-Jan-21 12:23 AM
 */
class countUnique {
  public static void main(String[] args) {
    int[] arr = {7, 7, 2, 2, 1, 2, 2, 7};
    System.out.println(countUnique(arr)); // 3
  }

  public static int countUnique(int[] list) {
    if (list.length == 0)
      return 0;

    int res = 1;
    for (int i = 1; i < list.length; i++) {
      int j;
      for (j = 0; j < i; j++)
        if (list[i] == list[j])
          break;

      if (i == j)
        res++;
    }

    return res;
  }
}
