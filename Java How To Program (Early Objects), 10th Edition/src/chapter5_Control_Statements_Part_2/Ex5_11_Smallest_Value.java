package chapter5_Control_Statements_Part_2;

import java.util.Scanner;

/**
 * 5.11 (Find the Smallest Value)
 *  Write an application that finds the smallest of several integers.
 *  Assume that the first value read specifies the number of values to input from the user.
 *  (i.e. do..while)
 *
 * Created by ag on 12-Jul-20 7:11 PM
 */
class Ex5_11_Smallest_Value {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int counter = -1;
    int min = Integer.MAX_VALUE;

    do {
      System.out.print("Enter number -> ");
      if (counter == -1) {
        counter = Integer.parseInt(scanner.nextLine());
        continue; // number of repetitions has been given go to next iteration
      }

      int userInput = Integer.parseInt(scanner.nextLine());
      min = Math.min(min, userInput);
      counter -= 1;
    } while (counter > 0);

    System.out.println("\nMinimal value is " + min);
  }
}
