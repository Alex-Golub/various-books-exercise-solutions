package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/4246?categoryid=328
 *
 * You are also not allowed to construct any structured objects to solve the problem
 *
 * @author Alex Golub
 * @since 02-May-21, 3:06 PM
 */
class containsAll {
  public static boolean containsAll(Set<Integer> set1, Set<Integer> set2) {
    for (Integer i : set2) {
      if (!set1.contains(i)) {
        return false;
      }
    }
    
    return true;
  }
}
