package cse_142.cs1_sections.section09_final_practice;

import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/reverse3
 * If the list has extra values that are not part of a sequence of three,
 * those values are unchanged.
 *
 * You may not construct any extra data structures to solve this problem.
 * You must solve it by manipulating the ArrayList you are passed as a parameter.
 *
 * test #1:[3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4]
 * console output:
 * [19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204]
 * result: pass
 *
 * test #2:[3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4, 99, 2]
 * console output:
 * [19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204, 99, 2]
 * result: pass
 *
 *
 * @author Alex Golub
 * @since 05-Apr-21 11:29 AM
 */
class reverse3 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4);
    reverse3(list);
    System.out.println(list);

    System.out.println();

    list = Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4, 99, 2);
    reverse3(list);
    System.out.println(list);
  }

  public static void reverse3(List<Integer> list) {
    for (int i = 0; i < list.size() - 2; i += 3) {
      int temp = list.get(i);
      list.set(i, list.get(i + 2));
      list.set(i + 2, temp);
    }
  }
}
