package chapter2_objects;

import Toolkit.Day;

/**
 * • E2.16
 * Using the Day class of Worked Example 2.1,
 * write a DayTester program that constructs a Day object
 * representing today, adds ten days to it, and then computes
 * the difference between that day and today.
 * Print the difference and the expected value.
 *
 * Created by ag on 08-Nov-20 3:28 PM
 */
class Ex2_16_DayTester {
  public static void main(String[] args) {
    final int PLUS_DAYS = 10;

    Day today = new Day();
    System.out.println("Today: " + today);

    Day future = today.addDays(PLUS_DAYS);
    System.out.println(PLUS_DAYS + " days from today: " + future);

    int diff = future.daysFrom(today);
    System.out.println(future + " and " + today + " is " + diff +
            " days differance");

  }
}
