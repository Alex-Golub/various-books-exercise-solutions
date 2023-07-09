package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Random;

/**
 * 2.18 (Print a table)
 * Write a program that displays the following table.
 * Calculate the middle point of two points.
 *
 * Created by ag on 13-Oct-20 8:03 PM 
 */
class Ex2_18_Table {
  public static void main(String[] args) {
    // Headers
    System.out.printf("%4s%10s%20s\n", "a", "b", "Middle Point");
    int    x1, y1, x2, y2;
    double mx, my;

    Random rnd = new Random(); // to get uniformly random number

    for (int i = 0; i <= 5; i++) {
      x1 = rnd.nextInt(20); // randomly select number in range [0, 19]
      y1 = rnd.nextInt(20);
      x2 = rnd.nextInt(20);
      y2 = rnd.nextInt(20);

      mx = (x1 + x2) / 2.0;
      my = (y1 + y2) / 2.0;

      String a = String.format("(%d, %d)", x1, y1);
      String b = String.format("(%d, %d)", x2, y2);
      String m = String.format("(%.1f, %.1f)", mx, my);

      System.out.printf("%-10s%-12s%-15s\n", a, b, m);
    }
  }
}
