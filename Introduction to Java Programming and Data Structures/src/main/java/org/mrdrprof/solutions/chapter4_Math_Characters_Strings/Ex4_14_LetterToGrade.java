package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.14 (Convert letter grade to number)
 * Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its
 * corresponding numeric value 4, 3, 2, 1, or 0.
 * For other input, display invalid grade.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 3:30 PM
 */
class Ex4_14_LetterToGrade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a letter grade: ");
      String gradeLetter = scanner.nextLine();

      int gradeToNum = -1;
      switch (gradeLetter) {
        case "a": case "A": gradeToNum = 4; break;
        case "b": case "B": gradeToNum = 3; break;
        case "c": case "C": gradeToNum = 2; break;
        case "d": case "D": gradeToNum = 1; break;
        case "e": case "E": gradeToNum = 0; break;
      }

      if (gradeToNum == -1)
        System.out.println("'" + gradeLetter + "' is an invalid grade");
      else
        System.out.printf("The numeric value for grade %s is %d\n",
                gradeLetter, gradeToNum);
    }
  }
}
