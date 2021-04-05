package cse_142.cs1_sections.section05_while_random_boolean;

/**
 * https://practiceit.cs.washington.edu/problem/view/3778?categoryid=302
 * mystery(1)  => 1 0
 * mystery(6)  => 4 2
 * mystery(19) => 16 4
 * mystery(39) => 32 5
 * mystery(74) => 64 6
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:45 PM
 */
class whileLoopMystery1 {
  public static void mystery(int x) {
    int y = 1;
    int z = 0;
    while (2 * y <= x) {
      y = y * 2;
      z++;
    }
    System.out.println(y + " " + z);
  }
}
