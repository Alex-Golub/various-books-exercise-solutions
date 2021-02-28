package CodeStepByStep_java.parameters_and_return;

import java.util.Random;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/coinFlip
 *
 * Write a method named coinFlip that simulates repeatedly flipping a
 * two-sided coin until a particular side (Heads or Tails) comes up several
 * times consecutively (in a row).
 * Your method accepts two parameters, an integer k and a character side,
 * where side is expected to be 'H' for Heads or 'T' for Tails.
 * You should keep simulating the flipping of the coin until k occurrences
 * of the given side are seen consecutively.
 *
 * For example, if the call is coinFlip(3, 'H');
 * you should flip the coin until Heads is seen 3 times in a row.
 * Here is an example output from the call of coinFlip(4, 'T');
 *    T H T H T T H T T H H T H H H H H T T T T
 *    You got T 4 times in a row!
 *
 * If a negative k is passed, and/or a side value is passed that is
 * not 'H' or 'T', your method should print ERROR! and exit immediately.
 *
 * Use a Random object to give an equal chance to a head or a tail appearing.
 * Each time the coin is flipped, what is seen is displayed
 * (H for heads, T for tails), separated by spaces.
 * When k consecutive occurrences of the given side occur,
 * a congratulatory message is printed.
 * Match our output format exactly.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 3:33 PM
 */
/*public*/ class coinFlip {
  public static void main(String[] args) {
    coinFlip(4, 'T');
  }

  public static void coinFlip(int k, char face) {
    if (k < 0 || (face != 'H' && face != 'T')) {
      System.out.println("ERROR!");
      return;
    }

    Random random = new Random();
    int consecutiveTimesSeen = 0;
    while (consecutiveTimesSeen < k) {
      char flip = random.nextBoolean() ? 'H' : 'T';

      if (flip == face) {
        consecutiveTimesSeen++;
      } else {
        consecutiveTimesSeen = 0;
      }

      // fencepost
      System.out.print(flip);
      if (consecutiveTimesSeen < k) {
        System.out.print(" ");
      } else {
        System.out.println();
      }
    }

    System.out.println("You got " + face + " " + k + " times in a row!");
  }
}
