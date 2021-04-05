package cse_142.cs1_sections.section05_midterm_practice;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section5.5/spinWheel
 *
 * Simulates the spinning of a wheel until the number
 * 20 comes up n times in a row.
 *
 * spins: 20, 60, 50, 20, 20
 * 2 in a row after 5 spins
 *
 * spins: 40, 20, 20
 * 2 in a row after 3 spins
 *
 * @author Alex Golub
 * @since 04-Apr-21 9:59 AM
 */
class spinWheel {
  public static void main(String[] args) {
    spinWheel(new Random(), 2);
  }

  // pre: n >= 1, random != null
  public static void spinWheel(Random random, int n) {
    int spin = 10 * (random.nextInt(5) + 2);
    System.out.print("spins: " + spin);
    int occurrencesSoFar = spin == 20 ? 1 : 0;
    int totalSpins = 1;

    while (occurrencesSoFar < n) {
      spin = 10 * (random.nextInt(5) + 2); // 20, 30, 40, 50, 60
      totalSpins++;

      if (spin == 20) {
        occurrencesSoFar++;
      } else {
        occurrencesSoFar = 0; // reset count of 20 to 0
      }

      System.out.print(", " + spin);
    }

    System.out.println("\n" + n + " in a row after " + totalSpins + " spins");
  }
}
