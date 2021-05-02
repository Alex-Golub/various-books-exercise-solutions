package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.HashMap;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/setsandmaps/intersect
 *
 * Returns a new map whose contents are the intersection of the two.
 *
 * @author Alex Golub
 * @since 02-May-21, 8:12 PM
 */
class intersect {
  public static Map<String, Integer> intersect(Map<String, Integer> map1,
                                               Map<String, Integer> map2) {
    Map<String, Integer> intersect = new HashMap<>();
    for (String key : map1.keySet()) {
      if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
        intersect.put(key, map1.get(key));
      }
    }
    
    return intersect;
  }
}
