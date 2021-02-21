package CodeStepByStep_java.console_output;

import java.util.Scanner;

/**
 * Write an interactive console program in a class named CalculateLine
 * that calculates y coordinates on a line.
 * First, it prompts the user for a slope m, and an intercept b
 * (as seen in the line equation of the form y = mx + b).
 * Then the program prompts the user for x values until the user enters a -1.
 * For each entered number, print the y value on that line for that entered x value.
 * Here is a sample run of the program (user input is shown like this):
 *
 * This program calculates y coordinates for a line.
 * Enter slope (m): 2
 * Enter intercept (b): 4
 * Enter x: 5
 * f(5) = 14
 * Enter x: 1
 * f(1) = 6
 * Enter x: -1
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 8:57 PM
 */
/*public*/ class CalculateLine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("This program calculates y coordinates for a line.");
    System.out.print("Enter slope (m): ");
    int m = Integer.parseInt(sc.nextLine());

    System.out.print("Enter intercept (b): ");
    int b = Integer.parseInt(sc.nextLine());

    while (true) {
      System.out.print("Enter x: ");
      int x = Integer.parseInt(sc.nextLine());

      if (x == -1) {
        break;
      }

      System.out.printf("f(%d) = %d\n", x, m * x + b);
    }
  }
}
