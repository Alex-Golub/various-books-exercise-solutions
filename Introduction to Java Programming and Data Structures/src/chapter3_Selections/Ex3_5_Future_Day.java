package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.5 (Find future dates)
 * Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future
 * day and display the future day of the week.
 *
 * Created by ag on 22-Oct-20 9:32 AM
 */
class Ex3_5_Future_Day {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter today's day: ");
    int today = scanner.nextInt();
    if (today < 0) {
      System.out.println("Negative number entered, set today to 0 - Sunday");
      today = 0;
    }

    System.out.print("Enter the number of days elapsed since today: ");
    int elapsed = scanner.nextInt();
    if (elapsed < 0) {
      System.out.println("Negative number of days entered, " +
              "set to 1 day elapsed since today");
      elapsed = 1;
    }

    int futureDay = (today + elapsed) % 7;

    String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday",
            "Saturday"
    };

    System.out.printf("Today is %s and the future day is %s\n",
            days[today], days[futureDay]);

  }
}
