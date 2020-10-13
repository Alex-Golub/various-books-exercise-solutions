package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.19 (Geometry: area of a triangle)
 * Triangle area calculation using Heron's formula.
 *
 * Created by ag on 13-Oct-20 8:21 PM 
 */
class Ex2_19_Triangle_Area {
  public static void main(String[] args) {
    System.out.print("Enter the coordinates of three points separated by spaces" +
                         "like x1 y1 x2 y2 x3 y3: ");
    Scanner scanner = new Scanner(System.in);
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();
    double x3 = scanner.nextDouble();
    double y3 = scanner.nextDouble();

    double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
    double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

    double s = (side1 + side2 + side3) / 2;
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    System.out.printf("The area of the triangle is %.2f", area);
  }
}
