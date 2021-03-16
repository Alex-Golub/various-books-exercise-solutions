package CodeStepByStep_java.arrays;

/**
 * Write a method named firstMissingPositive that accepts an unsorted
 * array of integers as a parameter and returns the first positive
 * integer value that is not present in the array.
 *
 * Constrains:
 * 1. If the array is empty or contains no positive integers, return 1.
 * 2. An optimal solution runs in O(N) time and uses a constant amount
 * of extra space.
 * 3. You may change the array contents in your solution if you find
 * it helpful to do so.
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 6:52 PM
 */
class firstMissingPositive {
  public static void main(String[] args) {
//    int[] a = {1, 2, 3, 4, 5, 6, 7};
//    int[] a = {1, 4, 7, 8, -5, 2, 3, 5, 8}; // 6
    int[] a = {10, 3, 9, 12, 0, 6, 2, 7, 8, -9, 4, 5, -18, 1, 1}; // 1
    System.out.println(firstMissingPositive(a));
  }

  public static int firstMissingPositive(int[] list) {
    int n = list.length;

    for (int i = 0; i < n; i++) {
      if (list[i] > 0 && list[i] <= n) {
        if (list[i] - 1 != i && list[list[i] - 1] != list[i]) {
          int temp = list[list[i] - 1];
          list[list[i] - 1] = list[i];
          list[i] = temp;
          i--;
        }
      }
    }

    for (int i = 0; i < n; i++)
      if (list[i] != i + 1)
        return i + 1;

    return n + 1;
  }

}
