package chapter5_logic_and_loops;

import java.util.Scanner;

/**
 * 12. Write a method called printAverage that uses a sentinel loop
 * to repeatedly prompt the user for numbers. Once the
 * user types any number less than zero, the method should display
 * the average of all non-negative numbers typed.
 * Display the average as a double.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 1:07 PM
 */
class Ex5_12_printAverage {
  public static void main(String[] args) {
    printAverage(new Scanner(System.in));
  }

  public static void printAverage(Scanner sc) {
    int count = 0;
    int sum   = 0;
    int input;

    while (true) {
      System.out.print("Type a number: ");
      input = sc.nextInt();
      if (input < 0)
        break;

      count++;
      sum += input;
    }

    if (count > 0)
      System.out.println("Average was " + (1.0 * sum) / count);
  }
}
