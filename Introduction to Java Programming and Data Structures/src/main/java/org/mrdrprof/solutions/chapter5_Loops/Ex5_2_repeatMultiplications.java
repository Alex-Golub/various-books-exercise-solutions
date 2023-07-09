package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * 5.2 (Repeat multiplications)
 * Listing 5.4, SubtractionQuizLoop.java, generates five random
 * subtraction questions. Revise the program to generate ten random
 * multiplication questions for two integers between 1 and 12.
 * Display the correct count and test time.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 1:34 PM
 */
class Ex5_2_repeatMultiplications {
  static final int     NUMBER_OF_QUESTIONS = 10;
  static final int     LOW                 = 1;
  static final int     HIGH                = 12;
  static final Scanner console             = new Scanner(System.in);

  public static void main(String[] args) {
    int           questionsCount = 0;
    int           correctCount   = 0;
    StringBuilder record         = new StringBuilder();
    long          start          = System.currentTimeMillis();

    while (questionsCount < NUMBER_OF_QUESTIONS) {
      int a = LOW + (int) (Math.random() * HIGH);
      int b = LOW + (int) (Math.random() * HIGH);

      System.out.printf("What is %d * %d = ", a, b);
      int answer = console.nextInt();

      boolean isCorrect = answer == a * b;
      if (isCorrect) {
        System.out.println("You are correct!");
        correctCount++;
      } else {
        System.out.println("Wrong! correct answer is " + (a * b));
      }

      record.append(a)
              .append(" * ")
              .append(b)
              .append(" = ")
              .append(answer)
              .append(isCorrect ? " correct" : " wrong")
              .append("\n");

      questionsCount++;

      System.out.println();
    }

    long testTime = (System.currentTimeMillis() - start) / 1_000;
    System.out.print(
            "Correct count is " + correctCount + "\n" +
            "Test time is " + testTime + " seconds\n\n" +
            record
    );
  }
}
