package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.9 (Find the Unicode of a character)
 * Write a program that receives a character and
 * displays its Unicode.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 2:16 PM
 */
class Ex4_9_UnicodeOfChar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String ch = scanner.next();
    System.out.printf("The Unicode for the character %s is %d\n",
            ch, (int) ch.charAt(0));
  }
}
