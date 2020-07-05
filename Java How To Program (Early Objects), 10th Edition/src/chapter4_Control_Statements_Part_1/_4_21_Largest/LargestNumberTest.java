package chapter4_Control_Statements_Part_1._4_21_Largest;

import java.util.Scanner;

/**
 * 4.21 (Find the Largest Number) The process of finding the largest value is used frequently in
 * computer applications.
 * For example, a program that determines the winner of a sales contest would input
 * the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
 * Write a pseudocode program, then a Java application that inputs a series of 10 integers and
 * determines and prints the largest integer. Your program should use at least the following three variables:
 * a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
 * input and to determine when all 10 numbers have been processed).
 * b) number: The integer most recently input by the user.
 * c) largest: The largest number found so far.
 *
 * Created by ag on 26-Jun-20 2:06 PM
 */
class LargestNumberTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int counter = 1;
    final int MAX_NUMBERS = 10;
    int largest = Integer.MIN_VALUE; // set largest to minimum value of Integer

    while (counter <= MAX_NUMBERS) {
      System.out.print("Enter number: ");
      int number = Integer.parseInt(scanner.nextLine());

//      largest = largest > number ? largest : number;
      largest = Math.max(largest, number);

      counter++;
    }

    System.out.println("\nLargest number from " + MAX_NUMBERS + " numbers entered is -> " + largest);
  }
}
