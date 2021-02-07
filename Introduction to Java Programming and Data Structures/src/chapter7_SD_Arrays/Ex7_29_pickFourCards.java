package chapter7_SD_Arrays;

import java.util.Arrays;

/**
 * **7.29 (Game: pick four cards)
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 6:45 PM
 */
class Ex7_29_pickFourCards {
  public static void main(String[] args) {
    final int TARGET_SUM = 24;

    int[] deck       = new int[52];
    int   totalPicks = 0;
    do {
      Arrays.fill(deck, 0);
      pickRandomFour(deck);

      totalPicks += 4;
    } while (sum(deck) != TARGET_SUM);

    System.out.printf("Sum is %d after %d random picks\n",
                      TARGET_SUM, totalPicks);

  }

  private static int sum(int[] deck) {
    int sum = 0;
    for (int i = 0; i < deck.length; i++)
      if (deck[i] > 0)
        sum += (i + 1) % 13; // extract rank
    return sum;
  }

  private static void pickRandomFour(int[] deck) {
    for (int i = 0; i < 4; i++)
      deck[(int) (Math.random() * deck.length)]++;
  }
}
