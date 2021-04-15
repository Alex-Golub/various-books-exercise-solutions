package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final6/Minnow
 *
 * @author Alex Golub
 * @since 14-Apr-21 8:32 PM
 */
class Minnow extends Critter {
  private int cycleLength = 1;
  private int cycleStep = 0;

  public boolean eat() {
    cycleLength++;
    cycleStep = 0;
    return false;
  }

  public Direction getMove() {
    if (cycleStep == 0) {
      cycleStep++;
      return Direction.SOUTH;
    }

    if (cycleStep < cycleLength) {
      cycleStep++;
    } else {
      cycleStep = 0;
    }

    return cycleLength % 2 == 1 ? Direction.EAST : Direction.WEST;
  }
}
