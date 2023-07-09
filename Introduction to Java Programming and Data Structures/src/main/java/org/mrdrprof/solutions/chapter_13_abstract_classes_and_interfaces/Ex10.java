package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_11.GeometricObject;
import org.mrdrprof.solutions.utils.chapter_11.Rectangle;

/**
 * *13.10 (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
 * extend GeometricObject and implement the Comparable interface. Override
 * the equals method in the Object class. Two Rectangle objects are equal if
 * their areas are the same. Draw the UML diagram that involves Rectangle, GeometricObject, and Comparable.
 * 
 * @author Alex Golub
 * @since June 23, 2023 10:28 PM
 */
class Ex10 {
    public static void main(String[] args) {
        GeometricObject rectangle1 = new Rectangle(2, 3);
        GeometricObject rectangle2 = new Rectangle(6, 1);
        GeometricObject rectangle3 = new Rectangle(3, 4);

        System.out.println("rectangle1.equals(rectangle2) = " + rectangle1.equals(rectangle2));
        System.out.println("rectangle2.equals(rectangle1) = " + rectangle2.equals(rectangle1));
        System.out.println("rectangle1.equals(rectangle3) = " + rectangle1.equals(rectangle3));
    }
}
