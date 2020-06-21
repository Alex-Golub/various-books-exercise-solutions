package chapter2_Intro_Java_Input_Ouput._2_26_Multiples;

import java.util.Scanner;

/**
 * 2.26 (Multiples) Write an application that reads two integers, determines whether the first is a
 * multiple of the second and prints the result.
 * [Hint: Use the remainder operator.]
 *
 * Created by ag on 15-Jun-20 12:47 PM
 */
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
    int n1 = scanner.nextInt();

    System.out.print("Enter 2nd number: ");
    int n2 = scanner.nextInt();

    if (n1 % n2 == 0)
      System.out.printf("%d is multiples of %d", n1, n2);
    else
      System.out.printf("%d is not multiples of %d", n1, n2);
  }
}
