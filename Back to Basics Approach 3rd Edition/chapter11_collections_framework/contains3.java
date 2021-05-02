package chapter11_collections_framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e12-contains3
 * Use a map as auxiliary storage.
 *
 * @author Alex Golub
 * @since 30-Apr-21, 11:18 PM
 */
class contains3 {
  public static boolean contains3(List<String> list) {
    Map<String, Integer> map = new HashMap<>();
    for (String key : list) {
      map.compute(key, (k, v) -> v == null ? 1 : v + 1);
      if (map.get(key) >= 3) {
        return true;
      }
    }
    
    return false;
  }
}
