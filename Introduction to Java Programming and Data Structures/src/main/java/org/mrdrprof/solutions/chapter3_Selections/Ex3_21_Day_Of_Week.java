package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.21 (Science: day of the week)
 * Christian Zeller to calculate the day of the week
 *
 * Created by ag on 27-Oct-20 11:48 PM
 */
class Ex3_21_Day_Of_Week {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get inputs
    System.out.print("Enter year: (e.g., 2012): ");
    int year = scanner.nextInt();
    System.out.print("Enter month: 1-12: ");
    int m = scanner.nextInt();
    System.out.print("Enter the day of the month: 1-31: ");
    int q = scanner.nextInt();

    // Adjust month and year if m is January or February
    if (m == 1 || m == 2) {
      m = m == 1 ? 13 : 14;
      year--;
    }

    int k = year % 100; // year of the century
    int j = year / 100;
    int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7; // day of week

    String dayOfWeek = "";
    switch (h) {
      case 0: dayOfWeek = "Saturday";  break;
      case 1: dayOfWeek = "Sunday";    break;
      case 2: dayOfWeek = "Monday";    break;
      case 3: dayOfWeek = "Tuesday";   break;
      case 4: dayOfWeek = "Wednesday"; break;
      case 5: dayOfWeek = "Thursday";  break;
      case 6: dayOfWeek = "Friday";    break;
    }

    System.out.println("Day of the week is " + dayOfWeek);

  }
}
