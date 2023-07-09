package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_13.Rational;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 13.21 (Algebra: vertex form equations)
 * The equation of a parabola can be expressed in
 * either standard form (y = ax2 + bx + c) or vertex form (y = a(x - h)2 + k).
 * Write a program that prompts the user to enter a, b, and c as integers in standard
 * form and displays h a = -2ab b and k a = 4ac4a- b2 b in the vertex form. Display h
 * and k as rational numbers. Here are some sample runs:
 *
 * @author Alex Golub
 * @since July 01, 2023 3:25 PM
 */
class Ex21 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter a, b, c: ");
            long a = console.nextLong();
            long b = console.nextLong();
            long c = console.nextLong();

            Rational h = new Rational(BigInteger.valueOf(-b), BigInteger.valueOf(2 * a));
            Rational k = new Rational(BigInteger.valueOf(4 * a * c - b * b), BigInteger.valueOf(4 * a));

            System.out.printf("h is %s k is %s", h, k);
        }
    }
}
