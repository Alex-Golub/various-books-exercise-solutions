package CodeStepByStep_java.critters;

import java.awt.*;
import java.util.Random;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Snake
 *
 * @author Alex Golub
 * @since 31-Mar-21 12:55 PM
 */
class Snake extends Critter {
  private final static Random RANDOM = new Random();
  private int horizontalMoves; // this pass horizontal moves
  private int stepsTakenSoFar;
  private final Color color;

  Snake() {
    color = new Color(20, 50, 128);
    horizontalMoves = 1;
    stepsTakenSoFar = 0;
  }

  @Override
  public Color getColor() {
    return color;
  }

  /** randomly choose to pounce or roar each time */
  @Override
  public Attack fight(String opponent) {
    return RANDOM.nextBoolean() ? Attack.POUNCE : Attack.ROAR;
  }

  /**
   * zig-zags down the map in the following pattern:
   * east once, south once,
   * west twice, south once,
   * east three times, south once,
   * west four times, south once,
   * east five times, south once,
   * →↓      1 (odd horizontal moves go EAST)
   * ↓←←     2 (even horizontal moves go WEST)
   * →→→↓    3
   * ↓←←←←   4
   * →→→→→   5
   */
  @Override
  public Direction getMove() {
    stepsTakenSoFar++;
    if (stepsTakenSoFar > horizontalMoves) {
      // Snake can't go horizontally anymore, go south and reset steps
      stepsTakenSoFar = 0;
      horizontalMoves++;
      return Direction.SOUTH;
    }

    return horizontalMoves % 2 == 0 ? Direction.WEST : Direction.EAST;
  }

  @Override
  public String toString() {
    return "S";
  }
}