package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/4252?categoryid=333
 *
 * keys of the map that you construct should be in sorted order.
 *
 * @author Alex Golub
 * @since 02-May-21, 7:20 PM
 */
class acronyms {
  public static Map<String, Set<List<String>>> acronyms(Set<List<String>> set) {
    Map<String, Set<List<String>>> map = new TreeMap<>();
    for (List<String> list : set) {
      StringBuilder acronym = new StringBuilder();
      
      for (String s : list) { // build acronym for this list
        acronym.append(Character.toUpperCase(s.charAt(0)));
      }
      
      map.compute(acronym.toString(), (k, v) -> {
        if (v == null) { // this acronym is first time seen
          v = new HashSet<>();
        }
        
        v.add(list); // associate this list with this acronym
        return v;
      });
    }
    
    return map;
  }
}
