package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * 4.22 (Check substring)
 * Write a program that prompts the user to enter two strings, and
 * reports whether the second string is a substring of the first string.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 6:27 PM
 */
class Ex4_22_Substring {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter string s1: ");
      String s1 = scanner.nextLine();
      System.out.print("Enter string s2: ");
      String s2 = scanner.nextLine();

      if (s1.contains(s2))
        System.out.println(s2 + " is a substring of " + s1);
      else
        System.out.println(s2 + " is not substring of " + s1);
    }
  }
}
