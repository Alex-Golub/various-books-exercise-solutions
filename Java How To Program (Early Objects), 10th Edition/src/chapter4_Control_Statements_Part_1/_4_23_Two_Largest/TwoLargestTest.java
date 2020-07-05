package chapter4_Control_Statements_Part_1._4_23_Two_Largest;

import java.util.Scanner;

/**
 * 4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
 * the two largest values of the 10 values entered.
 * [Note: You may input each number only once.]
 *
 * Created by ag on 26-Jun-20 2:20 PM
 */
class TwoLargestTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int counter = 1;
    int firstLargest = Integer.MIN_VALUE + 1;
    int secondLargest = Integer.MIN_VALUE;

    while (counter <= 10) {
      System.out.print("Enter number: ");
      int number = Integer.parseInt(scanner.nextLine());

      if (firstLargest < number) {
        secondLargest = firstLargest;
        firstLargest = number;
      } else if (secondLargest < number) {
        secondLargest = number;
      }

      counter++;
    }

    System.out.println("\nFirst largest is: " + firstLargest + "\nSecond largest is: " + secondLargest);
  }
}
