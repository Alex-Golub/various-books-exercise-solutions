package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * *5.48 (Process string)
 * Display the characters at even positions.
 *
 * @author Mr.Dr.Professor
 * @since 26-Jan-21 10:13 PM
 */
class Ex5_48_processString {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = console.nextLine();

    for (int i = 1; i < str.length(); i += 2) {
      char c = str.charAt(i);
      if (c != ' ') {
        System.out.print(c);
      }
    }
  }
}
