package chapter2_Intro_Java_Input_Ouput._2_28;

import java.util.Scanner;

/**
 * 2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you
 * learned about integers and the type int. Java can also represent floating-point numbers that contain
 * decimal points, such as 3.14159.
 * Write an application that inputs from the user the radius of a circle
 * as an integer and prints the circle’s diameter, circumference and area using the floating-point value
 * 3.14159 for π.
 * Use the techniques shown in Fig. 2.7.
 * [Note: You may also use the predefined constant Math.PI for the value of π.
 * This constant is more precise than the value 3.14159.
 * Class Math is defined in package java.lang.
 * Classes in that package are imported automatically, so you do not
 * need to import class Math to use it.] Use the following formulas (r is the radius):
 *      diameter = 2r
 *      circumference = 2πr
 *      area = πr2
 * Do not store the results of each calculation in a variable.
 * Rather, specify each calculation as the
 * value that will be output in a System.out.printf statement.
 * The values produced by the circumference and area calculations are floating-point numbers.
 * Such values can be output with the format specifier %f in a System.out.printf statement.
 * You’ll learn more about floating-point
 * numbers in Chapter 3.
 *
 * Created by ag on 15-Jun-20 12:52 PM
 */
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter radius: ");
    int r = scanner.nextInt();

    System.out.printf("Diameter -> %d%n", 2 * r);
    System.out.printf("Circumference -> %.2f%n", 2 * Math.PI * r);
    System.out.printf("Area -> %.2f%n", Math.PI * r * r);

  }
}
