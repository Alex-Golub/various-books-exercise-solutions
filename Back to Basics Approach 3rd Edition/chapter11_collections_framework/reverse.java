package chapter11_collections_framework;

import java.util.HashMap;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e18-reverse
 *
 * @author Alex Golub
 * @since 01-May-21, 12:01 AM
 */
class reverse {
  public static Map<String, Integer> reverse(Map<Integer, String> map) {
    Map<String, Integer> reverse = new HashMap<>();
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      reverse.put(entry.getValue(), entry.getKey());
    }
    
    return reverse;
  }
}
