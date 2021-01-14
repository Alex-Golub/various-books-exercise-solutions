package chapter7_arrays;

/**
 * 13. Write a method called longestSortedSequence that accepts an
 * array of integers as a parameter and returns the
 * length of the longest sorted (non-decreasing) sequence of
 * integers in the array.
 * Sorted means non-decreasing, so a sequence could contain duplicates.
 * Your method should return 0 if passed an empty array.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 5:39 PM
 */
class Ex7_13_longestSortedSequence {
  public static void main(String[] args) {
    int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
    System.out.println(longestSortedSequence(array)); // 4

    int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};
    System.out.println(longestSortedSequence(array2)); // 5
  }

  public static int longestSortedSequence(int[] list) {
    if (list == null || list.length == 0)
      return 0;

    int maxSeq  = 0; // store max sequence of ASC numbers so far
    int currSeq = 1; // track current seq of numbers that are in ASC order

    for (int i = 1; i < list.length; i++) {
      if (list[i - 1] <= list[i]) { // {1,1,1,2,3} is non-decreasing array
        currSeq++;
      } else {
        maxSeq = Math.max(currSeq, maxSeq);
        currSeq = 1;
      }
    }

    // in case of longer sequence that was in the end of the list
    return Math.max(maxSeq, currSeq);
  }
}
