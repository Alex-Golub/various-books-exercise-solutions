package chapter13_sorting_searching;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class PointComparatorExample {
  public static void main(String[] args) {
    Point[] points = {
      new Point(4, -2),
      new Point(3, 9),
      new Point(-1, 15),
      new Point(3, 7)
    };
    
    Comparator<Point> pointComparator = (p1, p2) -> {
      int dx = p1.x - p2.x;
      int dy = p1.y - p2.y;
      return dx == 0 ? dy : dx;
    };
    
    Arrays.sort(points, pointComparator);
    Arrays.stream(points)
          .map(p -> "(" + p.x + ", " + p.y + ")")
          .forEach(System.out::println);
    System.out.println();
    
    Arrays.sort(points, Collections.reverseOrder(pointComparator));
    Arrays.stream(points)
          .map(p -> "(" + p.x + ", " + p.y + ")")
          .forEach(System.out::println);
  }
}
