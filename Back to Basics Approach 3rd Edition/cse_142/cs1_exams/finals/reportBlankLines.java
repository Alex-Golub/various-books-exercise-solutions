package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final7/reportBlankLines
 *
 * @author Alex Golub
 * @since 14-Apr-21 9:24 PM
 */
class reportBlankLines {
  public static void main(String[] args) {
    String data = "Remember that a file \n" +
                  "can have blank lines \n" +
                  "like the one below: \n" +
                  " \n" +
                  "A blank line: \n" +
                  " \n" +
                  "is read as a String \n" +
                  "of length 0 \n" +
                  " \n" +
                  "by Scanner";
    reportBlankLines(new Scanner(data));
  }

  public static void reportBlankLines(Scanner data) {
    int totalBlank = 0;
    int row = 1;
    while (data.hasNextLine()) {
      String line = data.nextLine();

      if (line.isEmpty()) {
        System.out.println("line " + row + " is blank");
        totalBlank++;
      }

      row++;
    }

    System.out.println("total blank lines = " + totalBlank);
  }
}
