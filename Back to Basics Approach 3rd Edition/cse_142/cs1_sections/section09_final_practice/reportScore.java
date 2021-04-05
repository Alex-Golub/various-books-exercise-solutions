package cse_142.cs1_sections.section09_final_practice;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/reportScore
 *
 * The information for each student is presented as a series of count/type
 * pairs where each count is a positive integer and each type is either
 * "*" or "-".
 * These count/type pairs are followed by the student's name which is
 * guaranteed to be a single word composed entirely of alphabetic characters.
 *
 * 3 * 2 - 1 * Erica
 * It indicates that Erica got 3 stars followed by 2 minuses followed by 1 star.
 * The overall score is computed by giving 1 plus point for each star and one
 * minus point for each minus.
 * The method produces exactly one line of output reporting this score and
 * the total number of tasks.
 *
 * Scanner contents                       Output produced
 * ----------------------------------     ------------------
 * 3 * 2 - 1 * Erica                      Erica got 2 of 6
 * 2 - 1 * 2 - 1 - 1 * 2 - Fred           Fred got -5 of 9
 * 1 * 1 - 3 * 1 - 2 - Sylvia             Sylvia got 0 of 8
 * Julia                                  Julia got 0 of 0
 *
 * NB: You may not construct any extra data structures to solve this problem.
 *
 * test #1:3 * 2 - 1 * Erica
 * console output:
 * Erica got 2 of 6
 * result: pass
 *
 * test #2:2 - 1 * 2 - 1 - 1 * 2 - Fred
 * console output:
 * Fred got -5 of 9
 * result: pass
 *
 * test #3:1 * 1 - 3 * 1 - 2 - Sylvia
 * console output:
 * Sylvia got 0 of 8
 * result: pass
 *
 * test #4:Julia
 * console output:
 * Julia got 0 of 0
 * result: pass
 *
 *
 * @author Alex Golub
 * @since 04-Apr-21 2:39 PM
 */
class reportScore {
  public static void main(String[] args) {
    String mockData = "3 * 2 - 1 * Erica";
    reportScore(new Scanner(mockData));
  }

  public static void reportScore(Scanner data) {
    int totalScore = 0, studentScore = 0;

    while (data.hasNextInt()) {
      int score = data.nextInt();
      studentScore += "*".equals(data.next()) ? score : -score;
      totalScore += score;
    }

    String name = data.next();
    System.out.println(name + " got " + studentScore + " of " + totalScore);
  }
}
