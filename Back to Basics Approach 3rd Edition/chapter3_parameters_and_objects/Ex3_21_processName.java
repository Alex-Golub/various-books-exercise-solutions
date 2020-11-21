package chapter3_parameters_and_objects;

import java.util.Scanner;

/**
 * 21. Write a method called processName that accepts a Scanner
 * for the console as a parameter and prompts the user to enter
 * a full name, then prints the name in reverse order
 * (i.e., last name, first name).
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:18 PM
 */
class Ex3_21_processName {
  public static void main(String[] args) {
    processName(new Scanner(System.in));
  }

  public static void processName(Scanner scanner) {
    System.out.print("Please enter your full name: ");
    String fullName = scanner.nextLine();

    int    split = fullName.indexOf(" ");
    String name  = fullName.substring(0, split);
    String last  = fullName.substring(split + 1);

    System.out.printf("Your name in reverse order is %s, %s", last, name);
  }
}
