package CodeStepByStep_java.critters;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Abby
 * https://www.martystepp.com/critters/critters.pdf
 *
 * @author Alex Golub
 * @since 01-Apr-21 1:52 PM
 */
class Abby extends Critter {
  private int moves;
  private int food;

  /**
   * Eating: When an Abby finds food, she eats it.
   * Eating causes Abby to slow down for a while, so that her next
   * 3 regular moves are each preceded by a single turn without moving,
   * indicated by a move of Direction.CENTER.
   * E, E, E, E, N, W, W (eats), C, W, C, W, C, N, E, E, E, E, N (eats), C, W, C, W, C, W, W, N, ...
   */
  @Override
  public boolean eat() {
    food = 6;
    return true;
  }

  /**
   * Movement: An Abby object generally moves in an upward zigzag pattern,
   * going east four times, north once, west four times, north once,
   * and repeating:
   * E, E, E, E, N, W, W, W, W, N, E, E, E, E, N, W, W, W, W, N, ...
   */
  @Override
  public Direction getMove() {
    if (food > 0) {
      food--;

      if (food % 2 == 1) {
        return Direction.CENTER;
      }
    }

    moves = moves % 10 + 1;
    if (moves <= 4) {
      return Direction.EAST;
    } else if (moves == 5 || moves == 10) {
      return Direction.NORTH;
    } else {
      return Direction.WEST;
    }
  }

  @Override
  public String toString() {
    return "@";
  }
}
