package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_13.Rational;

/**
 * *13.14 (Demonstrate the benefits of encapsulation) Rewrite the Rational class in Listing 13.13 using a new internal representation for the numerator and denominator.
 * Create an array of two integers as follows:
 * private long[] r = new long[2];
 * Use r[0] to represent the numerator and r[1] to represent the denominator. The
 * signatures of the methods in the Rational class are not changed, so a client application that uses the previous Rational class can continue to use this new Rational class without being recompiled.
 *
 * @author Alex Golub
 * @since July 01, 2023 12:13 PM
 */
class Ex14 {
//    public static void main(String[] args) {
//        Rational r1 = new Rational(4, 2);
//        Rational r2 = new Rational(2, 3);
//
//        System.out.printf("%s + %s = %s%n", r1, r2, r1.add(r2));
//        System.out.printf("%s - %s = %s%n", r1, r2, r1.subtract(r2));
//        System.out.printf("%s * %s = %s%n", r1, r2, r1.multiply(r2));
//        System.out.printf("%s / %s = %s%n", r1, r2, r1.divide(r2));
//        System.out.printf("%s is %s%n", r2, r2.doubleValue());
//
//        Rational r11 = new Rational(1, 123456789);
//        Rational r22 = new Rational(1, 123456789);
//        Rational r33 = new Rational(1, 123456789);
//        try {
//            System.out.printf("r11 * r22 * r33 is %s%n", r11.multiply(r22.multiply(r33)));
//        } catch (Exception e) {
//            System.out.println("e.getMessage() = " + e.getMessage());
//        }
//
//        Rational r111 = new Rational(-2, 6);
//        System.out.println(r111.getNumerator()); // => -1
//        System.out.println(r111.getDenominator()); // => 3
//        System.out.println(r111.intValue()); // => 0
//        System.out.println(r111.doubleValue()); // => -0.3333333333333333
//    }
}
