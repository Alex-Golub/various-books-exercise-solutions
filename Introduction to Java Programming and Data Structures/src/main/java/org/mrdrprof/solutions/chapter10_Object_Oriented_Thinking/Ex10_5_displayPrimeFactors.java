package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.util.Scanner;

/**
 * *10.5 (Display the prime factors)
 *
 * Enter number: 120
 * 2 2 2 3 5
 * 5 3 2 2 2
 *
 * Enter number: 720720
 * 2 2 2 2 3 3 5 7 11 13
 * 13 11 7 5 3 3 2 2 2 2
 *
 * @author Mr.Dr.Professor
 * @since 3/22/2021 9:39 PM
 */
/*public*/ class Ex10_5_displayPrimeFactors {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = console.nextInt();

    StackOfIntegers stack = new StackOfIntegers();

    for (int factor = 2; factor <= n / factor; factor++) {
      while (n % factor == 0) {
        System.out.print(factor + " ");
        n /= factor;
        stack.push(factor);
      }
    }

    if (n > 1) {
      System.out.println(n);
      stack.push(n);
    }

    printFactorsInReverseOrder(stack);
  }

  private static void printFactorsInReverseOrder(StackOfIntegers stack) {
    while (!stack.empty()) {
      System.out.print(stack.pop() + " ");
    }
  }
}
