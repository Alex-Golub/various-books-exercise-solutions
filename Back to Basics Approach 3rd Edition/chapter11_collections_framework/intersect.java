package chapter11_collections_framework;

import java.util.HashMap;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter11/e14-intersect
 *
 * @author Alex Golub
 * @since 30-Apr-21, 11:29 PM
 */
class intersect {
  public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
    Map<String, Integer> intersection = new HashMap<>();
    for (Map.Entry<String, Integer> entry : map1.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      if (map2.containsKey(key) && map2.get(key).equals(value)) {
        intersection.put(key, value);
      }
    }
    
    return intersection;
  }
}
