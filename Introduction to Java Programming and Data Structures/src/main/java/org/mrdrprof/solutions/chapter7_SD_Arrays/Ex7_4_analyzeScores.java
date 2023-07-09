package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 7.4 (Analyze scores)
 * 1. reads an unspecified number of scores and
 * determines how many scores are above or equal to the average,
 * and how many scores are below the average.
 * 2. negative number to signify the end of the input.
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 2:39 PM
 */
class Ex7_4_analyzeScores {
  public static void main(String[] args) {
    final int MAX_NUM_OF_SCORES = 100;

    int[]   scoresCounter = new int[MAX_NUM_OF_SCORES + 1]; // [0, 100]
    Scanner sc            = new Scanner(System.in);

    System.out.printf("Enter scores (max score is %d, -ve number to stop): ",
                      MAX_NUM_OF_SCORES);
    int scoreSum   = 0;
    int scoreCount = 0;

    while (true) {
      int score = sc.nextInt();
      if (score < 0)
        break;

      scoreCount++;
      scoreSum += score;
      scoresCounter[score]++;
    }

    double average = 1.0 * scoreSum / scoreCount;

    int belowAverage = 0;
    int aboveAverage = 0;
    int equalAverage = 0;
    for (int score = 0; score < scoresCounter.length; score++) {
      int scoreOccurrence = scoresCounter[score];

      if (scoreOccurrence > 0) { // someone got that score, process it
        if (score > average)
          aboveAverage += scoreOccurrence;
        else if (score < average)
          belowAverage += scoreOccurrence;
        else
          equalAverage += scoreOccurrence;
      }
    }

    System.out.println("Average score is " + DecimalFormat.getInstance().format(average));
    System.out.println(aboveAverage + " students got above average score");
    System.out.println(equalAverage + " students got average score");
    System.out.println(belowAverage + " students got below average score");
  }
}
