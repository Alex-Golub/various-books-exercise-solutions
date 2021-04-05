package cse_142.cs1_sections.section05_while_random_boolean;

/**
 * https://practiceit.cs.washington.edu/problem/view/4186?categoryid=302
 *
 * mystery(2);  => 1
 * mystery(-1); => 0
 * mystery(7);  => 3
 * mystery(18); => 2
 * mystery(43); => 4
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:57 PM
 */
class whileLoopMystery2 {
  public static int mystery2(int x) {
    int a = 1;
    int c = 0;
    while (x > 0) {
      a = x % 2;
      if (a == 1) {
        c++;
      }
      x = x / 2;
    }
    return c;
  }
}
