package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 13. Write a method called stripComments that accepts a Scanner
 * representing an input file containing a Java program
 * as its parameter, reads that file, and then prints the file’s
 * text with all comments removed. A comment is any text on a
 * line from // to the end of the line, and any text between
 * /* and * / characters.
 *
 * @author Mr.Dr.Professor
 * @since 31-Dec-20 9:41 PM
 */
class Ex6_13_stripComments {
  public static void main(String[] args) throws FileNotFoundException {
    stripComments(new Scanner(new File("code.txt")));
  }

  // possibilities
  // 1. //
  // 2. ... //
  // 3. ... /* ... */ ...
  // 4. /* ...
  //       ... */
  public static void stripComments(Scanner input) {
    while (input.hasNextLine()) {
      String line = input.nextLine();

      if (!line.startsWith("/*")) {
        if (!line.contains("/*") && line.endsWith("*/")) { // 4.
          line = "";
        } else if (line.contains("/*") && line.contains("*/")) { // 3.
          line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
        } else if (line.contains("//")) { // 1. and 2.
          line = line.substring(0, line.indexOf("//"));
        }

        System.out.println(line);
      }
    }
  }
}
