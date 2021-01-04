package chapter6_file_processing;

import java.util.Scanner;

/**
 * 20. Write a method called pigLatin that accepts as a parameter
 * a Scanner representing an input file.
 * Your method should, preserving line breaks, print out the input
 * file's text in a simplified version of Pig Latin,
 * a silly English variant where the first letter of each word is
 * moved to the end.
 * Our rules for translating a word to Pig Latin are as follows:
 * 1. If the word starts with a vowel (a, e, i, o, or u),
 * append "yay". For example, "elephant" becomes "elephantyay".
 * 2. If the word starts with a consonant, move the consonant t
 * o the end, and append "ay". For example, "welcome" becomes "elcomeway".
 * You should also convert every word to lowercase.
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 1:50 PM
 */
class Ex6_20_pigLatin {
  public static void main(String[] args) {
    String test = "Shall I compare thee to\n" +
                  "a summer's day Thou art more\n" +
                  "lovely and more temperate";
    pigLatin(new Scanner(test));
  }

  public static void pigLatin(Scanner input) {
    String vowels = "aeiou";

    while (input.hasNextLine()) {
      String line = input.nextLine();

      Scanner tokenReader = new Scanner(line);
      while (tokenReader.hasNext()) {
        String word      = tokenReader.next().toLowerCase();
        char   firstChar = word.charAt(0);
        if (vowels.contains(firstChar + "")) {
          word += "yay";
        } else {
          word = word.substring(1) + firstChar + "ay";
        }

        System.out.print(word);
        if (tokenReader.hasNext())
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
