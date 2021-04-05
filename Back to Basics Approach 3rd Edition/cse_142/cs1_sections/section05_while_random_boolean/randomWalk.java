package cse_142.cs1_sections.section05_while_random_boolean;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/3812?categoryid=302
 *
 * @author Alex Golub
 * @since 01-Apr-21 7:28 PM
 */
class randomWalk {
  public static void main(String[] args) {
    randomWalk();
  }

  public static void randomWalk() {
    int position = 0;
    int maxPosition = 0;
    Random rnd = new Random();

    System.out.println("position = " + position);
    while (Math.abs(position) != 3) {
      position += rnd.nextBoolean() ? -1 : 1;
      System.out.println("position = " + position);

      maxPosition = Math.max(maxPosition, position);
    }

    System.out.println("max position = " + maxPosition);
  }
}
