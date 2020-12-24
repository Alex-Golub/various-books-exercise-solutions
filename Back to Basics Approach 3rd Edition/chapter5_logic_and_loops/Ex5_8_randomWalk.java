package chapter5_logic_and_loops;

import java.util.Random;

/**
 * 8. Write a method called randomWalk that performs
 * steps of a random one-dimensional walk.
 * The random walk should begin at position 0.
 * On each step, you should either increase or decrease
 * the position by 1 (each with equal probability).
 * Your code should continue making steps until a
 * position of 3 or -3 is reached, and then report the maximum
 * position that was reached during the walk.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 11:34 AM
 */
class Ex5_8_randomWalk {
  public static void main(String[] args) {
    randomWalk();
  }

  public static void randomWalk() {
    int    position     = 0;
    int    max_position = 0;
    Random rnd          = new Random();

    System.out.println("position = " + position);
    while (Math.abs(position) != 3) {
      position += rnd.nextBoolean() ? -1 : 1;
      System.out.println("position = " + position);
      max_position = Math.max(position, max_position);
    }

    System.out.println("max position = " + max_position);
  }
}
