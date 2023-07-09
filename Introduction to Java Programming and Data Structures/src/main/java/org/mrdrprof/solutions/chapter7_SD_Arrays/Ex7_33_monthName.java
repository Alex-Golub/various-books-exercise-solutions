package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * *7.33 (Month name)
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 8:49 PM
 */
class Ex7_33_monthName {
  public static void main(String[] args) {
    String[] months = {"", "January", "February", "March",
                       "April", "May", "June", "July", "August",
                       "September", "October", "November", "December"};
    String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat",
                       "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                       "Horse", "Sheep"};

    while (true) {
      System.out.print("Enter month number (1-12): ");
      Scanner sc = new Scanner(System.in);
      int     i  = sc.nextInt();
      if (i < 1 || i > 12) {
        System.out.println("Invalid month number, try again\n");
        continue;
      }

      System.out.printf("Month %d is %s\n", i, months[i]);

      System.out.print("Enter a year: ");
      int year = sc.nextInt();
      System.out.printf("Year %d of the %s\n\n",
                        year, zodiac[year % 12]);
    }
  }
}
