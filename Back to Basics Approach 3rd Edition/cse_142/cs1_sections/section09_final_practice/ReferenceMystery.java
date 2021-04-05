package cse_142.cs1_sections.section09_final_practice;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/ReferenceMystery
 *
 * line 1  =>  108 [5, 10, 14]
 * line 2  =>  8 [5, 10, 14]
 * line 3  =>  20 8
 *
 * @author Alex Golub
 * @since 04-Apr-21 2:21 PM
 */
class ReferenceMystery {
  public static void main(String[] args) {
    int x = 4;
    int y = 8;
    int[] data = {5, 10, 15};
    x = mystery1(y, data);
    System.out.println(y + " " + Arrays.toString(data));
    mystery2(x, y);
    System.out.println(x + " " + y);
  }

  public static int mystery1(int n, int[] numbers) {
    n = n + 100;
    numbers[2]--;
    System.out.println(n + " " + Arrays.toString(numbers));
    return numbers[1] * 2;
  }

  public static void mystery2(int x, int y) {
    x++;
    y = y * 3;
  }
}
