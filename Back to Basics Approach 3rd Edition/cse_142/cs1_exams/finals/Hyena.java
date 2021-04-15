package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final7/Hyena
 *
 * @author Alex Golub
 * @since 14-Apr-21 11:30 PM
 */
class Hyena extends Critter {
  private int moves = 0;
  private int width = 1;

  public boolean eat() {
    moves = 0;
    width++;
    return true;
  }

  @Override
  public Direction getMove() {
    moves++;
    if (moves > 2 * width + 2) {
      moves = 1;
      width++;
    }

    return moves == 1 ? Direction.NORTH :
           moves <= width + 1 ? Direction.EAST :
           moves == width + 2 ? Direction.SOUTH : Direction.WEST;
  }
}
