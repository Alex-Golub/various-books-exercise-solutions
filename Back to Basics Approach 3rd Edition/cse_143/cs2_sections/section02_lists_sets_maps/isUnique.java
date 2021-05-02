package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.HashSet;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/setsandmaps/isUnique
 *
 * @author Alex Golub
 * @since 02-May-21, 8:09 PM
 */
class isUnique {
  public static boolean isUnique(Map<String, String> map) {
    return new HashSet<>(map.values()).size() == map.values().size();
  }
}
