package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.8 (Find the character of an ASCII code)
 * Write a program that receives a character
 * and displays its ASCII code (an integer between 0 and 127).
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 2:00 PM
 */
class Ex4_8_AsciiCode {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String ch        = scanner.next();
    int    asciiCode = ch.charAt(0);
    if (asciiCode > 127)
      System.out.println("No ASCII Code for " + ch);
    else {
      System.out.printf("The ASCII code for character %s is %d\n",
              ch, asciiCode);
    }
  }
}
