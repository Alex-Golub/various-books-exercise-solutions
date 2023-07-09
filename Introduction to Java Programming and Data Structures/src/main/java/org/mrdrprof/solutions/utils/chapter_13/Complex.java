package org.mrdrprof.solutions.utils.chapter_13;

import lombok.EqualsAndHashCode;

/**
 * *13.17 (Math: The Complex class)
 * <p>
 * a + bi + c + di = (a + c) + (b + d)i
 * a + bi - (c + di) = (a - c) + (b - d)i
 * (a + bi) * (c + di) = (ac - bd) + (bc + ad)i
 * (a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc - ad)i/(c^2 + d^2)
 * | a + bi | = (a^2 + b^2)^0.5
 *
 * @author Alex Golub
 * @since July 01, 2023 1:52 PM
 */
@EqualsAndHashCode
public class Complex implements Comparable<Complex> {

    private final double realPart;
    private final double imaginaryPart;

    public Complex() {
        this(0, 0);
    }

    public Complex(double realPart) {
        this(realPart, 0);
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex(Complex other) {
        realPart = other.realPart;
        imaginaryPart = other.imaginaryPart;
    }
    
    public Complex add(Complex other) {
        return new Complex(realPart + other.realPart,
                           imaginaryPart + other.imaginaryPart);
    }

    public Complex subtract(Complex other) {
        return new Complex(realPart - other.realPart,
                           imaginaryPart - other.imaginaryPart);
    }

    public Complex multiply(Complex other) {
        return new Complex(realPart * other.realPart - imaginaryPart * other.imaginaryPart,
                           imaginaryPart * other.realPart + realPart * other.imaginaryPart);
    }

    public Complex divide(Complex other) {
        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        return new Complex((realPart * other.realPart + imaginaryPart * other.imaginaryPart) / denominator,
                           (imaginaryPart * other.realPart - realPart * other.imaginaryPart) / denominator);
    }

    public double abs() {
        return Math.pow(realPart * realPart + imaginaryPart * imaginaryPart, 0.5);
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public int compareTo(Complex other) {
        return Double.compare(this.abs(), other.abs());
    }

    @Override
    public String toString() {
        if (imaginaryPart == 0) {
            return Double.toString(realPart);
        }

        return "(%.4f + %.4fi)".formatted(realPart, imaginaryPart);
    }
}
