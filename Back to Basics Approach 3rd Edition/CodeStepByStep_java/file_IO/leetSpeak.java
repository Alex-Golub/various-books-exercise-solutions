package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/leetSpeak
 *
 * Original character	                    'Leet' character
 *         o                                   0
 *         l (lowercase L)                     1
 *         e                                   3
 *         a                                   4
 *         t                                   7
 *         s (at the end of a word only)       Z
 *
 * four score and
 * seven years ago our
 *
 * fathers brought forth on this continent
 * a new nation
 *
 * (f0ur) (sc0r3) (4nd)
 * (s3v3n) (y34rZ) (4g0) (0ur)
 *
 * (f47h3rZ) (br0ugh7) (f0r7h) (0n) (7hiZ) (c0n7in3n7)
 * (4) (n3w) (n47i0n)
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 11:11 PM
 */
/*public*/ class leetSpeak {
  public static void main(String[] args) throws FileNotFoundException {
    leetSpeak("lincoln.txt", "leet.txt");
  }

  public static void leetSpeak(String in, String out) throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(in));
    PrintStream writer = new PrintStream(out);

    while (fileReader.hasNextLine()) {
      String line = fileReader.nextLine();
      Scanner tokenReader = new Scanner(line);

      while (tokenReader.hasNext()) {
        String token = tokenReader.next()
                .replace('o', '0')
                .replace('l', '1')
                .replace('e', '3')
                .replace('a', '4')
                .replace('t', '7');

        if (token.endsWith("s")) {
          token = token.substring(0, token.length() - 1) + "Z";
        }

        writer.printf("(%s)", token);
        if (tokenReader.hasNext()) {
          writer.print(" ");
        }
      }

      writer.println();
    }
  }
}
