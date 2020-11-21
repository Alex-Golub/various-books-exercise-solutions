package chapter3_parameters_and_objects;

import java.util.Scanner;

/**
 * 20. Write a method called inputBirthday that accepts a Scanner
 * for the console as a parameter and prompts the user
 * to enter a month, day, and year of birth, then prints the
 * birthdate in a suitable format.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:14 PM
 */
class Ex3_20_inputBirthday {
  public static void main(String[] args) {
    inputBirthday(new Scanner(System.in));
  }

  public static void inputBirthday(Scanner scanner) {
    System.out.print("On what day of the month were you born? ");
    int day = scanner.nextInt();
    System.out.print("What is the name of the month in which you were born? ");
    String month = scanner.next();
    System.out.print("During what year were you born? ");
    int year = scanner.nextInt();

    System.out.printf("You were born on %s %d, %d. You're mighty old!",
            month, day, year);
  }


}
