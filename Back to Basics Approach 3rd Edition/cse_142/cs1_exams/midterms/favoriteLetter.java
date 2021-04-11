package cse_142.cs1_exams.midterms;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm1/favoriteLetter
 *
 * test #1:test 1 ("y")
 * console output: Looking for two "y" words in a row.
 *                 Type a word: hi
 *                 Type a word: bye
 *                 Type a word: yes
 *                 Type a word: what?
 *                 Type a word: yellow
 *                 Type a word: yippee
 *                 "y" is for "yippee"
 * result: pass
 *
 * test #2:test 2 ("A")
 * console output: Looking for two "A" words in a row.
 *                 Type a word: I
 *                 Type a word: love
 *                 Type a word: CSE142!
 *                 Type a word: AND
 *                 Type a word: PROGRAMS
 *                 Type a word: are
 *                 Type a word: always
 *                 Type a word: Absolutely
 *                 Type a word: Awesome
 *                 "A" is for "Awesome"
 * result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 9:39 PM
 */
class favoriteLetter {
  public static void favoriteLetter(Scanner console, String letter) {
    System.out.println("Looking for two \"" + letter + "\" words in a row.");
    int occurrences = 0;
    String word = "";

    while (occurrences < 2) {
      System.out.print("Type a word: ");
      word = console.next();

      if (word.startsWith(letter)) {
        occurrences++;
      } else {
        occurrences = 0; // reset
      }
    }

    System.out.println("\"" + letter + "\" is for \"" + word + "\"");
  }
}
