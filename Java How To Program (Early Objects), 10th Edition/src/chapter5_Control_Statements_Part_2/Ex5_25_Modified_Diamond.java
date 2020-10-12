package chapter5_Control_Statements_Part_2;

import java.util.Scanner;

/**
 * 5.25 (Modified Diamond Printing Program)
 * Modify the application you wrote in Exercise 5.24
 * to read an odd number in the range 1 to 19 to specify the number of rows
 * in the diamond.
 * Your program should then display a diamond of the appropriate size.
 *
 * Created by ag on 12-Oct-20 1:18 PM 
 */
class Ex5_25_Modified_Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {

      // Get input from user
      System.out.print("Enter number of rows (1-19): ");
      byte rows = scanner.nextByte();
      if (rows < 1) {
        System.out.printf("Entered value is %d, is less then " +
                              "1, setting rows = 19\n", rows);
        rows = 1;
      } else if (rows > 19) {
        System.out.printf("Entered value is %d, is greater then " +
                              "19 setting rows = 19\n", rows);
        rows = 19;
      }

      // Print diamond
      final int HEIGHT = rows / 2 + 1;
      for (int i = 1; i <= HEIGHT; i++) {
        for (int j = 1; j <= HEIGHT - i; j++) System.out.print(" ");
        for (int k = 1; k <= 2 * i - 1; k++)  System.out.print("*");
        System.out.println();
      }

      for (int i = HEIGHT - 1; i >= 1; i--) {
        for (int j = 1; j <= HEIGHT - i; j++) System.out.print(" ");
        for (int k = 1; k <= 2 * i - 1; k++)  System.out.print("*");
        System.out.println();
      }

      System.out.println();
    }
  }
}
