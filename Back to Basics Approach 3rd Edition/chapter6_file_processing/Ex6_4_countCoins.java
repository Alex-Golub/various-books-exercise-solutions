package chapter6_file_processing;

import java.util.Scanner;

/**
 * 4. Write a method called countCoins that accepts a Scanner
 * representing an input file whose data is a series of pairs
 * of tokens, where each pair begins with an integer and is
 * followed by the type of coin, which will be
 * “pennies” (1 cent each),
 * “nickels” (5 cents each),
 * “dimes” (10 cents each), or
 * “quarters” (25 cents each), case-insensitively.
 * Add up the cash values of all the coins and print the total money.
 *
 * E.g.
 * f("3 pennies 2 quarters 1 pennies 3 nickels 4 dimes") => "Total money: $1.09"
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 10:44 PM
 */
class Ex6_4_countCoins {
  public static void main(String[] args) {
    String test = "12   QUARTERS      1   Pennies      33 \n" +
                  "PeNnIeS      \n" +
                  "\n" +
                  "  10    niCKELs";

    countCoins(new Scanner(test));
  }

  public static void countCoins(Scanner input) {
    double total = 0;

    while (input.hasNext()) {
      double value = input.nextDouble(); // integer is type of real number

      String type = input.next().toLowerCase();
      switch (type) {
        case "pennies":  value *= .01; break;
        case "nickels":  value *= .05; break;
        case "dimes":    value *= .10; break;
        case "quarters": value *= .25; break;
        default:
          throw new IllegalArgumentException("No such type as \"" + type + "\"");
      }

      total += value;
    }

    System.out.printf("Total money: $%.2f\n", total);
  }
}
