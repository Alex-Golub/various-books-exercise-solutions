package CodeStepByStep_java.strings;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/startEndLetter
 *
 * startEndLetter('y');
 * console output: Looking for two "y" words in a row.
 *                 Type a word: hi
 *                 Type a word: bye
 *                 Type a word: yes
 *                 Type a word: yo
 *                 Type a word: what?
 *                 Type a word: toy
 *                 Type a word: boy
 *                 Type a word: yellowy
 *                 Type a word: yay
 *                 "y" is for "yay"
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 20:42
 */
/*public*/ class startEndLetter {
  public static void main(String[] args) {
    startEndLetter('s');
  }

  public static void startEndLetter(char c) {
    Scanner console = new Scanner(System.in);
    System.out.println("Looking for two \"" + c + "\" words in a row.");
    int count = 0;
    final int CONSECUTIVE_NUMBER_OF_TIMES = 2;
    String lastWord = "";

    while (count < CONSECUTIVE_NUMBER_OF_TIMES) {
      System.out.print("Type a word: ");
      String word = console.next();

      char firstChar = Character.toLowerCase(word.charAt(0));
      char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));

      if (c == firstChar && firstChar == lastChar) {
        count++;
        lastWord = word; // remember last valid word
      } else {
        count = 0;
      }

//      System.out.println(">> DEBUG: count = " + count +
//                         ", lastWord = " + lastWord);
    }

    System.out.println("\"" + c + "\" is for \"" + lastWord + "\"");
  }
}
