package chapter2_Intro_Java_Input_Ouput._2_25_OddEven;

import java.util.Scanner;

/**
 * 2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
 * [Hint: Use the remainder operator. An even number is a multiple of 2.
 * Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 * Created by ag on 15-Jun-20 12:45 PM
 */
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();

    if (num % 2 == 0)
      System.out.printf("%d is even", num);
    else
      System.out.printf("%d is odd", num);
  }
}
