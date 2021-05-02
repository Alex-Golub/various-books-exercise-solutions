package CodeStepByStep.java.set;

import java.util.*;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/twice
 *
 * Returns a set containing all the numbers in the list that appear exactly twice.
 *
 * TODO: Extra challenge: Use only Sets as auxiliary storage.
 *
 * @author Alex Golub
 * @since 01-May-21, 12:22 PM
 */
class twice {
  public static Set<Integer> twice(List<Integer> list) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    for (Integer key : list) {
      map.compute(key, (k, v) -> v == null ? 1 : v + 1);
    }
    
    Set<Integer> exactlyTwice = new LinkedHashSet<>();
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() == 2) {
        exactlyTwice.add(e.getKey());
      }
    }
    
    return exactlyTwice;
  }
}
