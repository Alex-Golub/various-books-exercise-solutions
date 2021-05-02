package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/4248?categoryid=328
 *
 * @author Alex Golub
 * @since 02-May-21, 3:16 PM
 */
class retainAll {
  public static void retainAll(Set<Integer> set1, Set<Integer> set2) {
    set1.removeIf(integer -> !set2.contains(integer));
  }
}
