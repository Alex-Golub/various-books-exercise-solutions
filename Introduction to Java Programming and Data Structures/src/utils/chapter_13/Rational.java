package utils.chapter_13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/**
 * *13.14 (Demonstrate the benefits of encapsulation)
 * *13.15 (Use BigInteger for the Rational class)
 * <p>
 * a/b + c/d = (ad + bc)/(bd) (e.g., 2/3 + 3/4 = (2*4 + 3*3)/(3*4) = 17/12)
 * a/b - c/d = (ad - bc)/(bd) (e.g., 2/3 - 3/4 = (2*4 - 3*3)/(3*4) = -1/12)
 * a/b * c/d = (ac)/(bd) (e.g., 2/3*3/4 = (2*3)/(3*4) = 6/12 = 1/2)
 * (a/b) / (c/d) = (ad)/(bc) (e.g., (2/3) / (3/4) = (2*4)/(3*3) = 8/9)
 */
public class Rational extends Number implements Comparable<Rational> {

    //    private final long numerator;
//    private final long denominator;
//    private long[] r = new long[2]; // r[0] = numerator, r[1] = denominator

    private final BigInteger numerator;
    private final BigInteger denominator;

    /**
     * Construct a rational with default properties
     */
    public Rational() {
//        this(0, 1);
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    /**
     * Construct a rational with specified numerator and denominator
     */
//    public Rational(long numerator, long denominator) {
    public Rational(BigInteger numerator, BigInteger denominator) {
//        if (denominator == 0) {
        if (denominator.compareTo(BigInteger.ZERO) == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

//        long gcd = gcd(numerator, denominator);
        BigInteger gcd = gcd(numerator, denominator);
//        this.r[0] = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.numerator = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : BigInteger.ONE.negate()).multiply(numerator)
                                                                                                                .divide(gcd);
//        this.r[1] = Math.abs(denominator) / gcd;
        this.denominator = denominator.abs().divide(gcd);
    }

    /**
     * Find GCD of two numbers (brute force)
     */
//    private static long gcd(long n, long d) {
    private static BigInteger gcd(BigInteger n, BigInteger d) {
//        long n1 = Math.abs(n);
//        long n2 = Math.abs(d);
//        int gcd = 1;
//
//        for (int k = 1; k <= n1 && k <= n2; k++) {
//            if (n1 % k == 0 && n2 % k == 0) {
//                gcd = k;
//            }
//        }
//
//        return gcd;

        return n.gcd(d);
    }

    /**
     * Add a rational number to this rational:
     * a/b + c/d = ((a * d) + (b * c)) / (b * d)
     */
    public Rational add(Rational secondRational) {
//        long n = r[0] * secondRational.r[1] + r[1] * secondRational.r[0];
//        long d = r[1] * secondRational.r[1];
//        return new Rational(n, d);

        return new Rational(numerator.multiply(secondRational.denominator).add(denominator.multiply(secondRational.numerator)),
                            denominator.multiply(secondRational.denominator));
    }

    /**
     * Subtract a rational number from this rational:
     * a/b + c/d = ((a * d) - (b * c)) / (b * d)
     */
    public Rational subtract(Rational secondRational) {
//        long n = r[0] * secondRational.r[1] - r[1] * secondRational.r[0];
//        long d = r[1] * secondRational.r[1];
//        return new Rational(n, d);

        return new Rational(numerator.multiply(secondRational.denominator).subtract(denominator.multiply(secondRational.numerator)),
                            denominator.multiply(secondRational.denominator));
    }

    /**
     * Multiply a rational number to this rational:
     * a/b * c/d = (a * c) / (b * d)
     */
    public Rational multiply(Rational secondRational) {
//        long n = Math.multiplyExact(r[0], secondRational.r[0]);
//        long d = Math.multiplyExact(r[1], secondRational.r[1]);
//        return new Rational(n, d);

        return new Rational(numerator.multiply(secondRational.numerator),
                            denominator.multiply(secondRational.denominator));
    }

    /**
     * Divide a rational number from this rational
     * a/b / c/d = (a * d) / (b * c)
     */
    public Rational divide(Rational secondRational) {
//        long n = r[0] * secondRational.r[1];
//        long d = r[1] * secondRational.r[0];
//        return new Rational(n, d);

        return new Rational(numerator.multiply(secondRational.denominator),
                            denominator.multiply(secondRational.numerator));
    }

    @Override
    public String toString() {
//        if (r[1] == 1 || r[0] == 0) {
        if (denominator.equals(BigInteger.ZERO) || numerator.equals(BigInteger.ZERO)) {
//            return String.valueOf(r[0]);
            return String.valueOf(numerator);
        }

//        return "%d/%d".formatted(r[0], r[1]);
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

//        return (this.subtract((Rational) (other))).r[0] == 0;
        return (this.subtract((Rational) (other))).numerator.equals(BigInteger.ZERO);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(r[0], r[1]);
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
//        return r[0] * 1.0 / r[1];
//        return new BigDecimal(numerator.divide(denominator));
        return new BigDecimal(numerator).divide(new BigDecimal(denominator),
                                                20,
                                                RoundingMode.HALF_DOWN)
                                        .doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
//        return Double.compare(this.subtract(o).r[0], 0);
        return this.compareTo(o);
    }

    public long getNumerator() {
//        return r[0];
        return numerator.longValue();
    }

    public long getDenominator() {
//        return r[1];
        return denominator.longValue();
    }
}
