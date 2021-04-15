package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final2/Bumblebee
 *
 * A Bumblebee object should move in a "spiral" pattern from W to S to E to N,
 * lengthening each time:
 *
 * one step west
 * two steps south
 * three steps east
 * four steps north
 * five steps west
 * six steps south
 * seven steps east
 * eight steps north
 * nine steps west
 * ...
 *
 * @author Alex Golub
 * @since 12-Apr-21 7:38 PM
 */
class Bumblebee extends Critter {
  private int steps;
  private int max;
  private int direction; // 0 = west, 1 = south, 2 = east, 3 = north

  public Bumblebee() {
    steps = 0;
    max = 1;
    direction = 0;
  }

  public Direction getMove() {
    steps++;
    if (steps > max) {
      steps = 1;
      max++;
      direction = (direction + 1) % 4;
    }

    return direction == 0 ? Direction.WEST :
           direction == 1 ? Direction.SOUTH :
           direction == 2 ? Direction.EAST :
           Direction.NORTH;
  }
}
