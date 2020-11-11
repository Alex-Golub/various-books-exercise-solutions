package chapter2_objects;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * WORKED EXAMPLE 2.1
 * Write a program that computes how many days
 * have elapsed since the day you were born.
 * <p>
 * Created by ag on 06-Nov-20 12:40 AM
 */
class WE2_1_DaysAlive {
  public static void main(String[] args) {

    LocalDate birthday = LocalDate.of(1988, Month.JULY, 18);
    LocalDate today    = LocalDate.now();
    System.out.println("Birthday date: " + birthday.toString());
    System.out.println("Today's date: " + today.toString());

    long elapsedDays  = ChronoUnit.DAYS.between(birthday, today);
    long elapsedYears = ChronoUnit.YEARS.between(birthday, today);
    System.out.println("Days elapsed: " + elapsedDays);
    System.out.println("Years elapsed: " + elapsedYears);


    System.out.println("Hello, World!".replace(",", "").replace("!", ""));
  }
}
