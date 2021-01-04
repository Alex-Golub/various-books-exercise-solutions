package chapter6_file_processing;

import java.util.Scanner;

/**
 * 17. Write a method called inputStats that accepts a
 * Scanner representing an input file and reports:
 * 1. the number of lines,
 * 2. the longest line,
 * 3. the number of tokens on each line, and
 * 4. the length of the longest token on each line.
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 1:04 AM
 */
class Ex6_17_inputStats {
  public static void main(String[] args) {
    String test = "Beware the Jabberwock, my son,\n" +
                  "the jaws that bite, the claws that catch,\n" +
                  "Beware the JubJub bird and shun\n" +
                  "the frumious bandersnatch.";
    inputStats(new Scanner(test));
  }

  public static void inputStats(Scanner input) {
    int    lines         = 0;
    String longestLine   = "";
    int    maxLineLength = 0;

    while (input.hasNextLine()) {
      String line = input.nextLine();
      lines++;

      if (line.length() > maxLineLength) {
        maxLineLength = line.length();
        longestLine = line;
      }

      int     lineTokens   = 0;
      int     longestToken = 0;
      Scanner tokenReader  = new Scanner(line);
      while (tokenReader.hasNext()) {
        lineTokens++;
        longestToken = Math.max(tokenReader.next().length(), longestToken);
      }

      System.out.printf("Line %d has %d tokens (longest = %d)\n",
              lines, lineTokens, longestToken);
    }

    System.out.println("Longest line: " + longestLine);
  }
}
