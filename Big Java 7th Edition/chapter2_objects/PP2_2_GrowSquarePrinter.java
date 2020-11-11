package chapter2_objects;

import java.awt.*;

/**
 * •• P2.2
 * Write a GrowSquarePrinter program that constructs a Rectangle
 * object square representing a square with top-left corner (100, 100)
 * and side length 50, prints its location by calling System.out.
 * println(square), applies the translate and grow methods, and calls
 * System.out.println(square) again.
 * The calls to translate and grow
 * should modify the square so that it has twice the size and the
 * same top-left corner as the original.
 *
 * Created by ag on 08-Nov-20 8:19 PM
 */
class PP2_2_GrowSquarePrinter {
  static final int TL_X  = 70; // experiment with different values
  static final int TL_Y  = 60;
  static final int S_LEN = 120;

  public static void main(String[] args) {
    Rectangle box = new Rectangle(TL_X, TL_Y, S_LEN, S_LEN);
    System.out.println("Box: " + box);

    // add S_LEN / 2 units both: left-right, up-down.
    // horizontal: 25 + 50 + 25 = 100
    // vertical: 25 + 50 + 25 = 100
    int growBy = S_LEN / 2;
    box.grow(growBy, growBy);

    // left-upper point has been translated
    // by S_LEN / 2 left in x-axis
    // and S_LEN / 2 up in y-axis.
    // bring back the left-upper point to same place
    // by translating the box the same growth value
    box.translate(growBy, growBy);
    System.out.println("Box: " + box);
  }
}
