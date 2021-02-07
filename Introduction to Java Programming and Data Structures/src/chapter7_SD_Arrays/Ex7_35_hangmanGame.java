package chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ***7.35 (Game: hangman)
 *
 * (Guess) Enter a letter in word ******* > p
 * (Guess) Enter a letter in word p****** > r
 * (Guess) Enter a letter in word pr**r** > p
 * p is already in the word
 * (Guess) Enter a letter in word pr**r** > o
 * (Guess) Enter a letter in word pro*r** > g
 * (Guess) Enter a letter in word progr** > n
 * n is not in the word
 * (Guess) Enter a letter in word progr** > m
 * (Guess) Enter a letter in word progr*m > a
 * The word is program. You missed 1 time
 * Do you want to guess another word? Enter y or n>
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 10:12 PM
 */
class Ex7_35_hangmanGame {
  static final String[] words = {"java", "ruby", "haskell"};
  static       Scanner  sc    = new Scanner(System.in);

  public static void main(String[] args) {
    do {
      play();
    } while (playAgain());

    System.out.println("Bye!");
  }

  private static boolean playAgain() {
    System.out.print("Do you want to guess another word? Enter y or n >");
    boolean choice = "y".equalsIgnoreCase(sc.next());
    System.out.println();

    return choice;
  }

  public static void play() {
    char[] word  = pickRandomWord().toCharArray();
    char[] guess = new char[word.length];
    Arrays.fill(guess, '*');

    int missed = 0;
    while (!Arrays.equals(word, guess)) {
      System.out.printf("(Guess) Enter a letter in word %s > ", new String(guess));
      char userGuess = sc.next().toLowerCase().charAt(0);

      if (!checkGuess(userGuess, word, guess))
        missed++;
    }

    System.out.println("The word is " + new String(word) +
                       ". You missed " + missed + " time");
  }

  private static boolean checkGuess(char userGuess, char[] word, char[] guess) {
    boolean correctGuess = false;

    for (int i = 0; i < word.length; i++) {
      if (word[i] == userGuess) {
        if (guess[i] != '*') {
          System.out.println("    " + userGuess + " is already in the word");
          correctGuess = true; // repeated correct answer is counted as correct
          break;
        }

        // reveal correct letter
        guess[i] = userGuess;
        correctGuess = true;
      }
    }

    if (!correctGuess) {
      System.out.println("    " + userGuess + " is not in the word");
    }

    return correctGuess;
  }

  public static String pickRandomWord() {
    return words[(int) (Math.random() * words.length)];
  }
}
