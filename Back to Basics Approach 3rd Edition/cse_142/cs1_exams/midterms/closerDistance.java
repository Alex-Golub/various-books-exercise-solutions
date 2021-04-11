package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm9/closerDistance
 *
 * @author Alex Golub
 * @since 11-Apr-21 6:09 PM
 */
class closerDistance {
  public static double closerDistance(int x1, int y1, int x2, int y2) {
    return Math.min(Math.sqrt(x1 * x1 + y1 * y1),
                    Math.sqrt(x2 * x2 + y2 * y2));
  }
}
