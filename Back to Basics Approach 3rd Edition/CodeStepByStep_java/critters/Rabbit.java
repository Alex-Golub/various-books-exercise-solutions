package CodeStepByStep_java.critters;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Rabbit
 *
 * @author Alex Golub
 * @since 31-Mar-21 2:36 PM
 */
class Rabbit extends Critter {
  private boolean eating;
  private int moves;

  public Rabbit() {
    moves = -1; // zero based
  }

  @Override
  public Color getColor() {
    return Color.DARK_GRAY;
  }

  /** alternates between true and false (true, false, true, ...) */
  @Override
  public boolean eat() {
    return eating = !eating;
  }

  /**
   * if opponent is a Bird or Vulture, then scratch; otherwise, roar
   * Bird and Vulture toString are "^" ">" "V" "<"
   */
  @Override
  public Attack fight(String opponent) {
    return "^>V<".contains(opponent)
           ? Attack.SCRATCH : Attack.ROAR;
  }

  /**
   * hops in an L-shaped pattern:
   * first north twice, then south twice, then east twice, and repeat
   * ↑↑ (0, 1)
   * ↓↓ (2, 3)
   * →→ (4, 5)
   * ...
   */
  @Override
  public Direction getMove() {
    moves++;
    moves %= 6;
    if (moves <= 1) return Direction.NORTH;
    if (moves <= 3) return Direction.SOUTH;

    return Direction.EAST;
  }

  @Override
  public String toString() {
    return "V";
  }

  public static void main(String[] args) {
    Critter rabbit = new Rabbit();
    System.out.println(rabbit.fight("fasd"));
  }
}
