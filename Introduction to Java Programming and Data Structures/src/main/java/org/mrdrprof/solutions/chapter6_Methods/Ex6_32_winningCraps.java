package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Random;

/**
 * **6.32 (Game: chance of winning at craps)
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 10:02 PM
 */
class Ex6_32_winningCraps {
  static Random dice = new Random();

  public static void main(String[] args) {
    final int TRIALS   = 1_000_000;
    int       winCount = 0;

    for (int t = 1; t <= TRIALS; t++) {
      winCount += play() ? 1 : 0;
    }

    System.out.println("Total wins from " + TRIALS + " games is " + winCount);
    System.out.println("You chance to win crap game is " + 100 * winCount / TRIALS + "%");
  }

  public static boolean play() {
    int prevRoll = 0;

    int roll1   = roll(dice);
    int roll2   = roll(dice);
    int rollSum = roll1 + roll2;

    if (rollSum == 2 || rollSum == 3 || rollSum == 12) {
      return false;
    }

    if (rollSum == 7 || rollSum == 11) {
      return true;
    }

    prevRoll = rollSum;

    while (true) {
      roll1 = roll(dice);
      roll2 = roll(dice);
      rollSum = roll1 + roll2;

      if (rollSum == 7) {
        return false;

      }

      if (prevRoll == rollSum) {
        return true;
      }

      prevRoll = rollSum;
    }

  }

  private static int roll(Random dice) {

    return dice.nextInt(6) + 1;
  }
}
