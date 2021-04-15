package cse_142.cs1_exams.finals;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final11/sandwich
 *
 * @author Alex Golub
 * @since 15-Apr-21 5:33 PM
 */
class sandwich {
  public static void main(String[] args) {
    String[] fillings1 = {"tuna", "mayo", "salt", "carrot"};
    String[] sandwich = sandwich("bun", fillings1, 1);
    System.out.println(Arrays.toString(sandwich));
  }

  public static String[] sandwich(String bread, String[] fillings, int fillFactor) {
    String[] sandwich = new String[2 + fillFactor * fillings.length];
    sandwich[0] = sandwich[sandwich.length - 1] = bread;

    for (int i = 1; i < sandwich.length - 1; i++) {
      sandwich[i] = fillings[(i - 1) % fillings.length];
    }

    return sandwich;
  }
}
