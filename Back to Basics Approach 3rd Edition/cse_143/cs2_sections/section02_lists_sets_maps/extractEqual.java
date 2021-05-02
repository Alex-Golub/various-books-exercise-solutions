package cse_143.cs2_sections.section02_lists_sets_maps;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/4253?categoryid=333
 *
 * @author Alex Golub
 * @since 02-May-21, 7:51 PM
 */
class extractEqual {
  public static Set<Point> extractEqual(Set<Point> set) {
    Set<Point> equalPoints = new HashSet<>();
    for (Point p : set) {
      if (p.x == p.y) {
        equalPoints.add(p);
      }
    }
    
    return equalPoints;
  }
}
