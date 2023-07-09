package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * *3.8 (Sort three integers)
 * Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order
 *
 * Created by ag on 22-Oct-20 10:39 AM
 */
class Ex3_8_Sort_Three {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three integer numbers: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    System.out.printf("Before sorting: %d %d %d\n", a, b, c);
    int min = Math.min(a, Math.min(b, c));
    int max = Math.max(a, Math.max(b, c));
    int median = a + b + c - (max + min);

    System.out.printf("ASC sort: %d %d %d", min, median, max);
  }
}
