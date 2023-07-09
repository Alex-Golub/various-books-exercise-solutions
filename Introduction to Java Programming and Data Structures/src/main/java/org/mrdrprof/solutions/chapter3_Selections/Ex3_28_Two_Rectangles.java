package org.mrdrprof.solutions.chapter3_Selections;

import java.awt.Rectangle;

import java.util.Scanner;

/**
 * **3.28 (Geometry: two rectangles)
 * Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first
 *
 * FIXME
 *
 * Created by ag on 29-Oct-20 6:19 PM
 */
class Ex3_28_Two_Rectangles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
    double r1x = scanner.nextDouble();
    double r1y = scanner.nextDouble();
    double r1w = scanner.nextDouble();
    double r1h = scanner.nextDouble();
    System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
    double r2x = scanner.nextDouble();
    double r2y = scanner.nextDouble();
    double r2w = scanner.nextDouble();
    double r2h = scanner.nextDouble();
    
    Rectangle r1 = new Rectangle(0, 0, 5, 10);
    Rectangle r2 = new Rectangle(0, 0, 5, 10);
    r1.intersects(r2);
//    r1.contains();
  }
}
