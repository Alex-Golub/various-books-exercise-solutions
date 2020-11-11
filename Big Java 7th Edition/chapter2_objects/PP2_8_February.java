package chapter2_objects;

import Toolkit.Day;

/**
 * •• P2.8
 * Using the Day class of Worked Example 2.1, write a program that
 * generates a Day object representing February 28 of this year,
 * and three more such objects that represent February 28 of the
 * next three years.
 * Advance each object by one day, and print each object.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 12:17 PM
 */
class PP2_8_February {
  public static void main(String[] args) {
    Day feb1 = new Day(2020, 2, 28);
    Day feb2 = new Day(2021, 2, 28);
    Day feb3 = new Day(2022, 2, 28);
    Day feb4 = new Day(2023, 2, 28);

    System.out.println(feb1 + " => Expected: 2020-02-28");
    feb2 = feb2.addDays(1);
    System.out.println(feb2 + " => Expected: 2021-03-01");
    feb3 = feb3.addDays(1);
    System.out.println(feb3 + " => Expected: 2022-03-01");
    feb4 = feb4.addDays(1);
    System.out.println(feb4 + " => Expected: 2023-03-01");
  }
}
