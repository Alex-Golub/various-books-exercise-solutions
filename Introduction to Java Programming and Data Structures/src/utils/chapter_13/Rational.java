package utils.chapter_13;

import lombok.Getter;

import java.util.Objects;

/**
 * a/b + c/d = (ad + bc)/(bd) (e.g., 2/3 + 3/4 = (2*4 + 3*3)/(3*4) = 17/12)
 * a/b - c/d = (ad - bc)/(bd) (e.g., 2/3 - 3/4 = (2*4 - 3*3)/(3*4) = -1/12)
 * a/b * c/d = (ac)/(bd) (e.g., 2/3*3/4 = (2*3)/(3*4) = 6/12 = 1/2)
 * (a/b) / (c/d) = (ad)/(bc) (e.g., (2/3) / (3/4) = (2*4)/(3*3) = 8/9)
 */
@Getter
public class Rational extends Number implements Comparable<Rational> {

    private final long numerator;
    private final long denominator;

    /**
     * Construct a rational with default properties
     */
    public Rational() {
        this(0, 1);
    }

    /**
     * Construct a rational with specified numerator and denominator
     */
    public Rational(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    /**
     * Find GCD of two numbers (brute force)
     */
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        return gcd;
    }

    /**
     * Add a rational number to this rational:
     * a/b + c/d = ((a * d) + (b * c)) / (b * d)
     */
    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.denominator +
                 denominator * secondRational.numerator;
        long d = denominator * secondRational.denominator;
        return new Rational(n, d);
    }

    /**
     * Subtract a rational number from this rational:
     * a/b + c/d = ((a * d) - (b * c)) / (b * d)
     */
    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.denominator
                 - denominator * secondRational.numerator;
        long d = denominator * secondRational.denominator;
        return new Rational(n, d);
    }

    /**
     * Multiply a rational number to this rational:
     * a/b * c/d = (a * c) / (b * d)
     */
    public Rational multiply(Rational secondRational) {
        long n = Math.multiplyExact(numerator, secondRational.numerator);
        long d = Math.multiplyExact(denominator, secondRational.denominator);
        return new Rational(n, d);
    }

    /**
     * Divide a rational number from this rational
     * a/b / c/d = (a * d) / (b * c)
     */
    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.denominator;
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1 || numerator == 0) {
            return String.valueOf(numerator);
        }

        return "%d/%d".formatted(numerator, denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        return (this.subtract((Rational) (other))).numerator == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        return Double.compare(this.subtract(o).numerator, 0);
    }
}
