package chapter9_Objects_Classes._9_11_2by2_linear_equations;

/**
 * ax + by = e
 * cx + dy = f
 * <p>
 * isSolvable if ad - bc != 0
 * <p>
 * Using Crammer rule
 * Created by ag on 24-May-20 5:51 PM
 */
public class LinearEquation {

  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;

  public LinearEquation(int a, int b, int c, int d, int e, int f) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

  public int getD() {
    return d;
  }

  public int getE() {
    return e;
  }

  public int getF() {
    return f;
  }

  public boolean isSolvable() {
    if (Math.subtractExact(Math.multiplyExact(getA(), getD()), Math.multiplyExact(getB(), getC())) == 0) {
      throw new ArithmeticException("Linear 2 X 2 set of equations is not solvable");
    }

    return true;
  }

  public double getX() {
    isSolvable();

    double nominator = Math.subtractExact(Math.multiplyExact(getE(), getD()),
            Math.multiplyExact(getB(), getF()));

    return nominator / getDenominator();
  }

  public double getY() {
    isSolvable();

    double nominator = Math.subtractExact(Math.multiplyExact(getA(), getF()),
            Math.multiplyExact(getE(), getC()));

    return nominator / getDenominator();
  }

  private double getDenominator() {
    return Math.subtractExact(Math.multiplyExact(getA(), getD()),
            Math.multiplyExact(getB(), getC()));
  }

  @Override
  public String toString() {
    String equation1 = String.format("%dx %sy = %s", getA(), (getB() >= 0 ? "+" : "") + getB(), getE());
    String equation2 = String.format("%dx %sy = %s", getC(), (getD() >= 0 ? "+" : "") + getD(), getF());

    return equation1 + "\n" + equation2;
  }


}
