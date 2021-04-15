package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final6/blackjack
 *
 * A Blackjack hand's point value is the sum of its cards' point values.
 * A card's point value comes from its rank; the suit is irrelevant.
 *
 * Rank	                          Point Value
 * 2-10	                          The card's rank (for example, a 7 is worth 7 points)
 * Jack (J), Queen (Q), King (K)	10 points each
 * Ace (A)	                      11 points (for this problem; simplified compared to real Blackjack)
 *
 * @author Alex Golub
 * @since 14-Apr-21 8:00 PM
 */
class blackjack {
  public static void main(String[] args) {
    String data = "2 Hearts\n" +
                  "  j SPADES   a  Diamonds\n" +
                  "2 ClUbS\n" +
                  "   A\n" +
                  "hearts";
    System.out.println(blackjack(new Scanner(data)));
  }

  public static int blackjack(Scanner hand) {
    int pointValue = 0;
    while (hand.hasNextLine()) {
      String line = hand.nextLine();

      Scanner tokenReader = new Scanner(line);
      while (tokenReader.hasNext()) {
        String token = tokenReader.next().toLowerCase();

        if ("jqk".contains(token))
          pointValue += 10;
        else if (token.equalsIgnoreCase("a"))
          pointValue += 11;
        else if (token.length() <= 2)
          pointValue += Integer.parseInt(token);
      }
    }

    return pointValue;
  }
}
