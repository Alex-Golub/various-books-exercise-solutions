package cse_142.cs1_sections.section09_final_practice;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/arrayMystery
 *
 * {4, 1, 3}           => {4, 1, 2}
 * {2, 1, 3, 2}        => {2, 1, 2, 4}
 * {3, 6, 2, 9, 5}     => {3, 6, 2, 4, 6}
 * {1, 1, 1, 1, 8}     => {1, 1, 2, 1, 6}
 * {1, 3, 4, 6, 2, 9}  => {1, 3, 2, 4, 2, 8}
 *
 * @author Alex Golub
 * @since 04-Apr-21 2:24 PM
 */
class arrayMystery {
  public static void mystery(int[] list) {
    for (int i = 1; i < list.length - 1; i++) {
      if (list[i] <= list[i + 1]) {
        list[i + 1] = i * 2;
      }
    }

    System.out.println(Arrays.toString(list));
  }
}
