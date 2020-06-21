package chapter9_Objects_Classes._9_5_GregorianCalendar;

import java.util.GregorianCalendar;

/**
 * *9.5 (Use the GregorianCalendar class) Java API has the GregorianCalendar
 * class in the java.util package, which you can use to obtain the year, month, and
 * day of a date.
 * The no-arg constructor constructs an instance for the current date, and
 * the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.
 * MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year,
 * month, and day.
 *
 * Write a program to perform two tasks:
 * 1. Display the current year, month, and day.
 * 2. The GregorianCalendar class has the setTimeInMillis(long), which
 * can be used to set a specified elapsed time since January 1, 1970.
 * Set the value
 * to 1234567898765L and display the year, month, and day.
 *
 * Created by ag on 19-May-20 3:07 PM
 */
public class GregorianDemo {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        universalDate(calendar);

        calendar.setTimeInMillis(1234567898765L);

        System.out.printf("%n%nElapsed time since January 1, 1970:%n");
        universalDate(calendar);
    }

    private static void universalDate(GregorianCalendar calendar) {
        System.out.printf("Year: %d Month: %02d, Day: %02d",
                calendar.get(GregorianCalendar.YEAR),
                calendar.get(GregorianCalendar.MONTH) + 1, // zero based
                calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
