package cse_142.cs1_exams.finals;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final11/caughtSkipping
 *
 * If skipper is found in the line array before (at a lower numbered index than)
 * skipped, your method should perform the following actions:
 *  - The skipper is temporarily pulled out of the line.
 *  - All elements that were after skipper are shifted over one place
 *  (left-shifted to one index lower).
 *  - The skipper is moved to the end of the line.
 *
 * NB: You may not use any temporary arrays to help you solve this problem.
 * The line might contain more than one occurrence of the skipper student's name;
 * if so, you should use the latest occurrence of skipper that comes before skipped, if any.
 *
 * @author Alex Golub
 * @since 15-Apr-21 7:22 PM
 */
class caughtSkipping {
  public static void main(String[] args) {
    String[] line = {"Iva", "Ben", "Brett", "Ally", "Kim", "Jesse"};
    caughtSkipping(line, "Jesse", "Kim");
    System.out.println(Arrays.toString(line)); // no change

    caughtSkipping(line, "Ben", "Ally");
    System.out.println(Arrays.toString(line)); // no change
  }

  public static void caughtSkipping(String[] line, String skipper, String skipped) {
    int skipperIndex = -1;
    boolean bothFound = false;

    // find the indices of skipper and skipped if exists
    for (int k = line.length - 1; k >= 0 && !bothFound; k--) {
      if (line[k].equals(skipped)) {
        k--;

        // find skipper index if exists
        while (k >= 0) {
          if (line[k].equals(skipper)) {
            skipperIndex = k; // skipper has been found at index k, save it
            bothFound = true;
            break;
          }

          k--;
        }
      }
    }

    // both has been found shift left and put skipper last in line
    if (bothFound) {
      for (int k = skipperIndex + 1; k < line.length; k++) {
        line[k - 1] = line[k];
      }

      line[line.length - 1] = skipper;
    }
  }
}
