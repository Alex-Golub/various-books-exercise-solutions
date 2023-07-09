package org.mrdrprof.solutions.chapter7_SD_Arrays;

/**
 * *7.29 (Game: dice)
 * shows all possible permutations or configurations
 * of the three dice that yield the sum of nine.
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 6:24 PM
 */
class Ex7_29_diceGame {
  public static void main(String[] args) {
    final int SUM = 9;

    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i + j >= SUM)
          break;

        for (int k = 1; k <= 6; k++) {
          if (i + j + k > SUM)
            break;

          if (i + j + k == SUM)
            System.out.println(i + " " + j + " " + k + " = 9");
        }
      }
    }
  }
}
