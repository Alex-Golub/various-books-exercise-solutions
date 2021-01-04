package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 11. Modify the preceding wordWrap method so that it only
 * wraps whole words, never chopping a word in half.
 * Assume that a word is any whitespace-separated token and
 * that all words are under 60 characters in length.
 *
 * @author Mr.Dr.Professor
 * @since 30-Dec-20 12:24 PM
 */
class Ex6_11_wordWrap3 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(new File("input.txt"));
    wordWrap3(input);
  }

  // while line length > WRAP_AT
  // if whitespace:
  //      print line[0, WRAP_AT)
  //      get next part of line from [WRAP_AT + 1, end]
  // else non-whitespace:
  //      consider the part of substring which is 60 character length
  //      find first index from end that is a whitespace
  //      print substring from [0, index)
  //      get next part of line from [index + 1..end]
  // print the string that has been left
  public static void wordWrap3(Scanner input) {
    final int WRAP_AT = 60;
    while (input.hasNextLine()) {
      String line = input.nextLine();

      while (line.length() > WRAP_AT) {
        if (line.charAt(WRAP_AT) == ' ') {
          System.out.println(line.substring(0, WRAP_AT));
          line = line.substring(WRAP_AT + 1);
        } else {
          int whitespace = line.substring(0, WRAP_AT).lastIndexOf(" ");
          System.out.println(line.substring(0, whitespace));
          line = line.substring(whitespace + 1);
        }
      }
      System.out.println(line);
    }
  }
}
