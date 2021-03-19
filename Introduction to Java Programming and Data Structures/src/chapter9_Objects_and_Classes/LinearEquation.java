package chapter9_Objects_and_Classes;

/**
 * @author Mr.Dr.Professor
 * @since 19/03/2021 15:21
 */
/*public*/ class LinearEquation {
  private final double a;
  private final double b;
  private final double c;
  private final double d;
  private final double e;
  private final double f;

  public LinearEquation(double a, double b, double c,
                        double d, double e, double f) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  public double getD() {
    return d;
  }

  public double getE() {
    return e;
  }

  public double getF() {
    return f;
  }

  public boolean isSolvable() {
    return Math.abs(getDenominator()) > 1e-10;
  }

  public double getX() {
    if (isSolvable()) {
      return (getE() * getD() - getB() * getF()) / getDenominator();
    }

    throw new ArithmeticException("Linear equation can't be solved");
  }

  public double getY() {
    if (isSolvable()) {
      return (getA() * getF() - getE() * getC()) / getDenominator();
    }

    throw new ArithmeticException("Linear equation can't be solved");
  }

  private double getDenominator() {
    return getA() * getD() - getB() * getC();
  }

  public static void main(String[] args) {
    LinearEquation equation = new LinearEquation(0, 0, 3, 4, 5, 6);
    if (equation.isSolvable()) {
      System.out.println("x = " + equation.getX());
      System.out.println("y = " + equation.getY());
    } else {
      System.out.println("The equation has no solution");
    }
  }
}
