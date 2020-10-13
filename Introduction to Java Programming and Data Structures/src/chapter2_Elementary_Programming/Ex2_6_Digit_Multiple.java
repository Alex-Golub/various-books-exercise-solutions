package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * **2.6 (Multiply the digits in an integer)
 * Write a program that reads an integer between
 * 0 and 1000 and multiplies all the digits in the integer.
 *
 * Created by ag on 13-Oct-20 1:44 PM 
 */
class Ex2_6_Digit_Multiple {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: "); // (0, 100)
    int number = scanner.nextInt();

    int u = number % 10;
    int t = number / 10 % 10;
    int h = number / 100;

    int product = 1;
    if (number < 10) product *= u;
    if (number < 100) product *= u * t;
    else product *= u * t * h;

    System.out.printf("The multiplication of all digits in %d is %d",
                      number, product);
  }
}
