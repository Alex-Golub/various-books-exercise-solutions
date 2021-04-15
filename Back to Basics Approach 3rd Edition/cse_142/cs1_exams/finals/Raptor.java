package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Raptor
 * food (represented by the period character, ".")
 *
 * @author Alex Golub
 * @since 01-Apr-21 12:27 PM
 */
class Raptor extends Critter {
  private boolean east;
  private int stompCount;

  public Raptor(boolean startEast) {
    east = startEast;
  }

  @Override
  public boolean eat() {
    stompCount = 20;
    east = !east;
    return true;
  }

  /**
   * The Raptor should remember this value and should continue walking in
   * that direction until he finds food.
   * If a Raptor finds food, he should eat it, and then "stomp" up and
   * down 10 times by moving north-south 10 times.
   * In other words, his next twenty moves after finding food should
   * be N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S.
   *
   * After finishing his ten "stomps" the Raptor should resume moving
   * horizontally, but reverse the direction from west to east or vice versa.
   *
   */
  @Override
  public Direction getMove() {
    if (stompCount > 0) {
      return stompCount-- % 2 == 0 ? Direction.NORTH : Direction.SOUTH;
    }

    return east ? Direction.EAST : Direction.WEST;
  }
}
