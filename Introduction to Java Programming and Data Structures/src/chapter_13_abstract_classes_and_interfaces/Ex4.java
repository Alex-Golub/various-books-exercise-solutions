package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_13.PrintCalendar;

import java.util.Scanner;

/**
 * **13.4 (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
 * a calendar for a specified month using the Calendar and GregorianCalendar
 * classes. Your program receives the month and year from the command line.
 *
 * @author Alex Golub
 * @since 23/06/2023 7:56 PM
 */
class Ex4 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter month: ");
            int month = Integer.parseInt(console.nextLine());
            System.out.print("Enter year: ");
            int year = Integer.parseInt(console.nextLine());

            PrintCalendar.printMonth(year, month);
        }
    }
}
