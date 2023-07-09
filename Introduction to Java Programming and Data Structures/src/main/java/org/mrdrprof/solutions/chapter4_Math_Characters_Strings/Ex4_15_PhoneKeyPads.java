package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.15 (Phone key pads)
 * Write a program that prompts the user to enter a lowercase or
 * uppercase letter and displays its corresponding number.
 * For a nonletter input, display invalid input.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 3:40 PM
 */
class Ex4_15_PhoneKeyPads {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a letter: ");
      char letter = scanner.next().toLowerCase().charAt(0);

      int number = -1;
      if (letter >= 'a' && letter <= 'o')      number = (letter - 'a') / 3 + 2;
      else if (letter >= 'p' && letter <= 's') number = 7;
      else if (letter >= 't' && letter <= 'v') number = 8;
      else if (letter >= 'w' && letter <= 'z') number = 9;

      if (number == -1)
        System.out.println("'" + letter + "' is an invalid input");
      else
        System.out.println("The corresponding number is " + number);
    }
  }
}
