package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * 5.3 Case Study
 *
 * @author Mr.Dr.Professor
 * @since 19-Jan-21 10:01 PM
 */
class GuessingNumbers {
  static final int LOW = 0;
  static final int HIGH = 100;

  public static void main(String[] args) {
    System.out.printf("Guess a magic number between %d and %d\n", LOW, HIGH);
    int number = LOW + (int) (Math.random() * (HIGH - LOW + 1));
    Scanner console = new Scanner(System.in);

    while (true) {
      System.out.print("Enter your guess: ");
      int guess = console.nextInt();

      if (guess == number) {
        System.out.println("Yes, the number is " + number);
        break;
      }

      System.out.printf("Your guess is to %s\n",
              guess > number ? "high" : "low");
    }
  }
}
