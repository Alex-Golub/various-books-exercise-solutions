package chapter4_conditionals;

/**
 * 12. Write a method called printTriangleType that accepts three integer
 * arguments representing the lengths of the sides of a triangle and
 * prints what type of triangle it is.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 7:03 PM
 */
class Ex4_12_printTriangleType {
  public static void main(String[] args) {
    printTriangleType(5, 7, 7);
    printTriangleType(6, 6, 6);
    printTriangleType(5, 7, 8);
    printTriangleType(12, 18, 12);
    printTriangleType(2, 18, 2);
  }

  public static void printTriangleType(int a, int b, int c) {
    if (a <= 0 || b <= 0 || c <= 0 || a > b + c || b > a + c || c > a + b)
      throw new IllegalArgumentException("Invalid Triangle Side Lengths");

    if (a == b && b == c)
      System.out.println("equilateral");
    else if (a == b || b == c || a == c)
      System.out.println("isosceles");
    else
      System.out.println("scalene");
  }
}
