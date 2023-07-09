package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * *7.22 (Count the number of vowels in a string)
 * *7.22 (Find the number of uppercase letters in a string)
 *
 * Count lowercase and uppercase vowels in a String
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 5:16 PM
 */
class Ex7_22_countVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    int vowels = countVowels(str);
    System.out.printf("Vowels count: %d vowel%s\n",
                      vowels, vowels == 1 ? "" : "s");

    int uppercaseLetters = countUpperCase(str);
    System.out.printf("Uppercase letters count: %d uppercase letter%s\n",
                      uppercaseLetters, uppercaseLetters == 1 ? "" : "s");
  }

  private static int countUpperCase(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c >= 'A' && c <= 'Z')
        count++;
    }

    return count;
  }

  private static int countVowels(String str) {
    String vowels = "aeiouAEIOU";
    int    count  = 0;
    for (char ch : str.toCharArray())
      if (vowels.contains(ch + ""))
        count++;

    return count;
  }
}
