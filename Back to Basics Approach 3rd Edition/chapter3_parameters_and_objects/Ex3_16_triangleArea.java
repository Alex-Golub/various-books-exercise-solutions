package chapter3_parameters_and_objects;

/**
 * 16. Write a method called triangleArea that accepts the
 * three side lengths of a triangle as parameters and returns the
 * area of a triangle with those side lengths.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 6:56 PM
 */
class Ex3_16_triangleArea {
  public static void main(String[] args) {

  }

  public static double triangleArea(double a, double b, double c) {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }
}
