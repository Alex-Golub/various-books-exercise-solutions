package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.util.Scanner;

/**
 * *10.15 (Geometry: the bounding rectangle)
 *
 * Enter five points: 1.0 2.5 3 4 5 6 7 8 9 10
 * The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5
 *
 * @author Mr.Dr.Professor
 * @since 24-Mar-21 11:19 PM
 */
/*public*/ class Ex10_15_bounding_rectangle {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter five points: ");
    double[][] points = new double[5][2];
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points[i].length; j++) {
        points[i][j] = console.nextDouble();
      }
    }

//    System.out.println(Arrays.deepToString(points));
    MyRectangle2D boundingRectangle = MyRectangle2D.getRectangle(points);
//    System.out.println(boundingRectangle);
    System.out.printf("The bounding rectangle's center (%.1f, %.2f), " +
                      "width %.1f, height %.1f\n",
                      boundingRectangle.getX(),
                      boundingRectangle.getY(),
                      boundingRectangle.getWidth(),
                      boundingRectangle.getHeight());
  }
}
