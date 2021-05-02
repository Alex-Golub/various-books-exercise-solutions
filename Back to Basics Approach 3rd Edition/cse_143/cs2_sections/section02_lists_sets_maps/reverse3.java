package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/4207?categoryid=328
 *
 * @author Alex Golub
 * @since 02-May-21, 3:00 PM
 */
class reverse3 {
  public static void reverse3(List<Integer> list) {
    for (int i = 0; i < list.size() - 2; i += 3) {
      int temp = list.get(i);
      list.set(i, list.get(i + 2));
      list.set(i + 2, temp);
    }
  }
}
