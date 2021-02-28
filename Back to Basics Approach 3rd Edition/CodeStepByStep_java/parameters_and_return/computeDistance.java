package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/computeDistance
 *
 * Write a method named computeDistance that
 * accepts four integer coordinates x1, y1, x2, and y2 as parameters and
 * computes the distance between points (x1, y1) and (x2, y2) on the Cartesian plane.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 4:37 PM
 */
/*public*/ class computeDistance {
  public static double computeDistance(int... coordinates) {
    double dx = coordinates[0] - coordinates[2];
    double dy = coordinates[1] - coordinates[3];
    return Math.sqrt(dx * dx + dy * dy);
  }
}
