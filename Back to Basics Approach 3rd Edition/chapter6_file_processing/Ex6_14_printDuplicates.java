package chapter6_file_processing;

import java.util.Scanner;

/**
 * 14. Write a method called printDuplicates that takes as a
 * parameter a Scanner containing a series of lines.
 * Your method should examine each line looking for consecutive
 * occurrences of the same token on the same line and print
 * each duplicated token, along with the number of times that it
 * appears consecutively.
 * Non-repeated tokens are not printed.
 * NOTE: You may ignore the case of repetition across multiple lines
 * (such as if a line ends with a given token and the
 * next line starts with the same token).
 * You may assume that each line of the file contains
 * at least 1 token of input.
 *
 * @author Mr.Dr.Professor
 * @since 31-Dec-20 11:21 PM
 */
class Ex6_14_printDuplicates {
  public static void main(String[] args) {
    String test = "hello how how are you you you you\n" +
                  "I I I am Jack's Jack's smirking smirking smirking smirking revenge\n" +
                  "bow wow wow yippee yippee yo yippee yippee yay yay yay\n" +
                  "one fish two fish red fish blue fish\n" +
                  "It's the Muppet Show, wakka wakka wakka";
    printDuplicates(new Scanner(test));
  }

  public static void printDuplicates(Scanner input) {
    while (input.hasNextLine()) {
      System.out.print(compactLine(input.nextLine()));
    }
  }

  private static String compactLine(String line) {
    int           count       = 1;
    Scanner       tokenReader = new Scanner(line);
    StringBuilder res         = new StringBuilder();
    String        prevToken   = "";

    if (tokenReader.hasNext()) {
      prevToken = tokenReader.next();
      String currentToken;

      while (tokenReader.hasNext()) {
        currentToken = tokenReader.next();

        if (prevToken.equals(currentToken)) {
          count++;
        } else {
          if (count > 1) {
            res.append(prevToken).append("*").append(count);
            if (tokenReader.hasNext()) {
              res.append(" ");
            }
          }
          prevToken = currentToken;
          count = 1;
        }
      }
    }

    if (count > 1)
      res.append(prevToken).append("*").append(count);

    return res.append("\n").toString();
  }
}
