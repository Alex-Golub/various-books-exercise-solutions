package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_11.Triangle;
import org.mrdrprof.solutions.utils.exceptions.IllegalTriangleException;

import java.util.Scanner;

/**
 * **13.1 (Triangle class) Design a new Triangle class that extends the abstract
 * GeometricObject class. Draw the UML diagram for the classes Triangle and
 * GeometricObject then implement the Triangle class. Write a test program
 * that prompts the user to enter three sides of the triangle, a color, and a Boolean
 * value to indicate whether the triangle is filled. The program should create a Triangle object with these sides, and set the color and filled properties using the
 * input. The program should display the area, perimeter, color, and true or false to
 * indicate whether it is filled or not.
 *
 * @author Alex Golub
 * @since 23/06/2023 7:29 PM
 */
class Ex1 {
    public static void main(String[] args) throws IllegalTriangleException {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter three sides of the triangle: ");
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            double c = Double.parseDouble(console.nextLine());
            System.out.print("Enter color: ");
            String color = console.nextLine();
            System.out.print("Enter true or false to indicate whether it is filled: ");
            boolean filled = console.nextBoolean();

            Triangle triangle = new Triangle(color, filled, a, b, c);

            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Is filled: " + triangle.isFilled());
            System.out.println("triangle = " + triangle);
        }
    }
}
