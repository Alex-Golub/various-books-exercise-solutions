package org.mrdrprof.solutions.chapter3_Selections;

import java.time.Month;
import java.util.Scanner;

/**
 * *3.11 (Find the number of days in a month)
 * Write a program that prompts the user to enter the month and year and
 * displays the number of days in the month.
 * <p>
 * Created by ag on 26-Oct-20 3:24 PM
 */
class Ex3_11_Days_In_Month {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter month and a year: ");
      int month = scanner.nextInt();
      int year = scanner.nextInt();

      // 1, 3, 5, 7, 8 10 ,12 -> 31
      // 2                    -> leap? 29 otherwise 28
      // 4, 6, 9, 11          -> 30
      int days;
      switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          days = 31;
          break;

        case 4: case 6: case 9: case 11:
          days = 30;
          break;

        case 2:
          boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
          days =  isLeap ? 29 : 28;
          break;

        default:
          System.out.println(month + " is not a valid month, exiting...");
          return;
      }

      System.out.printf("%s %d has %d days.\n",
              Month.of(month).toString(), year, days);
    }
  }
}
