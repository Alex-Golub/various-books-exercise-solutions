package org.mrdrprof.solutions.chapter11_Inheritance_and_Polymorphism;

import org.mrdrprof.solutions.utils.chapter_11.CircleFromSimpleGeometricObject;

class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
        System.out.printf("A circle %s%n", circle);
        System.out.printf("The color is %s%n", circle.getColor());
        System.out.printf("The radius is %s%n", circle.getRadius());
        System.out.printf("The area is %s%n", circle.getArea());
        System.out.printf("The diameter is %s%n", circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
        System.out.printf("\nA rectangle %s%n", rectangle);
        System.out.printf("The area is %s%n", rectangle.getArea());
        System.out.printf("The perimeter is %s%n", rectangle.getPerimeter());
    }
}
