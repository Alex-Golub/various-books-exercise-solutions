package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/4250?categoryid=333
 *
 * @author Alex Golub
 * @since 02-May-21, 4:30 PM
 */
class split {
  public static void main(String[] args) {
    Set<String> list = Set.of("to", "be", "or", "not", "that", "is", "the", "question");
    System.out.println(split(list));
  }
  
  public static Map<Integer, Set<String>> split(Set<String> set) {
    Map<Integer, Set<String>> map = new HashMap<>();
    for (String s : set) {
      map.compute(s.length(), (k, v) -> {
        if (v == null) {
          v = new HashSet<>();
        }
        
        v.add(s);
        return v;
      });
    }
    
    return map;
  }
}
