package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final6/allPlural
 *
 * A plural word is defined as any string that ends with the letter S,
 * case-insensitively.
 *
 * @author Alex Golub
 * @since 14-Apr-21 8:13 PM
 */
class allPlural {
  public static boolean allPlural(String[] arr) {
    for (String word : arr) {
      if (!word.toLowerCase().endsWith("s"))
        return false;
    }

    return true;
  }
}
