package CodeStepByStep_java.critters;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Butterfly
 *
 * @author Alex Golub
 * @since 31-Mar-21 2:14 PM
 */
class Butterfly extends Critter {
  private int moves;
  private final Color color;

  public Butterfly() {
    color = Color.YELLOW;
    moves = -1; // zero based
  }

  @Override
  public Color getColor() {
    return color;
  }

  /** moves N, W, N, E, then repeats */
  @Override
  public Direction getMove() {
    moves++;
    moves %= 4;

    switch (moves) {
      case 1: return Direction.WEST;
      case 3: return Direction.EAST;
    }

    return Direction.NORTH;
  }

  /** alternates between "x" and "-" on each move */
  @Override
  public String toString() {
    return moves % 2 == 0 ? "-" : "x";
  }

  public static void main(String[] args) {
    Critter critter = new Butterfly();
    System.out.println(critter.getColor().equals(Color.YELLOW) + "\n");

    for (int i = 0; i < 10; i++) {
      System.out.println(critter.getMove().toString() + " " + critter);
      if ((i + 1) % 4 == 0) {
        System.out.println();
      }
    }
  }
}
