package chapter2_objects;

import java.awt.*;

/**
 * ••• P2.4
 * The intersection method computes the intersection of two
 * rectangles—that is, the rectangle that would be formed by
 * two overlapping rectangles if they were drawn.
 * Write a program IntersectionPrinter that constructs two
 * rectangle objects, prints them as described in
 * Exercise •• P2.1, and then prints the
 * rectangle object that describes the intersection.
 * Then the program should print the result of the intersection
 * method when the rectangles do not overlap.
 *
 * @author Mr.Dr.Professor
 * @since 08-Nov-20 9:09 PM
 */
class PP2_4_IntersectionPrinter {
  public static void main(String[] args) {
    int x   = 50;
    int y   = 50;
    int len = 50;

    Rectangle box1 = new Rectangle(x, y, len, len);
    System.out.println("Box: " + box1);

    Rectangle box2 = new Rectangle(x + len, y, len, len);
    System.out.println("Box: " + box2);

    Rectangle box3 = new Rectangle(x + len, y + len, len, len);
    System.out.println("Box: " + box3);

    Rectangle box4 = new Rectangle(x, y + len, len, len);
    System.out.println("Box: " + box4);

    Rectangle intersection = box1
            .intersection(box2)
            .intersection(box3)
            .intersection(box4);

    // intersection is empty if the intersection rectangle do not
    // encloses any area i.e. it has no dimensions (w == 0 || h == 0)
    System.out.println("Intersecting rectangle: " +
            !intersection.isEmpty() + "=> box: " + intersection);

    // Translate box2 and check intersection rectangle with box1
    box2.translate(-10, -10);
    System.out.println("\nOverlap: " + box1.intersects(box2));
    System.out.println("Box1: " + box1);
    System.out.println("Box2: " + box2);
    System.out.println("Intersection triangle => " + box1.intersection(box2));
  }
}
