package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 19. Write a method called leetSpeak that accepts two parameters:
 * 1. Scanner representing an input file, and
 * 2. PrintStream representing an output file.
 * Convert the input file’s text to “leet speak,”
 * where various letters are replaced by other letters/numbers,
 * and output the new text to the given output file.
 * Replace:
 * 1. "o" with "0",
 * 2. "l" (lowercase “L”) with "1" (the number one),
 * 3. "e" with "3",
 * 4. "a" with "4",
 * 5. "t" with "7",
 * 6. "s" at the end of a word with "Z".
 * Preserve the original line breaks from the input.
 * Also wrap each word of input in parentheses.
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 1:13 PM
 */
class Ex6_19_leetSpeak {
  public static void main(String[] args) throws FileNotFoundException {
    String input = "four score and\n" +
                   "seven years ago our\n" +
                   "\n" +
                   "fathers brought forth on this continent\n" +
                   "a new nation";
    leetSpeak(new Scanner(input), new PrintStream("leet.txt"));
  }

  public static void leetSpeak(Scanner input, PrintStream output) {
    while (input.hasNextLine()) {
      String line = input.nextLine();
      line = line.replace('o', '0')
              .replace('l', '1')
              .replace('e', '3')
              .replace('a', '4')
              .replace('t', '7');

      Scanner tokenReader = new Scanner(line);
      while (tokenReader.hasNext()) {
        String word = tokenReader.next();
        word = word.endsWith("s") ? word.substring(0, word.length() - 1) + 'Z' : word;
        output.print("(" + word + ")");
        if (tokenReader.hasNext())
          output.print(" ");
      }

      output.println();
    }
  }
}
