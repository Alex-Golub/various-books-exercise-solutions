package cse_142.cs1_sections.section05_while_random_boolean;

/**
 * https://practiceit.cs.washington.edu/problem/view/3795?categoryid=302
 * <p>
 * mystery(3, 3)    => 3
 * mystery(5, 3)    => 1
 * mystery(2, 6)    => 2
 * mystery(12, 18)  => 6
 * mystery(30, 75)  => 15
 *
 * @author Alex Golub
 * @since 01-Apr-21 7:07 PM
 */
class whileLoopMystery3 {
  public static int mystery(int x, int y) {
    while (x != 0 && y != 0) {
      if (x < y) {
        y = y - x;
      } else {
        x = x - y;
      }
    }
    return x + y;
  }
}
