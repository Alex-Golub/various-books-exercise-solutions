package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * To use input redirection remove package
 * javac SentinelValue.java
 * java SentinelValue < input.txt
 *
 * @author Mr.Dr.Professor
 * @since 19-Jan-21 10:58 PM
 */
class SentinelValue {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter an integer (the input ends if it is 0): ");
    int data = console.nextInt();
    int sum = 0;

    while (data != 0) {
      sum += data;
      System.out.print("Enter an integer (the input ends if it is 0): ");
      data = console.nextInt();
    }

    System.out.println("The sum is " + sum);
  }
}
