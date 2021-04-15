package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final9/countCoins
 *
 * "pennies" (1 cent each),
 * "nickels" (5 cents each),
 * "dimes" (10 cents each),
 * or "quarters" (25 cents each)
 *
 * @author Alex Golub
 * @since 15-Apr-21 2:14 PM
 */
class countCoins {
  public static void main(String[] args) {
    String data = "3 pennies 2 quarters 1 pennies 3 nickels 4 dimes";
    countCoins(new Scanner(data));

    data = "12   QUARTERS      1   Pennies      33 \n" +
           "PeNnIeS      \n" +
           "\n" +
           "  10    niCKELs";
    countCoins(new Scanner(data));
  }

  public static void countCoins(Scanner data) {
    int totalCents = 0;
    while (data.hasNext()) {
      // assert: input has an even number of tokens
      int cashValue = data.nextInt();
      String type = data.next();

      switch (type.toLowerCase()) {
        case "pennies": totalCents += cashValue; break;
        case "nickels": totalCents += 5 * cashValue; break;
        case "dimes": totalCents += 10 * cashValue; break;
        case "quarters": totalCents += 25 * cashValue; break;
      }
    }

    System.out.printf("Total money: $%.2f", totalCents / 100.0);
  }
}
