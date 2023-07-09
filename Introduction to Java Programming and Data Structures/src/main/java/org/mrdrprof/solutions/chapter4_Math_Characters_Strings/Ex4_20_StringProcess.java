package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * 4.20 (Process a string)
 * Write a program that prompts the user to enter a string and
 * displays its length and its last character.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 6:00 PM
 */
class Ex4_20_StringProcess {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String in = scanner.nextLine();

    System.out.println("String length: " + in.length());

    if (in.isEmpty())
      System.out.println("Provided string is empty");
    else
      System.out.println("Last character is '" +
              in.charAt(in.length() - 1) + "'");
  }
}
