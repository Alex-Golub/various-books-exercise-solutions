package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_11.Circle;
import org.mrdrprof.solutions.utils.chapter_11.GeometricObject;
import org.mrdrprof.solutions.utils.chapter_11.Rectangle;

class TestGeometricObject {

    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.printf("The two objects have the same area? %s%n", equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea(GeometricObject object1,
                                    GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.printf("The area is %s%n", object.getArea());
        System.out.printf("The perimeter is %s%n", object.getPerimeter());
    }
}
