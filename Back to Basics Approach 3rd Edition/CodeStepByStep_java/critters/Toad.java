package CodeStepByStep_java.critters;

import java.awt.*;

/**
 * @author Alex Golub
 * @since 31-Mar-21 3:55 PM
 */
class Toad extends Critter {
  private int moves;

  public Toad() {
  }

  @Override
  public Color getColor() {
    return new Color(192, 128, 0);
  }

  @Override
  public Direction getMove() {
    moves++;
    return moves % 5 == 0 ? Direction.WEST : Direction.CENTER;
  }

  @Override
  public String toString() {
    return "T";
  }

  public static void main(String[] args) {
    Critter toad = new Toad();
    for (int i = 0; i < 10; i++) {
      System.out.print(toad.getMove() + ", ");
    }
  }
}
