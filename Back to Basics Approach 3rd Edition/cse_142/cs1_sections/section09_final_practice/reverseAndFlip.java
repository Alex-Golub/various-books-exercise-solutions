package cse_142.cs1_sections.section09_final_practice;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/reverseAndFlip
 *
 * writes to System.out the same file with successive pairs
 * of lines reversed in order and with the second line of
 * each pair reversed.
 * 1. Notice that a line can be blank
 * 2. Also notice that an input file can have an odd number of lines
 *    in which case the last line is printed in its original position.
 *
 * You may not make any assumptions about how many lines are in the Scanner
 * and you may not construct any extra data structures to solve this problem.
 *
 * test #1:1
 * console output:
 * .ebaw eht ni elbmig dna eryg did
 * Twas brillig and the slithy toves
 * .ebargtuo shtar emom eht dna
 * All mimsey were the borogroves,
 * ,nos ym ,kcowrebbaJ eht eraweB"
 *
 * nuhs dna drib buJbuJ eht eraweB
 * the jaws that bite, the claws that catch,
 * the frumious bandersnatch."
 * result: pass
 *
 * @author Alex Golub
 * @since 04-Apr-21 2:58 PM
 */
class reverseAndFlip {
  public static void main(String[] args) {
    String mockData = "Twas brillig and the slithy toves\n" +
                      "did gyre and gimble in the wabe.\n" +
                      "All mimsey were the borogroves,\n" +
                      "and the mome raths outgrabe.\n" +
                      "\n" +
                      "\"Beware the Jabberwock, my son,\n" +
                      "the jaws that bite, the claws that catch,\n" +
                      "Beware the JubJub bird and shun\n" +
                      "the frumious bandersnatch.\"";
    reverseAndFlip(new Scanner(mockData));
  }

  public static void reverseAndFlip(Scanner file) {
    while (file.hasNextLine()) {
      String firstLine = file.nextLine();
      if (file.hasNextLine()) {
        String secondLine = file.nextLine();
        System.out.println(new StringBuilder(secondLine).reverse());
      }

      System.out.println(firstLine); // this was the last line of odd number of lines
    }
  }
}
