package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.7 (Corner point coordinates)
 * Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.4c.
 * Write a program that prompts the user to enter the radius of the
 * bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon
 * from p1 to p5 in this order.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 1:30 PM
 */
class Ex4_7_CornerPointsCoordinates {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of the bounding circle: ");
    double radius = input.nextDouble();

    System.out.println("The coordinates of five points on the pentagon are: ");

    for (int i = 0; i < 5; i++) {
      double x = radius * Math.sin(2 * Math.PI / 5 * i);
      double y = radius * Math.cos(2 * Math.PI / 5 * i);
      System.out.printf("(%.2f, %.2f)\n", x, y);

    }
  }
}
