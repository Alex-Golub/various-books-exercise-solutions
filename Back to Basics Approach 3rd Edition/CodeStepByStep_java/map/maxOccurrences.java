package CodeStepByStep.java.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/maxOccurrences
 *
 * @author Alex Golub
 * @since 01-May-21, 3:27 PM
 */
class maxOccurrences {
  public static int maxOccurrences(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer key : list) {
      map.compute(key, (k, v) -> v == null ? 1 : v + 1);
    }
  
    return map.values().stream()
              .max(Comparator.comparingInt(Integer::intValue))
              .orElse(0);
  }
}
