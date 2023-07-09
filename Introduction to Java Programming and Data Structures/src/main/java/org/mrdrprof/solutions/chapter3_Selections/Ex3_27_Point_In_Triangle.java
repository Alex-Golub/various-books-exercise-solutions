package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.27 (Geometry: points in triangle?)
 * Write a program that prompts the user to enter a point with
 * x- and y-coordinates and determines whether
 * the point is inside the triangle.
 *
 * FIXME
 *
 * Created by ag on 29-Oct-20 5:45 PM
 */
class Ex3_27_Point_In_Triangle {
  final static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter points of right-triangle");
    System.out.print("Enter point A x- and y-coordinates: ");
    double ax = scanner.nextInt();
    double ay = scanner.nextInt();
    System.out.print("Enter point B x- and y-coordinates: ");
    double bx = scanner.nextInt();
    double by = scanner.nextInt();
    System.out.print("Enter point C x- and y-coordinates: ");
    double cx = scanner.nextInt();
    double cy = scanner.nextInt();

    double side1 = getLength(ax, ay, bx, by);
    double side2 = getLength(bx, by, cx, cy);
    double side3 = getLength(cx, cy, ax, ay);

    if (isTriangle(side1, side2, side3)) return;
    if (isRightTriangle(side1, side2, side3)) return;

    System.out.print("Enter a point’s x- and y-coordinates: ");
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    // TODO



  }

  private static double getLength(double ax, double ay, double bx, double by) {
    return Math.abs(Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2)));
  }

  private static boolean isTriangle(double side1, double side2, double side3) {
    boolean isTriangle = side1 + side2 > side3 &&
                         side1 + side3 > side2 &&
                         side2 + side3 > side1;
    if (!isTriangle) {
      System.out.println("Provided points don't form a valid triangle");
      return true;
    }
    return false;
  }

  private static boolean isRightTriangle(double side1, double side2, double side3) {
    double a_2 = side1 * side1;
    double b_2 = side2 * side2;
    double c_2 = side3 * side3;
    boolean isRightTri = a_2 + b_2 == c_2 ||
                         b_2 + c_2 == a_2 ||
                         c_2 + a_2 == b_2;
    if (!isRightTri) {
      System.out.println("Provided points don't form a valid right triangle");
      return true;
    }
    return false;
  }
}
