package chapter2_objects;

import java.time.LocalDate;
import java.time.Month;

/**
 * ••• P2.9
 * I will be using LocalDate which is the new API for Date.
 *
 * Your task is to write a program that prints:
 * • The date and weekday that is 100 days from today.
 * • The weekday of your birthday.
 * • The date that is 10,000 days from your birthday.
 * Use the birthday of a computer scientist if you don’t want to reveal your own.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 1:06 PM
 */
class PP2_9 {
  public static void main(String[] args) {
    LocalDate eckertsBirthday = LocalDate.of(1919, Month.APRIL, 9);
    System.out.println(eckertsBirthday);

    System.out.println("100 Days from eckertsBirthday => " + eckertsBirthday.plusDays(100));
    System.out.println("Weekday of Eckerts Birthday => " + eckertsBirthday.getDayOfWeek());
    System.out.println("10,000 days => " + eckertsBirthday.plusDays(10_000));
  }
}
