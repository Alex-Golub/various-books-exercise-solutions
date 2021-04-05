package cse_142.cs1_sections.section06_file_processing;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/3856?categoryid=119
 * Writes that file's text to the console, with multiple spaces or tabs
 * reduced to single spaces between words that appear on the same line.
 *
 * collapseSpaces(new Scanner("four      score   and\n\nseven               years ago         our\n\nfa...
 * console output:
 * four score and
 *
 * seven years ago our
 *
 * fathers brought forth
 * on this continent
 * a new
 *
 * nation
 *
 * collapseSpaces(new Scanner("to be      or    not\n      to be\n\n\n that is\nthe     question.\n"));
 * console output:
 * to be or not
 * to be
 *
 *
 * that is
 * the question.
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:10 AM
 */
class collapseSpaces {
  public static void collapseSpaces(Scanner input) {
    while (input.hasNextLine()) {
      String line = input.nextLine();

      Scanner tokenReader = new Scanner(line);
      if (tokenReader.hasNext()) {
        System.out.print(tokenReader.next());
        while (tokenReader.hasNext())
          System.out.print(" " + tokenReader.next());
      }
      System.out.println();
    }
  }
}
