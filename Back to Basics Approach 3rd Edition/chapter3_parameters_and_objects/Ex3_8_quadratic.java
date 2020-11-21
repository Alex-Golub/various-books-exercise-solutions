package chapter3_parameters_and_objects;

/**
 * 8. Write a method called quadratic that solves quadratic
 * equations and prints their roots.
 * Your method should accept the coefficients a, b, and c as parameters
 * and should print the roots of the equation.
 * You may assume that the equation has two real roots,
 * though mathematically this is not always the case.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 5:41 PM
 */
class Ex3_8_quadratic {
  public static void main(String[] args) {
    quadratic(1, -7, 12);
    quadratic(1, 3, 2);
  }

  public static void quadratic(int a, int b, int c) {
    double desc = Math.sqrt(b * b - 4 * a * c);
    double x1   = (-b + desc) / (2 * a);
    double x2   = (-b - desc) / (2 * a);
    System.out.println("First root = " + x1);
    System.out.println("Second root = " + x2);
  }
}
