package CodeStepByStep_java.critters;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Ostrich
 *
 * @author Alex Golub
 * @since 31-Mar-21 4:22 PM
 */
class Ostrich extends Critter {
  private Color color;
  private int moves;
  private Direction direction;

  public Ostrich() {
    color = Color.CYAN;
    direction = Direction.CENTER;
  }

  @Override
  public Color getColor() {
    return color;
  }

  /**
   * An Ostrich object first stays in the same place for 10 moves,
   * then moves 10 steps to either the west or the east, then repeats.
   * Whenever an Ostrich is moving its color should be white (Color.WHITE).
   * 1 2 3 4 5 6 7 8 9 10 (change direction)
   * 1 2 3 4 5 6 7 8 9 10 (stay in CENTER)
   */
  @Override
  public Direction getMove() {
    moves++;

    if (moves % 11 == 0) {
      if (direction.equals(Direction.CENTER)) {
        direction = Math.random() < 0.5 ? Direction.WEST : Direction.EAST;
        color = Color.WHITE;
      } else {
        direction = Direction.CENTER;
        color = Color.CYAN;
      }

      moves = 1; // after 10 moves reset to 1
    }

    return direction;
  }

  public static void main(String[] args) {
    Critter ostrich = new Ostrich();
    for (int i = 0; i <= 30; i++) {
      System.out.println("step #" + i + ": " + ostrich.getMove());
    }
  }
}
