package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://practiceit.cs.washington.edu/problem/view/4280?categoryid=333
 *
 * (1) returns a new map that is a copy of the map parameter.
 * (2) The map you construct should store keys in alphabetical order.
 * (3) In constructing collection objects, you are required to use the 0-argument constructors
 *
 * @author Alex Golub
 * @since 02-May-21, 7:42 PM
 */
class deepCopy {
  public static Map<String, List<Integer>> deepCopy(Map<String, List<Integer>> map) {
    Map<String, List<Integer>> copy = new TreeMap<>(); // (2)
    for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
      copy.put(e.getKey(), copyList(e.getValue()));
    }
    
    return copy;
  }
  
  private static List<Integer> copyList(List<Integer> src) {
    List<Integer> copy = new ArrayList<>(); // (3)
    for (Integer i : src) {
      copy.add(i);
    }
    
    return copy;
  }
}
