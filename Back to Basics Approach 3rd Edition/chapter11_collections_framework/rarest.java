package chapter11_collections_framework;

import java.util.HashMap;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e19-rarest
 *
 * @author Alex Golub
 * @since 01-May-21, 12:05 AM
 */
class rarest {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Alyssa", 22);
    map.put("Char", 25);
    map.put("Dan", 25);
    map.put("Jeff", 20);
    map.put("Kasey", 20);
    map.put("Kim", 20);
    map.put("Mogran", 25);
    map.put("Ryan", 25);
    map.put("Stef", 22);
  
    System.out.println(rarest(map));
  }
  
  public static int rarest(Map<String, Integer> map) {
    if (map == null || map.size() == 0) {
      throw new RuntimeException();
    }
    
    Map<Integer, Integer> occurrences = new HashMap<>();
    for (Integer key : map.values()) {
      occurrences.compute(key, (k, v) -> v == null ? 1 : v + 1);
    }
    
    int rarest = Integer.MAX_VALUE;
    int occurred = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
      if (entry.getValue() < occurred) {
        occurred = entry.getValue();
        rarest = entry.getKey();
      } else if (entry.getValue() == occurred) { // tie, return the youngest age among them
        rarest = Math.min(entry.getKey(), rarest);
      }
    }
    
    return rarest;
  }
}
