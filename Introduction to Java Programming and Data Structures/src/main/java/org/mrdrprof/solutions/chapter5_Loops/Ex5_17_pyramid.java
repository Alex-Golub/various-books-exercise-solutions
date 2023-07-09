package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * **5.17 (Display pyramid)
 * Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 9:25 PM
 */
class Ex5_17_pyramid {
  public static void main(String[] args) {
    Scanner   console = new Scanner(System.in);
    final int LOW     = 1;

    System.out.print("Enter the number of lines: ");
    int lines = console.nextInt();

    if (lines < LOW)
      throw new IllegalStateException("Lines should be +ve number: " + lines);

    for (int row = 0; row < lines; row++) {
      int n = lines - row;
      int j = n;

      while (j > 1)
        System.out.printf("%-3d", j--);
      while (j <= n) // j == 1 at beginning
        System.out.printf("%-3d", j++);

      System.out.println();
    }

  }
}
