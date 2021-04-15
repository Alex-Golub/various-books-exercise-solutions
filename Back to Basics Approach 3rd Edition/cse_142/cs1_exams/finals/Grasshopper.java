package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Attack;
import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final13/Grasshopper
 *
 * @author Alex Golub
 * @since 15-Apr-21 10:58 PM
 */
class Grasshopper extends Critter {
  private int max = 0;
  private int move = 0;

  public Direction getMove() {
    if (move == 0) {
      return Direction.CENTER;
    }

    if (move <= max) {
      move++;
      return Direction.NORTH;
    }

    if (move <= 2 * max) {
      move++;
      return Direction.SOUTH;
    }

    move = 0;
    return Direction.WEST;

  }

  public Attack fight(String opponent) {
    if (move == 0) {
      move++;
      max++;
      return Attack.ROAR;
    }
    return Attack.FORFEIT;
  }
}
