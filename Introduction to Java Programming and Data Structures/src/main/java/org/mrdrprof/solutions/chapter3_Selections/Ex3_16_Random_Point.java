package org.mrdrprof.solutions.chapter3_Selections;

/**
 * 3.16 (Random point)
 * Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centred at (0, 0) with width 50 and height 150.
 *
 * Created by ag on 26-Oct-20 7:48 PM
 */
class Ex3_16_Random_Point {
  public static void main (String[] args) {

    for (int trials = 0; trials < 100; trials++) {
      // x in range -25, 25
      // y in range -75 75
      int x = -25 + (int) (Math.random() * 51);  // -25 + [0, 50]  => [-25, 25]
      int y = -75 + (int) (Math.random() * 151); // -75 + [0, 150] => [-75, 75]
      System.out.printf("(%d, %d)\n", x, y);
    }
  }
}
