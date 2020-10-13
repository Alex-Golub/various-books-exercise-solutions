package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.15 (Geometry: distance of two points)
 * Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance.
 *
 * Created by ag on 13-Oct-20 7:29 PM 
 */
class Ex2_15_Distance {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter x1 and y1: ");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();

    System.out.print("Enter x2 and y2: ");
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    // Math.sqrt(a) === Math.pow(a, 0.5)
    double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
    System.out.printf("The distance between the two points is %.3f", distance);
  }
}

