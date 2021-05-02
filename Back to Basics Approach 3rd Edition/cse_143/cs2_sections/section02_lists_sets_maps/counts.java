package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/868?categoryid=333
 *
 * @author Alex Golub
 * @since 02-May-21, 4:26 PM
 */
class counts {
  public static Map<Integer, Integer> counts(List<Integer> list, Set<Integer> set) {
    Map<Integer, Integer> map = new LinkedHashMap<>(set.size());
    for (Integer i : set) {
      long count = list.stream().filter(n -> n.equals(i)).count();
      map.put(i, (int) count);
    }
    
    return map;
  }
}
