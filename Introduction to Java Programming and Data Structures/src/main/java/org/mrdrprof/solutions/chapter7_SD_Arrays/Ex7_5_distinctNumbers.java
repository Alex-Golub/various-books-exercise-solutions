package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * **7.5 (Print distinct numbers)
 *
 * @author Mr.Dr.Professor
 * @since 03-Feb-21 3:10 PM
 */
class Ex7_5_distinctNumbers {
  public static void main(String[] args) {
    final int N  = 10;
    Scanner   sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter " + N + " (+ve) numbers up to " + N + ": ");
      int[] numbers       = new int[N];
      int   distinctCount = 0;

      for (int i = 0; i < N; i++) {
        int num = sc.nextInt();

        if (!inArray(num, numbers)) {
          numbers[distinctCount] = num;
          distinctCount++;
        }
      }

      printDistinct(numbers, distinctCount);
      System.out.println("\n");
    }
  }

  private static void printDistinct(int[] numbers, int distinctCount) {
    System.out.print("The distinct numbers are: ");
    for (int i = 0; i < distinctCount; i++) {
      System.out.print(numbers[i]);

      if ((i + 1) < numbers.length)
        System.out.print(" ");
    }
  }

  private static boolean inArray(int num, int[] numbers) {
    for (int val : numbers)
      if (val == num)
        return true;

    return false;
  }
}
