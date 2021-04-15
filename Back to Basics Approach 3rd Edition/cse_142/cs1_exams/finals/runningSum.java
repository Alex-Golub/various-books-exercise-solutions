package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final8/runningSum
 *
 * @author Alex Golub
 * @since 14-Apr-21 11:56 PM
 */
class runningSum {

  // You may assume that there is at least one number to read.
  public static void runningSum(Scanner numbers) {
    double sum = numbers.nextDouble();
    double maxSum = sum;
    System.out.print("running sum = " + sum);

    while (numbers.hasNextDouble()) {
      sum += numbers.nextDouble();
      System.out.print(" " + sum);
      maxSum = Math.max(maxSum, sum);
    }

    System.out.println("\nmax sum = " + maxSum);
  }
}
