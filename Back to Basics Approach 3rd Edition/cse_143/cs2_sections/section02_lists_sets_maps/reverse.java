package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.HashMap;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/870?categoryid=333
 *
 * @author Alex Golub
 * @since 02-May-21, 7:09 PM
 */
class reverse {
  public static Map<String, Integer> reverse(Map<Integer, String> map) {
    Map<String, Integer> reversed = new HashMap<>();
    for (Map.Entry<Integer, String> e : map.entrySet()) {
      reversed.put(e.getValue(), e.getKey());
    }
    
    return reversed;
  }
}
