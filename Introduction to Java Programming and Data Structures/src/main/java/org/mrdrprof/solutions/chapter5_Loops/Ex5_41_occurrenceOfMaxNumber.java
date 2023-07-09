package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * *5.41 (Occurrence of max numbers)
 * 3 5 2 5 5 5 0 => 4
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 7:03 PM
 */
class Ex5_41_occurrenceOfMaxNumber {
  public static void main(String[] args) {
    Scanner console  = new Scanner(System.in);
    int     maxSoFar = Integer.MIN_VALUE;
    int     maxCount = 0;

    System.out.print("Enter numbers (e.g. 1 -2 3 8 2 -5 0): ");

    while (console.hasNextInt()) {
      int num = console.nextInt();

      if (num == 0)
        break;

      if (num == maxSoFar) {
        maxCount++;
      } else if (num > maxSoFar) {
        maxSoFar = num;
        maxCount = 1;
      }
    }

    if (maxCount == 0) {
      System.err.println("No numbers were entered");
    } else {
      System.out.println("The largest number is " + maxSoFar);
      System.out.println("The occurrence count of the largest number is " + maxCount);
    }
  }
}
