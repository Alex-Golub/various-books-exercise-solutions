package cse_142.cs1_sections.section05_while_random_boolean;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section5/sign
 *
 * NB: Do not perform any arithmetic operations on the integers (+, -, *, /).
 *
 * @author Alex Golub
 * @since 01-Apr-21 7:20 PM
 */
class sign {
  public static String sign(int a, int b) {
    return a == 0 || b == 0 ?
           "Zero" : (a < 0 && b > 0) || (a > 0 && b < 0) ?
           "Negative" : "Positive";
  }
}
