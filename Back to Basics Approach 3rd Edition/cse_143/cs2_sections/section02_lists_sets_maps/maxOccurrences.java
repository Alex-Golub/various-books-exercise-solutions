package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/872?categoryid=333
 *
 * @author Alex Golub
 * @since 02-May-21, 7:11 PM
 */
class maxOccurrences {
  public static int maxOccurrences(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>();
    int maxOccurrences = 0;
    for (Integer i : list) {
      map.compute(i, (k, v) -> v == null ? 1 : v + 1);
      maxOccurrences = Math.max(maxOccurrences, map.get(i));
    }
    
    return maxOccurrences;
  }
}
