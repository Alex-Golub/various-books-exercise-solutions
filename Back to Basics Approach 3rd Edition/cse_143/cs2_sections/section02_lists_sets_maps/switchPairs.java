package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/4236?categoryid=328
 *
 * @author Alex Golub
 * @since 02-May-21, 2:56 PM
 */
class switchPairs {
  public static void switchPairs(List<String> list) {
    for (int i = 1; i < list.size(); i += 2) {
      String r = list.get(i);
      list.set(i, list.get(i - 1));
      list.set(i - 1, r);
    }
  }
}
