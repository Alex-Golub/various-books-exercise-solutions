package cse_142.cs1_labs;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab4/ProcessName2
 *
 * test #1:test1
 * console output: Type your name: Joe
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: O K!
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: what
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: Tyler Durden
 *                 Your name is: Durden, T.
 * result: pass
 *
 * test #2:test2
 * console output: Type your name: Jessica Miller
 *                 Your name is: Miller, J.
 * result: pass
 *
 * test #3:test3
 * console output: Type your name: A B
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: C DE
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: FG H
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: arrrrrrrrrrrgh
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name:
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: confused
 *                 Error, must be at least 5 chars with a space.
 *                 Type your name: Bo Bo
 *                 Your name is: Bo, B.
 * result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 3:26 PM
 */
class ProcessName2 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    String name = "";
    final int MIN_LENGTH = 5;

    while (true) {
      System.out.print("Type your name: ");
      String fullName = console.nextLine();

      if (fullName.contains(" ") && fullName.length() > 4) {
        name = fullName.substring(fullName.indexOf(" ") + 1)
               + ", " + fullName.charAt(0);
        break;
      }

      System.out.println("Error, must be at least " +
                         MIN_LENGTH + " chars with a space.");
    }

    System.out.println("Your name is: " + name + ".");
  }
}
