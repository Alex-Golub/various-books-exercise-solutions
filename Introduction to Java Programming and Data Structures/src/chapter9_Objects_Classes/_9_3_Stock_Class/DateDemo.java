package chapter9_Objects_Classes._9_3_Stock_Class;

import java.util.Date;

/**
 * *9.3 (Use the Date class) Write a program that creates a Date object, sets its elapsed
 * time to 10_000, 100_000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, and 100000000000, and displays the date and time using the
 * toString() method, respectively.
 *
 * Created by ag on 19-May-20 2:44 PM
 */
public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();

        long time = 10_000;
        while (time <= 100_000_000_000L) {
            date.setTime(time);
            System.out.println("Date: " + date.toString());
            System.out.println("Time: " + date.toString() + "\n");
            time *= 10;
        }
    }
}
