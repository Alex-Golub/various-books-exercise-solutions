package org.mrdrprof.solutions.chapter8_MD_Arrays;

/**
 * **8.8 (All closest pairs of points)
 * Display all closest pairs of points with the same minimum distance.
 *
 * Enter the number of points: 8
 * Enter 8 points in pairs: 0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
 * The closest two points are (0.0, 0.0) and (1.0, 1.0)
 * The closest two points are (0.0, 0.0) and (-1.0, -1.0)
 * The closest two points are (1.0, 1.0) and (2.0, 2.0)
 * The closest two points are (-1.0, -1.0) and (-2.0, -2.0)
 * The closest two points are (-2.0, -2.0) and (-3.0, -3.0)
 * The closest two points are (-3.0, -3.0) and (-4.0, -4.0)
 * Their distance is 1.4142135623730951
 *
 * @author Mr.Dr.Professor
 * @since 11-Feb-21 8:10 PM
 */
class Ex8_8_allClosestPairs {
  public static void main(String[] args) {
    double[][] points = FindNearestPoints.getPoints();

    // p1 and p2 are the indices in the points array
    int p1 = 0, p2 = 1; // Initial two points
    double shortestDistances = FindNearestPoints.distance(points[p1][0], points[p1][1],
                                                          points[p2][0], points[p2][1]);

    // Store a closest pair in (indices[i][0], indices[i][1])
    // The pair of the points for (indices[i][0], indices[i][1]) is
    // points[indices[i][0]] and points[indices[i][1]]
    int[][] indices = new int[points.length][2];
    int     k       = 0;

    // Compute distance for every two points
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        double distance = FindNearestPoints.distance(points[i][0], points[i][1],
                                                     points[j][0], points[j][1]);

        if (distance < shortestDistances) {
          // Add a closest pair
          k = 0; // Reset k for new closest pairs
          indices[k][0] = i;
          indices[k][1] = j;
          shortestDistances = distance; // Update shortestDistances
        } else if (Math.abs(distance - shortestDistances) < 1e-10) {
          // Add another closest pair with the same minimum distance
          indices[k][0] = i;
          indices[k][1] = j;
          k++;
        }
      }
    }

    // Display all closest pairs
    for (int i = 0; i < k; i++) {
      p1 = indices[i][0];
      p2 = indices[i][1];
      System.out.println("The closest two points are " +
                         "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                         points[p2][0] + ", " + points[p2][1] + ")");
    }

    System.out.println("Their distance is " + shortestDistances);
  }

}
