package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/4247?categoryid=328
 * <p>
 * Two sets are considered equal if they store the same values.
 * you can not assume that the set values are ordered.
 *
 * @author Alex Golub
 * @since 02-May-21, 3:09 PM
 */
class equals {
  public static boolean equals(Set<Integer> set1, Set<Integer> set2) {
    if (set1.size() != set2.size()) {
      return false;
    }
    
    for (Integer i : set1) {
      if (!set2.contains(i)) {
        return false;
      }
    }
    
    return true;
  }
}
