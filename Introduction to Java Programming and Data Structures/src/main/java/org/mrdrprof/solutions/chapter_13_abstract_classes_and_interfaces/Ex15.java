package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_13.Rational;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * *13.15 (Use BigInteger for the Rational class)
 * Redesign and implement the Rational class in Listing 13.13 using BigInteger for the numerator and denominator.
 * Write a test program that prompts the user to enter two rational numbers and
 * display the results as shown in the following sample run:
 *
 * @author Alex Golub
 * @since July 01, 2023 12:34 PM
 */
class Ex15 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter the first rational number: ");
            String[] firstTokens = console.nextLine().split("\\s+");
            Rational first = new Rational(new BigInteger(firstTokens[0]),
                                          new BigInteger(firstTokens[1]));

            System.out.print("Enter the second rational number: ");
            String[] secondTokens = console.nextLine().split("\\s+");
            Rational second = new Rational(new BigInteger(secondTokens[0]),
                                           new BigInteger(secondTokens[1]));

            System.out.println(first + " + " + second + " = " + first.add(second));
            System.out.println(first + " - " + second + " = " + first.subtract(second));
            System.out.println(first + " * " + second + " = " + first.multiply(second));
            System.out.println(first + " / " + second + " = " + first.divide(second));
            System.out.println(second + " is " + second.doubleValue());
        }

    }
}
