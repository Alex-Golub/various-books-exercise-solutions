package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.18 (Student major and status)
 * Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters.
 * The first character indicates the major and the second is number
 * character 1, 2, 3, 4, which indicates whether a student is
 * a freshman, sophomore, junior, or senior.
 * Suppose the following characters are used to denote the majors:
 *   I: Information Management
 *   C: Computer Science
 *   A: Accounting
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 5:32 PM
 */
class Ex4_18_MajorAndStatus {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter two characters: ");
      String in = scanner.next();

      String major = getMajor(in);
      String status = getStatus(in);

      if (major.isEmpty() || status.isEmpty())
        System.out.println("Invalid Input");
      else
        System.out.println(major + " " + status);

      System.out.println();
    }
  }

  private static String getStatus(String in) {
    String status = "";
    switch (in.charAt(1)) {
      case '1': status = "Freshman"; break;
      case '2': status = "Sophomore"; break;
      case '3': status = "Junior"; break;
      case '4': status = "Senior"; break;
    }

    return status;
  }

  private static String getMajor(String in) {
    String major = "";
    switch (in.charAt(0)) {
      case 'I': major = "Information Management"; break;
      case 'C': major = "Computer Science"; break;
      case 'A': major = "Accounting"; break;
    }

    return major;
  }
}
