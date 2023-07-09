package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_11.Circle;
import org.mrdrprof.solutions.utils.chapter_11.Rectangle;

/**
 * *13.6 (The ComparableCircle class) Define a class named ComparableCircle
 * that extends Circle and implements Comparable. Draw the UML diagram
 * and implement the compareTo method to compare the circles on the basis of
 * area. Write a test class to find the larger of two instances of ComparableCircle
 * objects, and the larger between a circle and a rectangle.
 *
 * @author Alex Golub
 * @since June 23, 2023 8:41 PM
 */
class Ex6 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);

        circle1.printCircle();
        circle2.printCircle();
        System.out.println("\nLarger circle is: ");
        int compared = circle1.compareTo(circle2);
        if (compared > 0) {
            circle1.printCircle();
        } else {
            circle2.printCircle();
        }

        System.out.println();

        Rectangle rectangle = new Rectangle(5, 2);
        System.out.println(rectangle);
        int comparedToRectangle = circle1.compareTo(rectangle);
        if (comparedToRectangle > 0) {
            System.out.println("Circle is larger");
            circle1.printCircle();
        } else {
            System.out.println("Rectangle is larger: " + rectangle);
        }

    }
}
