package chapter2_objects;

import java.awt.*;

/**
 * •• P2.1
 * Write a program called FourRectanglePrinter that constructs a Rectangle
 * object, prints its location by calling System.out.println(box), and then
 * translates and prints it three more times, so that, if the rectangles were
 * drawn, they would form one large rectangle.
 * Your program will not produce a drawing.
 * It will simply print the locations of the four rectangles.
 *
 * Created by ag on 08-Nov-20 5:34 PM
 */
class PP2_1_FourRectanglePrinter {
  public static void main(String[] args) {
    // Initial values
    int x = 4;
    int y = 4;
    int width = 8;
    int height = 8;

    // Clockwise box translation
    Rectangle box = new Rectangle(x, y, width, height);
    System.out.println("1st Box: " + box);

    box.translate(width, 0);
    System.out.println("2nd Box: " + box);

    box.translate(0, height);
    System.out.println("3rd Box: " + box);

    box.translate(-width, 0);
    System.out.println("4th Box: " + box);
  }
}
