package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * **7.5 (The number of even numbers and odd numbers)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 3:10 PM
 */
class Ex7_5_evenAndOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter numbers(0 to stop): ");
    int even = 0;
    int odd  = 0;

    while (true) {
      int num = sc.nextInt();

      if (num == 0)
        break;

      if (num % 2 == 0)
        even++;
      else
        odd++;
    }

    System.out.println("The number of odd numbers: " + odd);
    System.out.println("The number of even numbers: " + even);
  }
}
