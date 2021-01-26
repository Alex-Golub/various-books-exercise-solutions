package chapter5_Loops;

import java.util.Scanner;

/**
 * *5.49 (Count vowels and consonants)
 * Displays the number of vowels and consonants in the string.
 *
 * @author Mr.Dr.Professor
 * @since 26-Jan-21 10:20 PM
 */
class Ex5_49_vowelAndConsonants {
  public static void main(String[] args) {
    final String VOWELS = "AEIOUaeiou";

    System.out.print("Enter a string: ");
    String str             = new Scanner(System.in).nextLine();
    int    vowelsCount     = 0;
    int    consonantsCount = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if (Character.isLetter(c)) { // valid english letters only
        if (VOWELS.contains(c + ""))
          vowelsCount++;
        else
          consonantsCount++;
      }
    }

    System.out.println("The number of vowels is " + vowelsCount);
    System.out.println("The number of consonants is " + consonantsCount);
  }
}
