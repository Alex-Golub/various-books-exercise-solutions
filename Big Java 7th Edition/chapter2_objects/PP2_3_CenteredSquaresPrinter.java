package chapter2_objects;

import java.awt.*;

/**
 * ••• P2.3
 * Write a CenteredSquaresPrinter program that constructs a Rectangle
 * object square representing a square with top-left corner (100, 100)
 * and side length 200, prints its location by calling System.out.
 * println(square), applies the grow and translate methods, and calls
 * System.out.println(square) again.
 * The calls to grow and translate should modify the square so that
 * it has half the width and is centered in the original square.
 *
 * @author Mr.Dr.Professor
 * @since 08-Nov-20 8:45 PM
 */
class PP2_3_CenteredSquaresPrinter {
  static final int TL_X     = 100; // experiment with different values
  static final int TL_Y     = 100;
  static final int SIDE_LEN = 20;

  public static void main(String[] args) {
    Rectangle box = new Rectangle(TL_X, TL_Y, SIDE_LEN, SIDE_LEN);
    System.out.println("Box: " + box);

    // New top-left point will be quarter of the SIDE_LEN
    // Where's the new SIDE_LEN will be added SIZE_LEN / 4 to each
    // left-right, up-down
    int quarterLength = SIDE_LEN / 4;
    box.grow(-quarterLength, -quarterLength);
    System.out.println("Box: " + box);
  }
}
