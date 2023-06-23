package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_11.Circle;
import utils.chapter_11.GeometricObject;

/**
 * *13.9 (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
 * GeometricObject and implement the Comparable interface. Override the
 * equals method in the Object class. Two Circle objects are equal if their radii
 * are the same. Draw the UML diagram that involves Circle, GeometricObject,
 * and Comparable.
 *
 * @author Alex Golub
 * @since June 23, 2023 10:23 PM
 */
class Ex9 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(1);
        GeometricObject circle2 = new Circle(1);
        GeometricObject circle3 = new Circle(2);

        System.out.println("circle1.equals(circle2) = " + circle1.equals(circle2));
        System.out.println("circle1.equals(circle3) = " + circle1.equals(circle3));
    }
}
