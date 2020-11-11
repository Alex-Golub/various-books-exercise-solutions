package chapter2_objects;

import java.awt.*;

/**
 * • E2.5
 * Write a program that constructs a rectangle with area 42 and a
 * rectangle with perimeter 42.
 * Print the widths and heights of both rectangles.
 *
 * Created by ag on 08-Nov-20 1:10 PM
 */
class Ex2_5 {
  public static void main(String[] args) {
    Rectangle box1 = new Rectangle(0, 0, 7, 6);

    // 42 = 2 * (w + h) = 2 * 21 => w + h = 21 = 11 + 10
    Rectangle box2 = new Rectangle(8, 6, 11, 10);

    System.out.printf(
            "box1: w = %.2f, h = %.2f\nbox2: w = %.2f, h = %.2f",
            box1.getWidth(), box1.getHeight(),
            box2.getWidth(), box2.getHeight()
    );
  }
}
