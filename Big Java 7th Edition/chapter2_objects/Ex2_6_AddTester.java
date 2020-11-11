package chapter2_objects;

import java.awt.*;

/**
 * •• Testing E2.6
 * Write a program AddTester that prints the expected and actual
 * location, width, and height of box after the call to add.
 *
 * Created by ag on 08-Nov-20 1:16 PM
 */
class Ex2_6_AddTester {
  public static void main(String[] args) {
    Rectangle box = new Rectangle(5, 10, 20, 30);
    System.out.println("box: " + box);

    // (newx, newy) are outside of box bounds
    // thus this rectangle will be "stretched" and its left-upper corner
    // will be this (newx, newy) point
    // height and width will grow proportionally
    box.add(0, 0);
    System.out.println("box: " + box);

    // (1, 1) contained within the box, no change
    box.add(1, 1);
    System.out.println("box: " + box);

    box.add(-1, -1);
    System.out.println("\nExpected: x = -1, y = -1, width = 26, height = 41");
    System.out.println("box: " + box);
  }
}
