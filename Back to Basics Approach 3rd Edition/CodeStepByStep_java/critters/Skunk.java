package CodeStepByStep_java.critters;

/**
 * https://www.codestepbystep.com/problem/view/java/critters/Skunk
 *
 * The following Critter class named Skunk is an attempt to make a critter
 * that goes W, W, N and repeats, unless he eats food, in which case he will
 * start going W, W, S and repeats.
 *
 * @author Alex Golub
 * @since 31-Mar-21 1:55 PM
 */
class Skunk extends Critter {
  private int moves;
  private boolean hungry;

  public Skunk() {
    hungry = false;
  }

  public boolean eat() {
    return hungry = true;
  }

  /***
   * moves   |   direction
   * 0           none
   * 1           WEST
   * 2           WEST
   * 3           NORTH (if hungry) | SOUTH
   * 4 -> 1      WEST
   * 2           WEST
   * 3           NORTH (if hungry) | SOUTH
   * ...
   */
  @Override
  public Direction getMove() {
    moves++;
    if (moves > 3) {
      moves = 1;
    }

    if (moves <= 2) {
      return Direction.WEST;
    }

    return hungry ? Direction.SOUTH : Direction.NORTH;
  }
}
