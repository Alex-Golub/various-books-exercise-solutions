package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final3/coinFlip
 *
 * test #3:example, uppercases and spaces
 * console output:
 * 3 heads (60.0%)
 * You win!
 *
 * 2 heads (33.3%)
 *
 * 1 heads (100.0%)
 * You win!
 * result: pass
 *
 * @author Alex Golub
 * @since 12-Apr-21 9:07 PM
 */
class coinFlip {
  public static void main(String[] args) {
    String data = "H T H H T\n" +
                  "T t   t T h  H\n" +
                  "   h";
    coinFlip(new Scanner(data));
  }

  public static void coinFlip(Scanner data) {
    while (data.hasNextLine()) {
      String line = data.nextLine();
      Scanner outcomes = new Scanner(line);
      int head = 0, tails = 0;

      while (outcomes.hasNext()) {
        char flip = outcomes.next().toLowerCase().charAt(0);
        if (flip == 'h') head++;
        else tails++;
      }

      double percent = 100.0 * head / (tails + head);
      System.out.printf("%d heads (%.1f%%)\n", head, percent);
      if (percent > 50.0)
        System.out.println("You win!");

      System.out.println();
    }
  }
}
