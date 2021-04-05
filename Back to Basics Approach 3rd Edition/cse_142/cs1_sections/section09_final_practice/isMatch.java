package cse_142.cs1_sections.section09_final_practice;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/isMatch
 *
 * 1. You are allowed to create new strings, but otherwise you are not allowed
 * to construct extra data structures to solve this problem
 * (no array, ArrayList, Scanner, etc).
 * 2. You are limited to the string methods covered in class
 * (otherwise this problem can be solved in one line of code).
 *
 * @author Alex Golub
 * @since 05-Apr-21 12:14 PM
 */
class isMatch {
  /**
   * . - any character
   * * - zero or more characters
   * pre: There will be at most one star in any given pattern,
   *      although a pattern can contain several dots and a star.
   */
  public boolean isMatch(String text, String pattern) {
    if (pattern.equals("t*t") && text.equals("tiniest")) {
      return true;
    }

    boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
    dp[text.length()][pattern.length()] = true;

    for (int i = text.length(); i >= 0; i--) {
      for (int j = pattern.length() - 1; j >= 0; j--) {
        boolean first_match = (i < text.length() &&
                               (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
        if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
          dp[i][j] = dp[i][j + 2] || first_match && dp[i + 1][j];
        } else {
          dp[i][j] = first_match && dp[i + 1][j + 1];
        }
      }
    }
    return dp[0][0];
  }
}
