package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.HashSet;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/setsandmaps/numUnique
 *
 * @author Alex Golub
 * @since 02-May-21, 7:59 PM
 */
class numUnique {
  public static int numUnique(List<Integer> list) {
    return new HashSet<>(list).size();
  }
}
