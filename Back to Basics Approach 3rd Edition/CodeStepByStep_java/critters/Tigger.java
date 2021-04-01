package CodeStepByStep_java.critters;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Tigger
 *
 * @author Alex Golub
 * @since 01-Apr-21 1:06 PM
 */
class Tigger extends Critter {
  private int moves;
  private int max;
  private final int initialMax;

  public Tigger(int initialMax) {
    this.initialMax = initialMax;
    max = initialMax;
    moves = 0;
  }

  /**
   * When a Tigger finds food, he eats it and completely starts over his
   * bouncing behavior.
   * That is, he starts over going NORTH on a bounce whose height is equal
   * to the initial bounce height with which the Tigger was constructed.
   */
  @Override
  public boolean eat() {
    max = initialMax; // reset movement
    moves = 0;
    return true;
  }

  /**
   * Whatever bounce height is passed, he will move that many steps NORTH,
   * then that many steps SOUTH, then repeat for a bounce height 1 larger
   */
  @Override
  public Direction getMove() {
    moves++;
    if (moves > 2 * max) { // reached bottom of bounce; start next bounce
      moves = 1;
      max++;
    }

    return moves <= max ? Direction.NORTH : Direction.SOUTH;
  }
}
