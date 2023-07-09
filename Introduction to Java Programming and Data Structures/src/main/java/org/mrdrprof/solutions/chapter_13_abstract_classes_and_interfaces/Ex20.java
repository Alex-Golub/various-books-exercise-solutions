package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_13.Complex;

import java.util.Scanner;

/**
 * 13.20 (Algebra: solve quadratic equations)
 * Rewrite Programming Exercise 3.1 to obtain
 * imaginary roots if the determinant is less than 0 using the Complex class in
 * Programming Exercise 13.17. Here are some sample runs:
 * <p>
 * Enter a, b, c: 1 3 1
 * The roots are –0.381966 and –2.61803
 * <p>
 * Enter a, b, c: 1 2 1
 * The root is –1
 *
 * @author Alex Golub
 * @since July 01, 2023 3:17 PM
 */
class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double dis = b * b - 4 * a * c;
        switch (Double.compare(dis, 0.0)) {
            case 1:
                double r1 = (-b + Math.pow(dis, 0.5)) / (2 * a);
                double r2 = (-b - Math.pow(dis, 0.5)) / (2 * a);
                System.out.printf("The equation has two roots %.6f and %.6f%n", r1, r2);
                break;
            case 0:
                double r = -b / (2.0 * a);
                System.out.printf("The equation has one root %.6f%n", r);
                break;
            case -1:
                Complex root1 = new Complex(-b / (2 * a), Math.pow(-dis, 0.5) / (2 * a));
                Complex root2 = new Complex(-b / (2 * a), -Math.pow(-dis, 0.5) / (2 * a));
                System.out.println("The roots are " + root1 + " and " + root2);
                break;
        }
    }
}
