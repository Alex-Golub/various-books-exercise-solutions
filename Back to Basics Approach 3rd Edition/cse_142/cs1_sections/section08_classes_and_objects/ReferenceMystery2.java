package cse_142.cs1_sections.section08_classes_and_objects;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section8/ReferenceMystery2
 *
 * line 1  =>  4 [10, 20, 3]
 * line 2  =>  2 [10, 20, 3]
 * line 3  =>  7 5
 *
 * @author Alex Golub
 * @since 04-Apr-21 1:50 PM
 */
class ReferenceMystery2 {
  public static void main(String[] args) {
    int x = 2;
    int y = 5;
    int[] data = {10, 20, 30};
    mystery1(x, data);
    System.out.println(x + " " + Arrays.toString(data));
    x = mystery2(x, y);
    System.out.println(x + " " + y);
  }

  public static void mystery1(int x, int[] data) {
    x = x * 2;
    data[2] = x - 1;
    System.out.println(x + " " + Arrays.toString(data));
  }

  public static int mystery2(int y, int x) {
    y++;
    x--;
    return x + y;
  }
}
