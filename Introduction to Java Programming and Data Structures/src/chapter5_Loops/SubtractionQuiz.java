package chapter5_Loops;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 19-Jan-21 10:27 PM
 */
class SubtractionQuiz {

  public static void main(String[] args) {
    final int NUMBER_OF_QUESTIONS = 5;
    int correctCount = 0;
    int count = 0;
    long startTime = System.currentTimeMillis();
    StringBuilder record = new StringBuilder();
    Scanner console = new Scanner(System.in);

    while (count < NUMBER_OF_QUESTIONS) {
      int x = (int) (Math.random() * 10);
      int y = (int) (Math.random() * 10);

      if (x < y) { // favor 5 - 2 instead -2 + 5
        x ^= y;
        y ^= x;
        x ^= y;
      }

      System.out.print("What is " + x + " - " + y + "? ");
      int answer = console.nextInt();
      int correctAnswer = x - y;

      if (answer == correctAnswer) {
        System.out.println("You are correct!\n");
        correctCount++;
      } else {
        System.out.println("Your answer is wrong.");
        System.out.println(x + " - " + y + " should be " + correctAnswer + "\n");
      }

      record.append(String.format("%d - %d = %d %s\n",
              x, y, answer, answer == correctAnswer ? "correct" : "wrong"));
      count++;
    }

    long testTime = (System.currentTimeMillis() - startTime) / 1_000;
    System.out.print(
            "Correct count is " + correctCount + "\n" +
            "Test testTime is " + testTime + " seconds\n\n" +
            record
    );

  }
}
