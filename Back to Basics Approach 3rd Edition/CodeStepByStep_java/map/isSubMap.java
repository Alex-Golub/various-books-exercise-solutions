package CodeStepByStep.java.map;

import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/isSubMap
 *
 * Returns true if every key in the first map is also contained in the
 * second map and maps to the same value in the second map.
 * The order of the parameters does matter,
 * so the call of isSubMap(map2, map1) would return false.
 *
 * @author Alex Golub
 * @since 01-May-21, 3:36 PM
 */
class isSubMap {
  public static boolean isSubMap(Map<String, String> map1, Map<String, String> map2) {
    for (String key : map1.keySet()) {
      if (!map2.containsKey(key) || !map2.get(key).equals(map1.get(key))) {
        return false;
      }
    }
    
    return true;
  }
}
