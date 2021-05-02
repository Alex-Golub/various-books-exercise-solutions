package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/setsandmaps/contains3
 *
 * @author Alex Golub
 * @since 02-May-21, 8:06 PM
 */
class contains3 {
  public static boolean contains3(List<String> list) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : list) {
      map.compute(s, (k, v) -> v == null ? 1 : v + 1);
      if (map.get(s) >= 3) {
        return true;
      }
    }
    
    return false;
  }
}
