package cse_142.cs1_exams.finals;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final8/compress
 *
 * @author Alex Golub
 * @since 15-Apr-21 1:38 PM
 */
class compress {
  public static int[] compress(int[] a) {
    int[] unique = new int[a.length];
    int uniqueValues = 0;
    for (int value : a) {
      int count = 0;
      for (int j = 0; j < uniqueValues; j++) {
        if (value == unique[j]) {
          count++; // count number of occurrences of value
        }
      }

      if (count == 0) { // there were no occurrences of value thus value is unique
        unique[uniqueValues] = value;
        uniqueValues++;
      }
    }

    return Arrays.copyOf(unique, uniqueValues);
  }
}
