package chapter6_file_processing;

import java.util.Scanner;

/**
 * 18. Write a method called plusScores that accepts a
 * Scanner representing an input file containing a series of lines
 * that represent student records. Each student record
 * takes up two lines of input. The first line has the student’s name
 * and the second line has a series of plus and minus characters.
 * For each student you should produce a line of output with the
 * student’s name followed by a colon followed by the
 * percent of plus characters.
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 12:51 PM
 */
class Ex6_18_plusScores {
  public static void main(String[] args) {
    String test = "Kane, Erica\n" +
                  "--+-+\n" +
                  "Chandler, Adam\n" +
                  "++-+\n" +
                  "Martin, Jake\n" +
                  "+++++++\n" +
                  "Dillon, Amanda\n" +
                  "++-++-+-";
    plusScores(new Scanner(test));
  }

  public static void plusScores(Scanner input) {
    while (input.hasNextLine()) {
      String studentName = input.nextLine();
      String records     = input.nextLine();
      int    total       = 0;
      int    plus        = 0;
      for (int i = 0; i < records.length(); i++) {
        total++;
        plus += records.charAt(i) == '+' ? 1 : 0;
      }

      System.out.printf("%s: %.1f%% plus\n", studentName, 100.0 * plus / total);
    }
  }
}
