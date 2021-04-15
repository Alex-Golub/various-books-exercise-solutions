package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final4/Crab
 *
 * @author Alex Golub
 * @since 13-Apr-21 9:25 PM
 */
class Crab extends Critter {
  private int max = 1;
  private int moves = 0;
  private boolean wider = true;

  public Direction getMove() {
    if (moves == max) {
      moves = 0;

      if (wider) {
        max++;
      } else {
        max--;
      }

      if (max == 8 || max == 1) {
        wider = !wider;
      }
    }

    moves++;
    return max % 2 == 0 ? Direction.EAST : Direction.WEST;
  }
}
