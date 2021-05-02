package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/reverse
 * <p>
 * The reverse of a map is defined here to be a new map that uses the values
 * from the original as its keys and the keys from the original as its values.
 * Since a map's values need not be unique but its keys must be,
 * it is acceptable to have any of the original keys as the value in the result.
 * <p>
 * NB: the order of the key/value pairs does not matter
 *
 * @author Alex Golub
 * @since 01-May-21, 3:32 PM
 */
class reverse {
  public static Map<String, Integer> reverse(Map<Integer, String> map) {
    Map<String, Integer> reversed = new HashMap<>();
    for (Map.Entry<Integer, String> e : map.entrySet()) {
      reversed.put(e.getValue(), e.getKey());
    }
    
    return reversed;
  }
}
