package chapter3_parameters_and_objects;

import java.util.Scanner;

/**
 * 4. Write a program that prompts for the lengths of the sides
 * of a triangle and reports the three angles.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 11:01 PM
 */
class PP3_4_TriangleAngles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter 3 lengths of triangle (e.g. 3 4 5): ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if (!isTriangle(a, b, c)) {
      System.out.printf("Triangle with sides: %d, %d, %d is not valid",
              a, b, c);
      return;
    }

    double alpha = getAngle(a, c, b);
    double beta  = getAngle(a, b, c);
    double gamma = getAngle(b, c, a);

    System.out.printf("alpha = %.2f\nbeta = %.2f\ngamma = %.2f", alpha, beta, gamma);
  }

  // cosine theorem
  public static double getAngle(int a, int b, int c) {
    double degree = (a * a + b * b - c * c) / (2.0 * a * b);
    return Math.toDegrees(Math.acos(degree));
  }

  public static boolean isTriangle(int a, int b, int c) {
    return a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a;
  }
}
