package CodeStepByStep_java.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/GuessingGame
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 6:57 PM
 */
/*public*/ class GuessingGame {
  static final int FROM = 1, TO = 100;
  static final Scanner console = new Scanner(System.in);
  static final Random RANDOM = new Random();

  public static void main(String[] args) {
    intro();

    int totalGames = 0;
    int totalGuesses = 0;
    int bestGame = Integer.MAX_VALUE;
    boolean playAgain = true;

    while (playAgain) {
      int randomNumber = RANDOM.nextInt(TO) + 1;
      System.out.printf("I'm thinking of a number between %d and %d...\n", FROM, TO);
      int currentGameGuesses = 0;

      boolean numberGuessed = false;
      while (!numberGuessed) {
        System.out.print("Your guess? ");
        int userGuess = console.nextInt();
        currentGameGuesses++;

        if (userGuess == randomNumber) {
          System.out.printf("You got it right in %d guess%s!\n",
                            currentGameGuesses, currentGameGuesses == 1 ? "" : "es");
          numberGuessed = true;
        } else {
          System.out.printf("It's %s.\n", userGuess > randomNumber ? "lower" : "higher");
        }
      }

      totalGames++;
      totalGuesses += currentGameGuesses;
      bestGame = Math.min(bestGame, currentGameGuesses);

      System.out.print("Do you want to play again? ");
      playAgain = console.next().toLowerCase().startsWith("y");
      System.out.println();
    }

    overallResults(totalGames, totalGuesses, bestGame);
  }

  private static void overallResults(int totalGames, int totalGuesses, int bestGame) {
    System.out.printf("Overall results:\n" +
                      "Total games   = %d\n" +
                      "Total guesses = %d\n" +
                      "Guesses/game  = %.1f\n" +
                      "Best game     = %d",
                      totalGames, totalGuesses,
                      1.0 * totalGuesses / totalGames,
                      bestGame);
  }

  private static void intro() {
    System.out.println("This program allows you to guess random numbers.");
    System.out.println("I will think of a number between 1 and 100");
    System.out.println("and you will try to guess it.");
    System.out.println("After each guess, I will give you a clue about");
    System.out.println("whether the correct number is higher or lower.\n");
  }
}
