package chapter5_logic_and_loops;

import java.util.Random;
import java.util.Scanner;

/**
 * 4. Write a program that plays a reverse guessing game with the user.
 * The user thinks of a number between 1 and 10, and
 * the computer repeatedly tries to guess it by guessing random numbers.
 * It’s fine for the computer to guess the same
 * random number more than once.
 * At the end of the game, the program reports how many guesses it made.
 *
 * For an added challenge, consider having the user hint to the
 * computer whether the correct number is higher or lower
 * than the computer’s guess. The computer should adjust its range
 * of random guesses on the basis of the hint.
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 5:10 PM
 */
class PP5_4_reverseGuessingGame {
  static int     LOW  = 1;
  static int     HIGH = 10;
  static Scanner sc   = new Scanner(System.in);

  public static void main(String[] args) {
    intro();
    play();
  }

  // Computer will guess the number in the fastest way
  // if we will use binary search on the range [LOW, HIGH]
  private static void play() {
    int    guesses = 0;
    int    number  = 0;
    Random rnd     = new Random();

    while (LOW <= HIGH) {
      number = rnd.nextInt(HIGH - LOW + 1) + LOW;

//      number = (HIGH + LOW) / 2; // fastest way to guess the number

      System.out.printf("(Guess #%d) Is it %d? (y/n) ", guesses + 1, number);
      if (sc.next().equalsIgnoreCase("y")) {
        break;
      }

      System.out.printf("Number is (l)ower or (h)igher then %d? => ", number);
      if (sc.next().equalsIgnoreCase("l"))
        HIGH = number - 1;
      else
        LOW = number + 1;

//      System.out.printf("\ndebug >>> range [%d, %d]\n", LOW, HIGH);
//      System.out.printf("debug >>> low = %d, high = %d\n", LOW, HIGH);

      guesses++;
    }

    System.out.printf("\nI got your number of %d correct in %d guesses.\n",
            number, guesses);
  }

  public static void intro() {
    System.out.println(
            "This program has you, the user, choose a number\n" +
            "between [" + LOW + ", " + HIGH + "].\n" +
            "Then I, the computer, will try my best to guess it."
    );
    System.out.println("-".repeat(51));
  }
}
