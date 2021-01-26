package chapter5_Loops;

import java.util.Scanner;

/**
 * *5.16 (Find the factors of an integer)
 * Write a program that reads an integer and displays
 * all its smallest factors in an increasing order.
 * For example, if the input integer is
 * 120, the output should be as follows: 2, 2, 2, 3, 5.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 8:58 PM
 */
class Ex5_16_factors {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    while (true) { // CTRL + D to stop
      System.out.print("Enter +ve number -> ");
      int number = console.nextInt();

      for (int divisor = 2; divisor <= number / divisor; divisor++) {
        while (number % divisor == 0) {
          System.out.print(divisor + " ");
          number /= divisor;
        }
      }

      System.out.println(number > 1 ? number : "");
    }
  }
}
