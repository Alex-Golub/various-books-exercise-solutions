package chapter5_logic_and_loops;

import java.util.Random;
import java.util.Scanner;

/**
 * 3. Write a program that plays a guessing game with the user.
 * The program should generate a random number between 1
 * and some maximum (such as 100), then prompt the user repeatedly
 * to guess the number. When the user guesses incorrectly,
 * the game should give the user a hint about whether the correct
 * answer is higher or lower than the guess. Once the
 * user guesses correctly, the program should print a message showing
 * the number of guesses that the user made.
 * <p>
 * Consider extending this program by making it play multiple games
 * until the user chooses to stop and then printing
 * statistics about the player’s total and average number of guesses.
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 2:09 PM
 */
class PP5_3_guessingGame {
  static final int     LOW  = 1;
  static final int     HIGH = 100;
  static final Scanner sc   = new Scanner(System.in);

  public static void main(String[] args) {
    intro();
    play();
  }

  private static void play() {
    int     guess_count = 0;
    int     total_guess = 0;
    boolean exit        = false;

    while (!exit) {
      int rand_number      = pickNumber();
      int curr_guess_count = 0;

      while (true) {
        int user_guess = getNumber();
        curr_guess_count++;
        total_guess++;

        if (user_guess == rand_number) {
          System.out.println("WELL DONE YOU GOT IT RIGHT!!!");
          break;
        }

        if (user_guess > rand_number) {
          System.out.println(user_guess + " is more then the number I picked");
        } else {
          System.out.println(user_guess + " is less then the number I picked");
        }
      }

      System.out.println("It took you " + curr_guess_count + " times to guess it");

      guess_count = curr_guess_count;

      exit = keepPlaying();
    }

    printStatistics(guess_count, total_guess);
  }

  private static void printStatistics(int guess_count, int total_guess) {
    System.out.println("Total number of guess " + total_guess);
    System.out.println("On average it took you " +
                       (int) Math.round(10.0 * guess_count / total_guess) + " times to guess to correct number");
  }

  private static boolean keepPlaying() {
    System.out.print("\nDo you want to play again (y - yes, any other key for no)? => ");
    return !sc.next().equalsIgnoreCase("y");
  }

  private static int getNumber() {
    int n;
    while (true) {
      System.out.print("Enter your guess number => ");
      if (sc.hasNextInt()) {
        n = sc.nextInt();
        break;
      }

      sc.next(); // clear current input
      System.out.println("Not a number, try again");
    }

    return n;
  }

  private static int pickNumber() {
    return new Random().nextInt(HIGH - LOW + 1) + LOW;
  }

  private static void intro() {
    System.out.println(
            "Welcome to Number Guessing Game\n" +
            "I will pick a number in the range [" + LOW + ", " + HIGH + "]\n" +
            "and you try to guess it."
    );
    System.out.println("-".repeat(42));
  }
}
