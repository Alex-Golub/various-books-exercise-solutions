package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * https://practiceit.cs.washington.edu/problem/view/4251?categoryid=333
 *
 * The keys of the new map should be ordered by the 3-digit exchanges and
 * each set should be ordered by the 4-digit suffixes in that set.
 *
 * [493-3923, 723-9278, 384-1917, 555-1795, 384-4923, 555-4923, 555-1212, 723-9823]
 * =>
 * {384=[1917, 4923], 493=[3923], 555=[1212, 1795, 4923], 723=[9278, 9823]}
 *
 * @author Alex Golub
 * @since 02-May-21, 7:14 PM
 */
class convert {
  public static Map<String, Set<String>> convert(Set<String> phoneNumbers) {
    Map<String, Set<String>> map = new TreeMap<>();
    for (String no : phoneNumbers) {
      int i = no.indexOf("-");
      String prefix = no.substring(0, i);
      String suffix = no.substring(i + 1);
      map.compute(prefix, (k, v) -> {
        if (v == null) { // this prefix is first time seen
          v = new TreeSet<>();
        }
        
        v.add(suffix);
        return v;
      });
    }
    
    return map;
  }
}
