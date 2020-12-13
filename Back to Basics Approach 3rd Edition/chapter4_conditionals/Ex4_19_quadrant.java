package chapter4_conditionals;

/**
 * 19. Write a method called quadrant that accepts as parameters
 * a pair of double values representing an (x, y) point and
 * returns the quadrant number for that point.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 9:40 PM
 */
class Ex4_19_quadrant {
  public static int quadrant(double x, double y) {
    if (Math.abs(x) < 1e-10 || Math.abs(y) < 1e-10)
      return 0;

    return x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
  }
}
