package chapter6_file_processing;

import java.util.Scanner;

/**
 * 5. Write a method called collapseSpaces that accepts a Scanner
 * representing an input file as its parameter, then
 * reads that file and outputs it with all its tokens
 * separated by single spaces, collapsing any sequences of multiple
 * spaces into single spaces.
 *
 * E.g.
 * f("seven               years ago         our") => "seven years ago our"
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 11:05 PM
 */
class Ex6_5_collapseSpaces {
  public static void main(String[] args) {
    String test = "four      score   and\n" +
                  "\n" +
                  "seven               years ago         our\n" +
                  "            \n" +
                  "fathers brought             forth\n" +
                  "    on this          continent\n" +
                  "a         new\n" +
                  "            \n" +
                  "nation";
    collapseSpaces(new Scanner(test));
  }

  public static void collapseSpaces(Scanner input) {
    while (input.hasNextLine()) {
      String line = input.nextLine();

      Scanner tokenReader = new Scanner(line);
      if (tokenReader.hasNext()) { // dealing with fencepost
        System.out.print(tokenReader.next());
        while (tokenReader.hasNext())
          System.out.print(" " + tokenReader.next());
      }

      System.out.println();
    }
  }
}
