package CodeStepByStep_java.arrays;

/**
 * Write a method named numUnique that accepts a sorted array of integers
 * as a parameter and that returns the number of unique values in the array.
 *
 * 1. The array is guaranteed to be in sorted order,
 * which means that duplicates will be grouped together.
 *
 * 2. It is possible that the list might not have any duplicates.
 *
 * 3. If passed an empty list, your method should return 0.
 *
 * 4. Remember that you can assume that the values in the array appear
 * in sorted (nondecreasing) order.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 4:10 PM
 */
class numUnique {
  public static void main(String[] args) {
    int[] a = {5, 7, 7, 7, 8, 22, 22, 23, 31, 35, 35, 40, 40, 40, 41};
    System.out.println(numUnique(a));
  }

  public static int numUnique(int[] list) {
    if (list == null || list.length == 0)
      return 0;

    int uniqueCount = 0;
    int i = 0, j;
    while (i < list.length) {
      j = i + 1;

      while (j < list.length && list[i] == list[j]) {
        j++;
      }

      uniqueCount++;
      i = j;
    }

    return uniqueCount;
  }
}
