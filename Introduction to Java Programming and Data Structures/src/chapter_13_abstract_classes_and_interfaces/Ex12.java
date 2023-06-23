package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_11.Circle;
import utils.chapter_11.GeometricObject;
import utils.chapter_11.Rectangle;

import java.util.Arrays;

/**
 * *13.12 (Sum the areas of geometric objects) Write a method that sums the areas of all the
 * geometric objects in an array. The method signature is
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and two
 * rectangles) and computes their total area using the sumArea method.
 *
 * @author Alex Golub
 * @since June 26, 2023 7:16 PM
 */
class Ex12 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);
        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(3, 4);

        double sumArea = sumArea(new GeometricObject[] { c1, c2, r1, r2 });
        System.out.println("sumArea = " + sumArea);
    }

    public static double sumArea(GeometricObject[] geometricObjects) {
        return Arrays.stream(geometricObjects)
                     .mapToDouble(GeometricObject::getArea)
                     .sum();

    }
}
