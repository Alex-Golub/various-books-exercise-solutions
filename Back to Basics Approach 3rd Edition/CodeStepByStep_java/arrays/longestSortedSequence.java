package CodeStepByStep_java.arrays;

/**
 * Write a method named longestSortedSequence that accepts an array
 * of integers as a parameter and that returns the length of the longest
 * sorted (nondecreasing) sequence of integers in the array.
 *
 * 1. Notice that sorted means nondecreasing, which means that the
 * sequence could contain duplicates.
 *
 * 2. Your method should return 0 if passed an empty array.
 *
 * 3. Your method should return 1 if passed an array that is
 * entirely in decreasing order or contains only one element.
 *
 * 4. You may not use any auxiliary data structures
 * (arrays, lists, strings, etc.) to solve this problem.
 *
 * 5. Your method should not modify the array that is passed in.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 3:07 PM
 */
class longestSortedSequence {
  public static void main(String[] args) {
    int[] a = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 98, 12};
    System.out.println(longestSortedSequence(a));
  }

  public static int longestSortedSequence(int[] a) {
    int longestSoFar = 0, currentSequence = 1;
    int i = 0, j;

    while (i < a.length) {
      j = i + 1;

      while (j < a.length && a[j - 1] <= a[j]) {
        j++;
        currentSequence++;
      }

      longestSoFar = Math.max(currentSequence, longestSoFar);

      i = j;
      currentSequence = 1;
    }

    return longestSoFar;
  }

}
