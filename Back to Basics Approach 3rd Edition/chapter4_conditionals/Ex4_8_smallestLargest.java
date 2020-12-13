package chapter4_conditionals;

import java.util.Scanner;

/**
 * 8. Write a method called smallestLargest that accepts a Scanner for the
 * console as a parameter and asks the user
 * to enter numbers, then prints the smallest and largest of all the numbers
 * supplied by the user.
 * You may assume that the user enters a valid number greater than 0 for
 * the number of numbers to read.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 5:07 PM
 */
class Ex4_8_smallestLargest {
  public static void smallestLargest() {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int n = sc.nextInt();

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      System.out.print("Number " + (i + 1) + ": ");
      int in = sc.nextInt();
      if (in > max)
        max = in;
      if (in < min)
        min = in;
    }

    System.out.println("Smallest = " + min);
    System.out.println("Largest = " + max);
  }
}
