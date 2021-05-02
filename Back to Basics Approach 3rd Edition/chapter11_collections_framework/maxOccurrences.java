package chapter11_collections_framework;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e15-maxOccurrences
 * Returns the number of times the most frequently occurring integer
 * (the "mode") occurs in the list.
 *
 * @author Alex Golub
 * @since 30-Apr-21, 11:37 PM
 */
class maxOccurrences {
  public static int maxOccurrences(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer key : list) {
      map.compute(key, (k, v) -> v == null ? 1 : v + 1);
    }
    
    return map.values().stream().max(Comparator.naturalOrder()).orElse(0);
  }
}
