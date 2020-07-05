package chapter4_Control_Statements_Part_1._4_29_Square_of_Asterisks;

import java.util.Scanner;

/**
 * 4.29 (Square of Asterisks) Write an application that prompts the user to enter the size of the side
 * of a square, then displays a hollow square of that size made of asterisks. Your program should work
 * for squares of all side lengths between 1 and 20.
 *
 * Created by ag on 29-Jun-20 2:54 PM
 */
class SquareOfAsterisks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter square side length (-1 to exit): ");
      int len = Integer.parseInt(scanner.nextLine());

      if (len == -1)
        break;

      System.out.println("* ".repeat(len).stripTrailing()); // stripTrailing() remove trailing white spaces
      for (int i = 0; i < len - 2; i++)
        System.out.println(("*" + " ".repeat(len * 2 - 3) + "*"));
      System.out.println("* ".repeat(len).stripTrailing());
    }
  }
}
