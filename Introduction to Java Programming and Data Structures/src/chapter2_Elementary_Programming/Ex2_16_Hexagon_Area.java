package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.16 (Geometry: area of a hexagon)
 * Write a program that prompts the user to enter the
 * side of a hexagon and displays its area.
 *
 * Created by ag on 13-Oct-20 7:52 PM 
 */
class Ex2_16_Hexagon_Area {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the side: ");
    double side = scanner.nextDouble();

    double area = side * side * 3 * Math.pow(3, 0.5) / 2;
    System.out.printf("The area of the hexagon is %.4f", area);
  }
}
