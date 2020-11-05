package chapter3_Selections;

import java.util.Scanner;

/**
 * 3.14 (Game: heads or tails)
 * Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails.
 * <p>
 * Created by ag on 26-Oct-20 6:11 PM
 */
class Ex3_14_Coin_Flip {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    int     score     = 0;       // count number of correct guess
    int     flip;                // 0 - head, 1 - tail
    int     flipCount = 0;       // total flip count number
    boolean exit      = false;   // should you continue playing?

    while (!exit) {
      flip = Math.random() < 0.5 ? 0 : 1;
      flipCount++;

      System.out.print("Enter your guess (0 - head, 1 - tails, x - to exit): ");
      String guess = scanner.next();
      if (guess.equalsIgnoreCase("x")) {
        exit = true;
      } else if (guess.equals(Integer.toString(flip))) {
        score++;
        System.out.println("Nice, you got it right. Score: " + score + "/" + flipCount);
      } else {
        System.out.println("Incorrect, try again.");
      }
    }

    double summary = (int) ((100.0 * score / flipCount) * 100 + 0.5) / 100.0;
    System.out.println("You got " + summary + "% correct (" + score + "/" + flipCount + ")");
  }
}
