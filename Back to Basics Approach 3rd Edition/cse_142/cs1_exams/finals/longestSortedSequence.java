package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final2/longestSortedSequence
 *
 * Your method should return 0 if passed an empty array.
 * Your method should return 1 if passed an array that is entirely
 * in decreasing order or contains only one element.
 *
 * @author Alex Golub
 * @since 12-Apr-21 7:30 PM
 */
class longestSortedSequence {
  public static void main(String[] args) {
    int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
    System.out.println(longestSortedSequence(array));

    int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};
    System.out.println(longestSortedSequence(array2));
  }

  public static int longestSortedSequence(int[] arr) {
    if (arr.length == 0) return 0;
    if (arr.length == 1) return 1;

    int maxSoFar = 0; // max sequence encountered so far
    int current = 1;  // current sorted sequence count
    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1] <= arr[i]) {
        current++;
      } else {
        maxSoFar = Math.max(current, maxSoFar);
        current = 1;
      }
    }

    return Math.max(maxSoFar, current);
  }
}
