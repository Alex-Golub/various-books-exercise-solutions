package cse_142.cs1_sections.section08_classes_and_objects;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section8/ReferenceMystery1
 *
 * line 1  =>  3 [2, 3, 7]
 * line 2  =>  1 [2, 3, 7]
 * line 3  =>  17 7
 *
 * @author Alex Golub
 * @since 04-Apr-21 1:45 PM
 */
class ReferenceMystery1 {
  public static void main(String[] args) {
    int x = 1;
    int y = 7;
    int[] data = {2, 4, 6};
    mystery1(data[x], data);
    System.out.println(x + " " + Arrays.toString(data));
    x = mystery2(x, y);
    System.out.println(x + " " + y);
  }

  public static void mystery1(int z, int[] numbers) {
    z = z + 3;
    numbers[z / 3]++;
    z = 3;
    numbers[z - 2]--;
    System.out.println(z + " " + Arrays.toString(numbers));
  }

  public static int mystery2(int x, int y) {
    y++;
    x = x + y;
    return x + y;
  }
}
