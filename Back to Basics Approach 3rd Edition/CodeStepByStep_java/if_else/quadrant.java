package CodeStepByStep_java.if_else;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/quadrant
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:37 AM
 */
/*public*/ class quadrant {
  public static int quadrant(double x, double y) {
    if (Math.abs(x) < 1e-10 || Math.abs(y) < 1e-10)
      return 0;

    return x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
  }
}
