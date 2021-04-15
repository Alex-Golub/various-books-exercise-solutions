package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Dragonfly
 *
 * The simulation world also contains food
 * (represented by the period character, ".")
 *
 * @author Alex Golub
 * @since 31-Mar-21 5:25 PM
 */
class Dragonfly extends Critter {
  private int moves;
  private int right;
  private int maxRight;
  private boolean up;

  public Dragonfly() {
    moves = 0;
    right = 0;
    maxRight = 1;
    up = false;
  }

  @Override
  public boolean eat() {
    maxRight++;
    return true;
  }

  /**
   * If the Dragonfly has never eaten: N, E, S, E, and repeat
   * If the Dragonfly has eaten once:  N, E, E, S, E, E, and repeat.
   * If the Dragonfly has eaten twice: N, E, E, E, S, E, E, E, and repeat.
   * ...
   */
  @Override
  public Direction getMove() {
    moves++;
    if (right > 0) {
      right--;
      return Direction.EAST;
    }

    right = maxRight;
    up = !up;

    return up ? Direction.NORTH : Direction.SOUTH;
  }

  public static void main(String[] args) {
    Critter dragonFly = new Dragonfly();
    dragonFly.eat();
    for (int i = 0; i <= 10; i++) {
      System.out.println(dragonFly.getMove());
    }
  }
}
