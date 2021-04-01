package CodeStepByStep_java.critters;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Elephant
 *
 * @author Alex Golub
 * @since 31-Mar-21 4:02 PM
 */
class Elephant extends Critter {
  private final Attack attack;
  private final boolean hungry;

  /**
   * (attack will be one of Attack.ROAR, Attack.POUNCE, or Attack.SCRATCH)
   * upon birth, decides either to always eat (true) or never eat (false)
   * throughout its lifetime
   */
  public Elephant(Attack attack) {
    this.attack = attack;
    hungry = Math.random() < 0.5;
  }

  @Override
  public boolean eat() {
    return hungry;
  }

  @Override
  public Color getColor() {
    return Color.GRAY;
  }

  @Override
  public Attack fight(String opponent) {
    return attack;
  }

  /**
   * prefers to move WEST if it is not in the horizontal center of the world;
   * otherwise, prefers NORTH if it is not in the vertical center of the world;
   * but will not move onto a square occupied by another Elephant
   */
  @Override
  public Direction getMove() {
    int horizontalCenter = getWidth() / 2;
    int verticalCenter = getHeight() / 2;

    if (getX() != horizontalCenter && !getNeighbor(Direction.WEST).equalsIgnoreCase("j")) {
      return Direction.WEST;
    }

    if (getY() != verticalCenter && !getNeighbor(Direction.NORTH).equalsIgnoreCase("j")) {
      return Direction.NORTH;
    }

    return Direction.CENTER;
  }

  /** "J" if this Elephant is hungry (if eat would return true); otherwise "j" */
  @Override
  public String toString() {
    return eat() ? "J" : "j";
  }
}
