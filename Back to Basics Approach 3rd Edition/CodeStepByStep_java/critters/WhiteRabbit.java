package CodeStepByStep_java.critters;

/**
 * @author Alex Golub
 * @since 31-Mar-21 3:34 PM
 */
class WhiteRabbit extends Rabbit {
  private int moves;

  public WhiteRabbit() {
    super();
    moves = -1; // zero based
  }

  /**
   * hops in an L-shaped pattern, in cycles of 5:
   * first north 5x, then south 5x, then east 5x, and repeat
   * ↑↑↑↑↑ (0,  1,  2,  3,  4)
   * ↓↓↓↓↓ (5,  6,  7,  8,  9)
   * →→→→→ (10, 11, 12, 13, 14)
   */
  @Override
  public Direction getMove() {
    moves++;
    moves %= 15;

    return moves <= 4 ? Direction.NORTH :
           moves <= 9 ? Direction.SOUTH :
           Direction.EAST;
  }
}
