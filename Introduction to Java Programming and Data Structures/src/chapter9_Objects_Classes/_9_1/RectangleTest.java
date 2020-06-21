package chapter9_Objects_Classes._9_1;

/**
 * 9.1 (The Rectangle class) Following the example of the Circle class in Section 9.2,
 * design a class named Rectangle to represent a rectangle.
 * The class contains:
 * ■■ Two double data fields named width and height that specify the width and
 * height of the rectangle. The default values are 1 for both width and height.
 * ■■ A no-arg constructor that creates a default rectangle.
 * ■■ A constructor that creates a rectangle with the specified width and height.
 * ■■ A method named getArea() that returns the area of this rectangle.
 * ■■ A method named getPerimeter() that returns the perimeter.
 *
 * Draw the UML diagram for the class then implement the class.
 *
 * Write a test program that creates two Rectangle objects—one with width 4 and height 40, and
 * the other with width 3.5 and height 35.9.
 * Display the width, height, area, and perimeter of each rectangle in this order
 *
 * Created by ag on 16-May-20 12:36 AM
 */
class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
                new Rectangle(4, 40),
                new Rectangle(3.5, 35.9)};

        System.out.printf("%-10s %-10s %-10s %-10s%n", "width", "height", "area", "perimeter");

        for (Rectangle r : rectangles) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-5.2f%n",
                    r.getWidth(), r.getHeight(), r.getArea(), r.getPerimeter());
        }
    }
}
