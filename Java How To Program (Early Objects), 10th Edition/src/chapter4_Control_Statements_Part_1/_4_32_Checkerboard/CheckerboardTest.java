package chapter4_Control_Statements_Part_1._4_32_Checkerboard;

import java.util.Scanner;

/**
 * 4.32 (Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
 *      System.out.print("* ");
 *      System.out.print(" ");
 *      System.out.println();
 * to display the checkerboard pattern that follows.
 * A System.out.println method call with no arguments causes the program to output a single newline character.
 * [Hint: Repetition statements are required.]
 *
 * Created by ag on 29-Jun-20 4:16 PM
 */
class CheckerboardTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int ASTERISKS_PER_ROW = 8;

    while (true) {
      System.out.print("Enter checkerboard size (-1 to exit): ");
      int size = Integer.parseInt(scanner.nextLine());

      if (size == -1)
        break;

      if (size <= 1) {
        System.out.println("Error: please enter size grater then one, try again\n");
        continue;
      }

      for (int i = 1; i <= size; i++) {
        if (i % 2 == 1)
          System.out.println(repeatString("* ", ASTERISKS_PER_ROW));
        else
          System.out.println(repeatString(" *", ASTERISKS_PER_ROW));

        /* Alternative way with built in repeat() method from String library */
//        System.out.println(i % 2 == 1 ?
//                "* ".repeat(ASTERISKS_PER_ROW) :
//                " *".repeat(ASTERISKS_PER_ROW)
//        );
      }

      System.out.println();
    }
  }

  private static String repeatString(String s, int n) {
    String line = "";
    for (int i = 1; i <= n; i++)
      line += s; // not good idea, we should use StringBuilder

    return line;
  }
}
