package chapter2_Intro_Java_Input_Ouput._2_15_Arithmetic;

import java.util.Scanner;

/**
 * 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them
 * from the user and prints their sum, product, difference and quotient (division).
 * Use the techniques shown in Fig. 2.7.
 *
 * Created by ag on 15-Jun-20 11:42 AM
 */
class Arithmetic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int n1 = scanner.nextInt();

    System.out.print("Enter second integer: ");
    int n2 = scanner.nextInt();

    System.out.printf("%d + %d = %d%n", n1, n2, (n1 + n2));
    System.out.printf("%d * %d = %d%n", n1, n2, (n1 * n2));
    System.out.printf("%d - %d = %d%n", n1, n2, (n1 - n2));
    System.out.printf("%d / %d = %d%n", n1, n2, (n1 / n2));
  }
}
