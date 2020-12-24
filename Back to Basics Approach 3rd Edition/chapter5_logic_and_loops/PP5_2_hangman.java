package chapter5_logic_and_loops;

import java.util.Random;
import java.util.Scanner;

/**
 * 2. Write a reverse Hangman game in which the user thinks
 * of a word and the computer tries to guess the letters in that word.
 * The user tells the computer how many letters the word contains.
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 1:14 PM
 */
class PP5_2_hangman {
  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    intro();
    int wordLength = askLength();
    guess(wordLength);
  }

  private static void guess(int n) {
    StringBuilder alpha = alphabet();
    int           count = 0;
    Random        rnd   = new Random();
    int           i     = 0;
    String        ans   = "";

    while (n > 0 && i < alpha.length()) {
      int  rndIndex = rnd.nextInt(alpha.length() - i) + i;
      char c        = alpha.charAt(rndIndex);

      System.out.print("Does your word contains the letter "
                       + c + "(y - yes, n - no)? => ");
      ans = sc.next().toLowerCase();

      alpha.deleteCharAt(rndIndex);
      if (ans.equals("y")) {
        alpha.insert(i, c);
        i++;
        n--;
      }

      count++;
    }

    System.out.println("Your word consists of the letters " +
                       alpha.substring(0, i));
    System.out.println("It took me " + count + " times to guess it");

  }

  private static StringBuilder alphabet() {
    StringBuilder alpha = new StringBuilder(26);
    for (char c = 'a'; c <= 'z'; c++)
      alpha.append(c);
    return alpha;
  }

  private static int askLength() {
    System.out.print("Before we start please tell\n" +
                     "me how many characters this word is (> 0) => ");

    return Integer.parseInt(sc.next());
  }

  private static void intro() {
    System.out.println("Reverse Hangman guessing game");
    System.out.println("-".repeat(29));
    System.out.println("Think about a word and I will try\n" +
                       "to guess the letters of that word\n");
  }
}
