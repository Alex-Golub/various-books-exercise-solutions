package chapter4_Math_Characters_Strings;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * 4.4 (Geometry: area of a hexagon)
 * Write a program that prompts the user to enter the side of a
 * hexagon and displays its area.
 *
 * @author Mr.Dr.Professor
 * @since 12-Nov-20 7:29 PM
 */
class Ex4_4_HexagonArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter hexagon side: ");
    double s    = scanner.nextDouble();
    double area = (6 * s * s) / (4 * tan(PI / 6));
    System.out.printf("The area of the hexagon is %.2f", area);
  }
}
