package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final7/printDuplicates
 *
 * @author Alex Golub
 * @since 14-Apr-21 9:31 PM
 */
class printDuplicates {
  public static void main(String[] args) {
    String data = "hello how how are you you you you\n" +
                  "I I I am Jack's Jack's smirking smirking smirking smirking smirking revenge\n" +
                  "   bow  wow wow yippee yippee   yo yippee   yippee yay  yay yay\n" +
                  "one fish two fish red fish blue fish\n" +
                  "It's the Muppet Show, wakka wakka wakka";
    printDuplicates(new Scanner(data));
  }

  public static void printDuplicates(Scanner input) {
    while (input.hasNextLine()) {
      System.out.print(compactLine(input.nextLine()));
    }
  }

  private static String compactLine(String line) {
    int count = 1;
    Scanner tokenReader = new Scanner(line);
    StringBuilder res = new StringBuilder();
    String prevToken = "";

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
