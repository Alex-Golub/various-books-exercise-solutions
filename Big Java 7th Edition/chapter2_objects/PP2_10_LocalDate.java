package chapter2_objects;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 * •• P2.10
 * Your task is to write a program that prints
 * • The weekday of “Pi day”, that is, March 14, of the current year.
 * • The date and weekday of “Programmer’s day” in the current year; that is, the
 * 256th day of the year. (The number 256, or 28, is useful for some programming
 * tasks.)
 * • The date and weekday of the date that is 10,000 days earlier than today.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 1:44 PM
 */
class PP2_10_LocalDate {
  public static void main(String[] args) {
    LocalDate piDay = LocalDate.of(Year.now().getValue(), Month.MARCH, 14);
    System.out.println("Pi Date: " + piDay + " day is on " +
            piDay.getDayOfWeek());

    LocalDate programmerDay = LocalDate
            .of(Year.now().getValue(), Month.JANUARY, 1)
            .plusDays(256);
    System.out.println("Programmer Date: " + programmerDay + ", on " +
            programmerDay.getDayOfWeek());

    LocalDate today = LocalDate.now();
    System.out.println("10,000 days earlier from " + today + " is " +
            today.minusDays(10_000));
  }
}
