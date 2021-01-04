package chapter6_file_processing;

import java.util.Scanner;

/**
 * 3. Write a method called negativeSum that accepts a Scanner reading
 * input from a file containing a series of integers, and print a message
 * to the console indicating whether the sum starting from the first number
 * is ever negative.
 * You should also return true if a negative sum can be reached and false
 * if not.
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 10:35 PM
 */
class Ex6_3_negativeSum {
  public static void main(String[] args) {
    System.out.println(negativeSum(new Scanner("38 4 19 -27 -15 -3 4 19 38")));
    System.out.println(negativeSum(new Scanner("14 7 -10 9 -18 -10 17 42 98")));
  }

  public static boolean negativeSum(Scanner input) {
    int sum = 0;
    for (int step = 1; input.hasNextInt(); step++) {
      sum += input.nextInt();
      if (sum < 0) {
        System.out.printf("%d after %d steps\n", sum, step);
        return true;
      }
    }
    System.out.println("no negative sum");
    return false;
  }
}
