package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final5/Shark
 *
 * @author Alex Golub
 * @since 13-Apr-21 10:37 PM
 */
class Shark extends Critter {
  private int moves = 0;
  private int max = 1;
  private boolean north = true;

  @Override
  public Direction getMove() {
    if (moves == max) {
      max++;
      moves = 0;
      north = !north;
    }

    moves++;
    return north ? Direction.NORTH : Direction.SOUTH;
  }
}
