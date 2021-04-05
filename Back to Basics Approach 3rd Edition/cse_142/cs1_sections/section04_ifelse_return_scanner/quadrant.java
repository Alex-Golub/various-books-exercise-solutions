package cse_142.cs1_sections.section04_ifelse_return_scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/3772?categoryid=118
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:38 PM
 */
class quadrant {
  public static int quadrant(double x, double y) {
    if (Math.abs(x) < 1e-10 || Math.abs(y) < 1e-10)
      return 0;

    return x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
  }
}
