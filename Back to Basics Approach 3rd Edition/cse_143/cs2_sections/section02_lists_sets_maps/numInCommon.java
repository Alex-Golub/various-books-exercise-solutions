package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/setsandmaps/numInCommon
 *
 * @author Alex Golub
 * @since 02-May-21, 8:00 PM
 */
class numInCommon {
  public static int numInCommon(List<Integer> list1, List<Integer> list2) {
    Set<Integer> intersection = new HashSet<>(list1);
    intersection.retainAll(list2);
    return intersection.size();
  }
}
