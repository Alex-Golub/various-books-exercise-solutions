package cse_142.cs1_exams.finals;

import CodeStepByStep_java.critters.Critter;
import CodeStepByStep_java.critters.Direction;

import java.awt.*;
import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final1/Ostrich
 *
 * @author Alex Golub
 * @since 12-Apr-21 6:13 PM
 */
class Ostrich extends Critter {
  private Random rand;
  private int steps;
  private boolean east;
  private boolean hiding;

  public Ostrich() {
    rand = new Random();
    hiding = true;
    steps = 0;
    east = rand.nextBoolean(); // true = east, false = west
  }

  public Color getColor() {
    return hiding ? Color.CYAN : Color.WHITE;
  }

  public Direction getMove() {
    if (steps == 10) {
      steps = 0; // Pick a new direction and re-set the steps counter
      hiding = !hiding;
      east = rand.nextBoolean();
    }

    steps++;
    return hiding ? Direction.CENTER :
           east ? Direction.EAST : Direction.WEST;
  }
}
