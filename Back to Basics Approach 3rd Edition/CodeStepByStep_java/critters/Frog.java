package CodeStepByStep_java.critters;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Frog
 *
 * @author Alex Golub
 * @since 31-Mar-21 3:45 PM
 */
class Frog extends Critter {
  private final int age;
  private int moves;

  /** The age passed should be between 1 and 9 inclusive. */
  public Frog(int age) {
    this.age = age < 1 ? 1 : Math.min(age, 9);
  }

  @Override
  public Color getColor() {
    return Color.GREEN;
  }

  /**
   * moves east sometimes, or stays put (center), based on the frog's age:
   * If the frog is 1 year old, moves to the east every move.
   * E, E, E, E, E, E, E, E, E, E, ...
   *
   * If the frog is 2 years old, moves to the east once every 2 moves.
   * C, E, C, E, C, E, C, E, C, E, ...
   *
   * If the frog is 3 years old, moves to the east once every 3 moves.
   * C, C, E, C, C, E, C, C, E, C, ...
   *
   * ...
   *
   * If the frog is 9 years old, moves to the east once every 9 moves.
   * C, C, C, C, C, C, C, C, E, C, ...
   */
  @Override
  public Direction getMove() {
    moves++;
    return moves % age == 0 ? Direction.EAST : Direction.CENTER;
  }

  @Override
  public String toString() {
    return "F";
  }

  public static void main(String[] args) {
    Critter frog = new Frog(9);

    System.out.print(frog.getMove());
    for (int i = 0; i <= 10; i++) {
      System.out.print(", " + frog.getMove());
    }
  }
}
