package chapter6_file_processing;

import java.util.Scanner;

/**
 * 15. Write a method called coinFlip that accepts a
 * Scanner representing an input file of coin flips
 * that are heads (H) or tails (T).
 * Consider each line to be a separate set of coin
 * flips and output the number and percentage of heads in that line.
 * If it is more than 50%, print “You win!”.
 *
 * @author Mr.Dr.Professor
 * @since 03-Jan-21 11:32 PM
 */
class Ex6_15_coinFlip {
  public static void main(String[] args) {
    String test = "H T H H T\n" +
                  "T t t T h H\n" +
                  "    h";
    coinFlip(new Scanner(test));
  }

  public static void coinFlip(Scanner input) {
    while (input.hasNextLine()) {
      int     totalFlips  = 0;
      int     heads       = 0;
      Scanner tokenReader = new Scanner(input.nextLine());

      while (tokenReader.hasNext()) {
        if (tokenReader.next().equalsIgnoreCase("h"))
          heads++;
        totalFlips++;
      }

      summary(totalFlips, heads);
    }
  }

  private static void summary(int totalFlips, int heads) {
    double headsAverage = 100.0 * heads / totalFlips;
    System.out.printf("%d heads (%.1f%%)\n", heads, headsAverage);
    if (headsAverage > 50.0)
      System.out.println("You win!");
    System.out.println();
  }
}
