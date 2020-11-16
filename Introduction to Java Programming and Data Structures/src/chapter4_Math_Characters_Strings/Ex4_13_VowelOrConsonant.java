package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.13 (Vowel or consonant?)
 * Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant.
 * For a nonletter input, display invalid input.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 3:23 PM
 */
class Ex4_13_VowelOrConsonant {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a letter: ");
      String letter = scanner.next();

      if (!Character.isLetter(letter.charAt(0))) {
        System.out.println("'" + letter + "' is an invalid input");
        continue;
      }

      if ("aeiouAEIOU".contains(letter))
        System.out.println("'" + letter + "' is a vowel");
      else
        System.out.println("'" + letter + "' is a consonant");
    }
  }
}
