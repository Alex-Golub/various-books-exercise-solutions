package cse_142.cs1_labs;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab4/ProcessName
 *
 * test #1:test1
 * console output: Type your name: Jessica Miller
 *                 Your name is: Miller, J.
 *                 result: pass
 *
 * test #2:test2
 * console output: Type your name: Tyler Durden
 *                 Your name is: Durden, T.
 *                 result: pass
 *
 * test #3:test3
 * console output: Type your name: P Diddy
 *                 Your name is: Diddy, P.
 *                 result: pass
 *
 * test #4:test4
 * console output: Type your name: A B
 *                 Your name is: B, A.
 *                 result: pass
 *
 * test #5:test5
 * console output: Type your name: ee cummings
 *                 Your name is: cummings, e.
 *                 result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 3:23 PM
 */
class ProcessName {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Type your name: ");
    String fullName = console.nextLine();
    String lastName = fullName.substring(fullName.indexOf(" ") + 1);
    System.out.println("Your name is: " + lastName + ", " + fullName.charAt(0) + ".");
  }
}
