package CodeStepByStep.java.map;

import java.util.HashSet;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/hasDuplicateValue
 *
 * @author Alex Golub
 * @since 01-May-21, 2:32 PM
 */
class hasDuplicateValue {
  public static boolean hasDuplicateValue(Map<String, String> map) {
    return map.values().size() != new HashSet<>(map.values()).size();
  }
}
