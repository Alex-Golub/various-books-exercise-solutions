package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final2/flipLines
 *
 * test #2:example call
 * console output:
 * did gyre and gimble in the wabe.
 * Twas brillig and the slithy toves
 * and the mome raths outgrabe.
 * All mimsey were the borogroves,
 * "Beware the Jabberwock, my son,
 *
 * Beware the JubJub bird and shun
 * the jaws that bite, the claws that catch,
 * the frumious bandersnatch."
 * result: pass
 *
 * @author Alex Golub
 * @since 12-Apr-21 7:21 PM
 */
class flipLines {
  public static void flipLines(Scanner input) {
    while (input.hasNextLine()) {
      String first = input.nextLine();
      if (input.hasNextLine()) {
        String second = input.nextLine();
        System.out.println(second);
      }
      System.out.println(first);
    }
  }
}
