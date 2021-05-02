package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/hasThree
 *
 * @author Alex Golub
 * @since 01-May-21, 3:19 PM
 */
class hasThree {
  public static boolean hasThree(List<String> list) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : list) {
      map.compute(s, (k, v) -> v == null ? 1 : v + 1);
      if (map.get(s) == 3) {
        return true;
      }
    }
    
    return false;
  }
}
