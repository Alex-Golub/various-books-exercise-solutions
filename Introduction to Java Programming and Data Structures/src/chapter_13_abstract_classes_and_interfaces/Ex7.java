package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_11.Rectangle;
import utils.chapter_11.Circle;
import utils.chapter_11.GeometricObject;
import utils.chapter_11.Triangle;
import utils.chapter_13.Colorable;
import utils.chapter_13.ComparableRectangle;
import utils.chapter_13.Square;

/**
 * *13.7 (The Colorable interface) Design an interface named Colorable with a void
 * method named howToColor(). Every class of a colorable object must implement the Colorable interface. Design a class named Square that extends
 * GeometricObject and implements Colorable. Implement howToColor to
 * display the message Color all four sides. The Square class contains a
 * data field side with getter and setter methods, and a constructor for constructing
 * a Square with a specified side. The Square class has a private double data field
 * named side with its getter and setter methods. It has a no-arg constructor to
 * create a Square with side 0, and another constructor that creates a Square with
 * the specified side.
 * Draw a UML diagram that involves Colorable, Square and GeometricObject.
 * Write a test program that creates an array of five GeometricObjects. For each object
 * in the array, display its area and invoke its howToColor method if it is colorable.
 *
 * @author Alex Golub
 * @since June 23, 2023 8:58 PM
 */
class Ex7 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = {
                new Circle(1.0),
                new Rectangle(1, 2),
                new ComparableRectangle(2, 3),
                new Square(4),
                new Triangle(3, 4, 5)
        };

        for (GeometricObject geometricObject : geometricObjects) {
            System.out.println(geometricObject);
            System.out.println("    Area: " + geometricObject.getArea());
            if (geometricObject instanceof Colorable colorable) {
                System.out.print("    Colorable: ");
                colorable.howToColor();
            }
            System.out.println();
        }
    }
}
