package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.19 (Compute the perimeter of a triangle)
 * Write a program that reads three edges for a
 * triangle and computes the perimeter if the input is valid.
 * <p>
 * Created by ag on 27-Oct-20 11:21 PM
 */
class Ex3_19_Tri_Perimeter {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter three triangle edged " +
            "in the format xi yi (e.g. 3 2 1 4 2 3): ");
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();
    int x3 = scanner.nextInt();
    int y3 = scanner.nextInt();

    // Compute lengths of each side
    double s1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    double s2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
    double s3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

    boolean isTriangle = s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
    if (isTriangle) {
      double p = s1 + s2 + s3;
      System.out.println("Perimeter is " + (int) (p * 100 + 0.5) / 100.0);
    } else {
      System.out.println("Input can't be a legal triangle");
    }
  }
}
