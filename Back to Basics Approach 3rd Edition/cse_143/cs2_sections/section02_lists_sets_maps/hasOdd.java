package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/865?categoryid=328
 *
 * @author Alex Golub
 * @since 02-May-21, 3:01 PM
 */
class hasOdd {
  public static boolean hasOdd(Set<Integer> set) {
    return set.stream().anyMatch(i -> i % 2 == 1);
  }
}
