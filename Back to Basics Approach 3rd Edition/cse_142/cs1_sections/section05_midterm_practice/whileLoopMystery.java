package cse_142.cs1_sections.section05_midterm_practice;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section5.5/whileLoopMystery
 *
 * mystery(2);   => 1 2
 * mystery(5);   => 1 5
 * mystery(9);   => 2 3
 * mystery(12);  => 3 3
 *
 * @author Alex Golub
 * @since 04-Apr-21 9:41 AM
 */
class whileLoopMystery {
  public static void mystery(int x) {
    int y = 1;
    int z = 2;
    while (x > z) {
      if (x % z == 0) {
        x = x / z;
        y++;
      } else {
        z++;
      }
    }
    System.out.println(y + " " + z);
  }
}
