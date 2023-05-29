package chapter11_Inheritance_and_Polymorphism;

import utils.chapter_11.CircleFromSimpleGeometricObject;
import utils.chapter_11.SimpleGeometricObject;

class PolymorphismDemo {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    /**
     * Display geometric object properties
     */
    public static void displayObject(SimpleGeometricObject object) {
        System.out.printf("Created on %s. Color is %s%n", object.getDateCreated(), object.getColor());
    }
}
