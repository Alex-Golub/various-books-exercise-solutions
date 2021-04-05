package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/564?categoryid=120
 *
 * {3, 7, 4}               => [3, 3, 4]
 * {0, 3, 7, 4, 1}         => [0, 3, 3, 2, 1]
 * {4, 3, 8, 5, 1, 2}      => [4, 3, 4, 2, 1, 2]
 * {2, 1, 5, 4, 10, 6, 2}  => [2, 1, 2, 4, 5, 6, 2]
 * {1, 2, 1, 2, 1, 2, 1}   => [1, 1, 1, 1, 1, 1, 1]
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:43 AM
 */
class arrayMystery3 {
  public static void mystery(int[] data) {
    for (int i = 1; i < data.length - 1; i++) {
      if (data[i] == data[i - 1] + data[i + 1]) {
        data[i] = data[i] / 2;
      }
    }
  }
}
