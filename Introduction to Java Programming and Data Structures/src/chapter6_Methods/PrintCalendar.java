package chapter6_Methods;

import java.util.Scanner;

class PrintCalendar {
  /**
   * Main method
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter year
    System.out.print("Enter full year (e.g., 2001): ");
    int year = input.nextInt();

    // Prompt the user to enter month
    System.out.print("Enter month in number between 1 and 12: ");
    int month = input.nextInt();

    // Print calendar for the month of the year
    utils.chapter_13.PrintCalendar.printMonth(year, month);
  }
}
