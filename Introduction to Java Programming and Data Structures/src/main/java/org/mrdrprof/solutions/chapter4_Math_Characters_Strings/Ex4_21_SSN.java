package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.21 (Check SSN)
 * Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit.
 * Your program should check whether the input is valid.
 *
 * e.g.
 * Enter a SSN (DDD-DD-DDDD): 232-23-5432
 * 232-23-5432 is a valid social security number
 *
 * Enter a SSN (DDD-DD-DDDD): 32-23-432
 * 32-23-432 is an invalid social security number
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 6:03 PM
 */
class Ex4_21_SSN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a SSN (DDD-DD-DDDD): ");
      String ssn = scanner.nextLine();

      // using regular-expression
//      boolean isValid = ssn.matches("\\d{3}-\\d{2}-\\d{4}");

      // First check for separators to avoid StringIndexOutOfBounds
      int firstHyphen  = ssn.indexOf("-");
      int secondHyphen = ssn.lastIndexOf("-");
      if (firstHyphen == -1 || secondHyphen == firstHyphen) {
        System.out.println(ssn + " is an invalid social security number");
        continue;
      }

      // Get parts of ssn by hyphens
      String start = ssn.substring(0, firstHyphen);
      String mid   = ssn.substring(firstHyphen + 1, secondHyphen);
      String end   = ssn.substring(secondHyphen + 1);

      if (start.length() != 3 || mid.length() != 2 || end.length() != 4)
        System.out.println(ssn + " is an invalid social security number");
      else
        System.out.println(ssn + " is a valid social security number");
    }
  }
}
