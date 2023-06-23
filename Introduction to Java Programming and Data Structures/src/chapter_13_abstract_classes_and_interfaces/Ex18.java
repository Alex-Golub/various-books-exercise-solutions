package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_13.Rational;

import java.math.BigInteger;

/**
 * 13.18 (Use the Rational class) Write a program that computes the following summation series using the Rational class:
 * 1/2  + 2/3 + 3/4 + ... 98/99 + 99/100
 *
 * @author Alex Golub
 * @since July 01, 2023 2:31 PM
 */
class Ex18 {
    public static void main(String[] args) {
        final long N = 100;
        Rational sum = new Rational();
        for (long i = 1; i <= N; i++) {
            sum = sum.add(new Rational(BigInteger.valueOf(i - 1),
                                       BigInteger.valueOf(i)));
        }

        System.out.printf("The sum of the first series is %s = %s%n", sum, sum.doubleValue());
    }
}
