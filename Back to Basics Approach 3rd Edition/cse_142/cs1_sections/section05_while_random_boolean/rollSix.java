package cse_142.cs1_sections.section05_while_random_boolean;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section5/rollSix
 *
 * Rolled: 3
 * Rolled: 1
 * Rolled: 6
 * You got a six in 3 turns!
 *
 * @author Alex Golub
 * @since 01-Apr-21 7:24 PM
 */
class rollSix {
  public static void main(String[] args) {
    rollSix();
  }

  public static void rollSix() {
    Random random = new Random();
    int trials = 0;
    int roll = 0;
    while (roll != 6) {
      trials++;
      roll = random.nextInt(6) + 1;
      System.out.println("Rolled: " + roll);
    }

    System.out.println("You got a six in " + trials + " turns!");
  }
}
