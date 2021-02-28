package CodeStepByStep_java.parameters_and_return;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/Birthday
 *
 * Write a console program in a class named Birthday that prompts for
 * today's date and the user's birthday, then prints various information about
 * the dates.
 * Your code should print the "absolute day of the year" for today and the birthday.
 * This is a date's place within the year from 1 to 365.
 * January 1st is absolute day #1 and December 31st is #365.
 * Lastly the program prints the number of days until the user's next birthday.
 * Different messages appear if the birthday is today or tomorrow.
 *
 * 1. You should break down your program into several methods that use
 * parameters and returns to exchange data.
 *
 * 2. Do not use Java's built-in date libraries such as Date or GregorianCalendar.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 2:15 PM
 */
/*public*/ class Birthday {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    intro();

    int todaysAbsoluteDay = getCurrentAbsoluteDay("\nPlease enter today's date: ");
    int birthdayAbsoluteDay = getCurrentAbsoluteDay("\nPlease enter your birthday: ");

    if (todaysAbsoluteDay == birthdayAbsoluteDay) {
      System.out.println("\nHappy birthday!");
    } else if (birthdayAbsoluteDay - todaysAbsoluteDay == 1) {
      System.out.println("\nWow, your birthday is tomorrow!");
    } else {
      System.out.printf("\nYour next birthday is in %d days.",
                        todaysAbsoluteDay < birthdayAbsoluteDay ?
                        birthdayAbsoluteDay - todaysAbsoluteDay :
                        365 - todaysAbsoluteDay + birthdayAbsoluteDay);
    }
  }

  private static int getCurrentAbsoluteDay(String s) {
    System.out.println(s);
    System.out.print("What is the month (1-12)? ");
    int month = console.nextInt();

    System.out.printf("What is the day   (1-%d)? ", daysInMonth(month));
    int day = console.nextInt();

    int absoluteDay = absoluteDay(month, day);
    System.out.printf("%d/%d is day #%d of 365.\n",
                      month, day, absoluteDay);

    return absoluteDay;
  }

  public static int absoluteDay(int month, int day) {
    int absoluteDay = 0;
    for (int i = 1; i < month; i++) {
      absoluteDay += daysInMonth(i);
    }
    return absoluteDay + day;
  }

  public static int daysInMonth(int month) {
    switch (month) {
      case 4: case 6: case 9: case 11:
        return 30;
      case 2:
        return 28; // no leap years
    }
    return 31;
  }

  public static void intro() {
    System.out.println("This program tells you how many days");
    System.out.println("it will be until your next birthday.");
  }
}
