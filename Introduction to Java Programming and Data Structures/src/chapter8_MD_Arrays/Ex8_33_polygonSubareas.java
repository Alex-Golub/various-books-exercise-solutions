package chapter8_MD_Arrays;

import java.util.Arrays;

/**
 * *8.33 (Geometry: polygon subareas)
 * A convex four-vertex polygon is divided into four triangles.
 *
 * Enter x1, y1 x2, y2 x3, y3 x4, y4: -2.5 2 4 4 3 -2 -2 -3.5
 * The areas are: 6.17 7.96 8.08 10.42
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 6:01 PM
 */
class Ex8_33_polygonSubareas {
  static final int VERTICES = 4;

  public static void main(String[] args) {
    double[][] points = Ex8_32_areaOfTriangle.getPoints(VERTICES);

    // swap rows to make it compatible to find intersection point
    // of diagonals rather than polygon sides
    // using Ex8_31 getIntersectingPoint[double[][]) method
    swapRows(points, 1, 2); // [v1, v2, v3, v4] -> [v1, v3, v2, v4]
    double[] intersectionPoint = Ex8_31_intersectingPoints.getIntersectingPoint(points);

    // swap points to original potion because now we have the intersection
    // point and we need the sides of the polygon
    // areas using Ex8_32 getTriangleArea(double[][]) method
    swapRows(points, 1, 2);
    double[] areas = polygonSubareas(points, intersectionPoint);

    Arrays.sort(areas);

    System.out.print("The areas are:");
    for (double area : areas) {
      System.out.printf(" %.2f", area);
    }

    System.out.println();
  }

  private static double[] polygonSubareas(double[][] points, double[] intersectionPoint) {
    double[] areas = new double[VERTICES];
    for (int i = 0; i < VERTICES; i++) {
      double[][] triangle = new double[3][2];

      // v1, v2, ip (= intersection point)
      // v2, v3, ip
      // v3, v4, ip
      // v4, v1, ip
      triangle[0] = points[i];
      triangle[1] = points[(i + 1) % VERTICES];
      triangle[2] = intersectionPoint;

      areas[i] = Ex8_32_areaOfTriangle.getTriangleArea(triangle);
    }
    return areas;
  }

  public static void swapRows(double[][] m, int i, int j) {
    double[] temp = m[i];
    m[i] = m[j];
    m[j] = temp;
  }
}
