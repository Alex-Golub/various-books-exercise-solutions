package CodeStepByStep_java.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/Guess2D
 *
 * How far from correct spot:
 * hot (a distance = 1.5 from the correct answer)
 * warm (a distance = 5.0 from the correct answer)
 * cold (a distance > 5.0 away from the right answer)
 *
 * Directions to correct spot:
 * north (the user should increase y)
 * south (the user should decrease y)
 * east (the user should increase x)
 * west (the user should decrease x)
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 7:44 PM
 */
/*public*/ class Guess2D {
  static final int X_MIN = 1, Y_MIN = 1;
  static final int X_MAX = 100, Y_MAX = 100;
  static final Scanner console = new Scanner(System.in);
  static final Random RANDOM = new Random();
  static final double THRESHOLD = 1e-10;

  public static void main(String[] args) {
    intro();

    int gamesPlayed = 0;
    int totalGuesses = 0;
    boolean playAgain = true;
    while (playAgain) {

      // pick random (x, y)
      int x = RANDOM.nextInt(X_MAX) + 1;
      int y = RANDOM.nextInt(Y_MAX) + 1;

      int currentGameGuessCount = startGuessing(x, y);
      totalGuesses += currentGameGuessCount;

      gamesPlayed++;

      System.out.print("Play again? ");
      playAgain = console.next().toLowerCase().startsWith("y");
      System.out.println();
    }

    overallResults(gamesPlayed, totalGuesses);
  }

  private static int startGuessing(int x, int y) {
    int currentGameGuessCount = 0;

    while (true) {
      System.out.print("Guess x and y: ");
      int xGuess = console.nextInt();
      int yGuess = console.nextInt();
      currentGameGuessCount++;

      double absoluteDistance = Math.abs(distance(x, y, xGuess, yGuess));
      if (Math.abs(absoluteDistance) < THRESHOLD) { // user guessed correct position
        System.out.printf("You got it right in %d guesses!\n", currentGameGuessCount);
        break;
      }

      if (absoluteDistance <= 1.5) {
        System.out.print("You're hot! ");
      } else if (absoluteDistance <= 5.0) {
        System.out.print("You're warm. ");
      } else {
        System.out.print("You're cold. ");
      }

      directionsToCorrectSpot(xGuess, yGuess, x, y);
    }

    return currentGameGuessCount;
  }

  private static void overallResults(int gamesPlayed, int totalGuesses) {
    System.out.printf("Overall results:\n" +
                      "Games played  = %d\n" +
                      "Total guesses = %d\n" +
                      "Guesses/game  = %.1f",
                      gamesPlayed,
                      totalGuesses,
                      1.0 * totalGuesses / gamesPlayed);
  }

  private static void directionsToCorrectSpot(int fromX, int fromY, int toX, int toY) {
    String direction = "";

    if (toY > fromY) {
      direction += " north";
    } else if (toY < fromY) {
      direction += " south";
    }

    if (toX > fromX) {
      direction += " east";
    } else if (toX < fromX) {
      direction += " west";
    }

    System.out.println("Go" + direction);
  }

  private static void intro() {
    System.out.printf("This program is a 2-D guessing game.\n" +
                      "I will think of a point somewhere\n" +
                      "between (%d, %d) and (%d, %d)\n" +
                      "and give hints until you guess it.\n\n",
                      X_MIN, Y_MIN, X_MAX, Y_MAX);
  }

  private static double distance(int... pts) {
    int dx = pts[0] - pts[2];
    int dy = pts[1] - pts[3];
    return Math.sqrt(dx * dx + dy * dy);
  }
}
