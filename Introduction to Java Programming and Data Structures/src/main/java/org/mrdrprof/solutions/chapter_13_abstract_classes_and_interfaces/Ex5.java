package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_11.Circle;
import org.mrdrprof.solutions.utils.chapter_11.GeometricObject;
import org.mrdrprof.solutions.utils.chapter_11.Rectangle;

/**
 * *13.5 (Enable GeometricObject comparable) Modify the GeometricObject class to
 * implement the Comparable interface and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects.
 * Draw the UML diagram and implement the new GeometricObject class. Write
 * a test program that uses the max method to find the larger of two circles, the larger
 * of two rectangles.
 *
 * @author Alex Golub
 * @since 23/06/2023 8:08 PM
 */
class Ex5 {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Green", true, 1);
        Circle circle2 = new Circle("Red", false, 2);
        GeometricObject max = GeometricObject.max(circle1, circle2);
        circle1.printCircle();
        circle2.printCircle();
        ((Circle) max).printCircle();

        GeometricObject rectangle1 = new Rectangle("Blue", true, 10, 2);
        GeometricObject rectangle2 = new Rectangle("Pink", false, 2, 2);

        GeometricObject max1 = GeometricObject.max(rectangle1, rectangle2);
        System.out.println(max1);
    }
}
