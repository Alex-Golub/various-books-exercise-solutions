package chapter9_Objects_and_Classes;

/**
 * *9.10 (Algebra: quadratic equations)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 14:56
 */
/*public*/ class QuadraticEquation {
  private double a;
  private double b;
  private double c;

  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
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

  public double getDiscriminant() {
    return b * b - 4 * a * c;
  }

  public double getRoot1() {
    double disc = getDiscriminant();
    if (getDiscriminant() < 0.0) {
      return 0.0;
    }

    if (Math.abs(a) < 1e-10) {
      throw new ArithmeticException("/ by zero");
    }

    return (-getB() + Math.sqrt(disc)) / (2 * a); // runtime exception thrown if a == 0
  }

  public double getRoot2() {
    double disc = getDiscriminant();
    if (getDiscriminant() < 0.0) {
      return 0.0;
    }

    if (Math.abs(a) < 1e-10) {
      throw new ArithmeticException("/ by zero");
    }
    return (-getB() - Math.sqrt(disc)) / (2 * a); // runtime exception thrown if a == 0
  }

  public static void main(String[] args) {
    QuadraticEquation equation = new QuadraticEquation(1, 2, 3);
    getRoots(equation); // no roots

    System.out.println();
    equation = new QuadraticEquation(1, 10, 3);
    getRoots(equation); // two roots

    System.out.println();
    equation = new QuadraticEquation(1, 4, 4);
    getRoots(equation); // one root
  }

  private static void getRoots(QuadraticEquation equation) {
    double discriminant = equation.getDiscriminant();

    if (discriminant < 0) {
      System.out.println("The equation has no roots");
    } else if (Math.abs(discriminant) < 1e-10) {
      System.out.println("One root only: x1 == x2 == " + equation.getRoot1());
    } else {
      System.out.println("root1 = " + equation.getRoot1());
      System.out.println("root2 = " + equation.getRoot2());
    }
  }
}
