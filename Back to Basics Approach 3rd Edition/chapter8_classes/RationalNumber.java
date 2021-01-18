package chapter8_classes;

/**
 * 1. Write a class called RationalNumber that represents a
 * fraction with an integer numerator and denominator.
 *
 * An extra challenge would be to maintain your RationalNumber
 * objects in reduced form, avoiding rational numbers
 * such as 3/6 in favor of 1/2, or avoiding 2/–3 in favor of –2/3.
 *
 * Another possible extra feature would be methods to
 * add, subtract, multiply, and divide two rational numbers.
 *
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 4:53 PM
 */
class RationalNumber {
  private int numerator;
  private int denominator;

  public RationalNumber() {
    numerator = 0;
    denominator = 1;
  }

  public RationalNumber(int numerator, int denominator) {
    if (denominator == 0)
      throw new IllegalArgumentException("Denominator can't be zero");

    reduce(numerator, denominator);
  }

  // maintain RationalNumber objects in reduced form
  private void reduce(int numerator, int denominator) {
    int hcf = hcf(numerator, denominator);
    this.numerator = numerator / hcf;
    this.denominator = denominator / hcf;

    // avoiding 2/–3 in favor of –2/3
    if (denominator < 0) {
      this.numerator *= -1;
      this.denominator *= -1;
    }
  }

  private int hcf(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    // hcf(a, b) = hcf(b, a%b) = ... = hcf(x, 0) => x is hcf
    while (b != 0) {
      int t = a;
      a = b;
      b = t % b;
    }

    return a;
  }

  // a/b + c/d = a*d / c*d
  public RationalNumber add(RationalNumber other) {
    int newNumerator = getNumerator() * other.getDenominator() +
                       other.getNumerator() * getDenominator();
    int newDenominator = getDenominator() * other.getDenominator();

    return new RationalNumber(newNumerator, newDenominator);
  }

  // a/b - c/d = a*d / c*d
  public RationalNumber subtract(RationalNumber other) {
    int newNumerator = getNumerator() * other.getDenominator() -
                       other.getNumerator() * getDenominator();
    int newDenominator = getDenominator() * other.getDenominator();

    return new RationalNumber(newNumerator, newDenominator);
  }

  // a/b * c/d = a*c/b*d
  public RationalNumber multiply(RationalNumber other) {
    int newNumerator   = getNumerator() * other.getNumerator();
    int newDenominator = getDenominator() * other.getDenominator();

    return new RationalNumber(newNumerator, newDenominator);
  }

  // a/b / c/d = a*d / b*c
  public RationalNumber divide(RationalNumber other) {
    int newNumerator   = getNumerator() * other.getDenominator();
    int newDenominator = getDenominator() * other.getNumerator();

    return new RationalNumber(newNumerator, newDenominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public String toString() {
    // omit denominators of 1, returning "4" instead of "4/1".
    if (denominator == 1)
      return numerator + "";

    return numerator + "/" + denominator;
  }

  // Testing
  public static void main(String[] args) {
    RationalNumber r1 = new RationalNumber(1, 2);
    RationalNumber r2 = new RationalNumber(12, 2);
//    System.out.println(r1.add(r2));
//    System.out.println(r1.subtract(r2));
//    System.out.println(r1.multiply(r2)); // 12/4 = 3
    System.out.println(r1.divide(r2)); // 2/24 = 1/12

  }
}
