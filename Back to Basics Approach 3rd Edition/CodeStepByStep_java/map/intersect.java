package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/intersect
 * The intersection of two maps is defined here as the set of keys
 * and values that exist in both maps.
 *
 * @author Alex Golub
 * @since 01-May-21, 3:23 PM
 */
class intersect {
  public static Map<String, Integer> intersect(Map<String, Integer> map1,
                                               Map<String, Integer> map2) {
    Map<String, Integer> intersect = new HashMap<>();
    for (String key : map1.keySet()) {
      if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
        intersect.put(key, map1.get(key));
      }
    }
    
    return intersect;
  }
}
