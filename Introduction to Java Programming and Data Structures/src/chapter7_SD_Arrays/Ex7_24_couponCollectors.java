package chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * **7.24 (Simulation: coupon collector’s problem)
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 6:33 PM
 */
class Ex7_24_couponCollectors {
  static final String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
  static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                                 "10", "Jack", "Queen", "King"};

  public static void main(String[] args) {
    int[]     deck          = IntStream.range(0, 52).toArray();
    boolean[] seen          = new boolean[4]; // track suit we've already seen
    int       numberOfPicks = 0;
    int       distinct      = 0;

    shuffle(deck);

    while (distinct < seen.length) {
      int card = deck[(int) (Math.random() * deck.length)];

      if (!seen[card / 13]) { // max number of cards 52 so, 52/13 <= 3
        distinct++;
        seen[card / 13] = true;

        String rank = ranks[card % 13];
        String suit = suits[card / 13];
        System.out.println(rank + " of " + suit);
      }

      numberOfPicks++;
    }

    System.out.println("Number of picks: " + numberOfPicks);
  }

  private static void shuffle(int[] deck) {
    for (int i = 0; i < deck.length; i++) {
      int rand = (int) (Math.random() * deck.length);

      int temp = deck[i];
      deck[i] = deck[rand];
      deck[rand] = temp;
    }
  }
}
