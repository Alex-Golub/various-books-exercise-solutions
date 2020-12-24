package chapter5_logic_and_loops;

import java.util.Random;

/**
 * 6. Write a method called makeGuesses that guesses
 * numbers between 1 and 50 inclusive until it makes a guess of at
 * least 48. It should report each guess and at the end should
 * report the total number of guesses made.
 *
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 8:46 PM
 */
class Ex5_6_makeGuesses {
  public static void main(String[] args) {
    makeGuesses();
  }

  public static void makeGuesses() {
    int    guessCount = 0;
    Random rnd        = new Random();
    int    guess;

    do {
      guess = rnd.nextInt(50) + 1;
      System.out.println("guess = " + guess);
      guessCount++;
    } while (guess < 48);

    System.out.println("total guesses = " + guessCount);
  }
}
