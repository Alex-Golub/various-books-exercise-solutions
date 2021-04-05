package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/3899?categoryid=120
 *
 * {5}                  => 0
 * {3, 12}              => 9
 * {4, 2, 10, 8}        => 6
 * {1, 9, 3, 5, 7}      => 8
 * {8, 2, 10, 4, 10, 9} => 2
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:40 AM
 */
class arrayMystery4 {
  public static int arrayMystery4(int[] list) {
    int x = 0;
    for (int i = 1; i < list.length; i++) {
      int y = list[i] - list[0];
      if (y > x) {
        x = y;
      }
    }
    return x;
  }
}
