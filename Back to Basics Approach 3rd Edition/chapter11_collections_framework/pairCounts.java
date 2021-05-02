package chapter11_collections_framework;

import java.util.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e21-pairCounts
 *
 * @author Alex Golub
 * @since 01-May-21, 12:41 AM
 */
class pairCounts {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("banana", "bends", "i", "mend", "sandy"));
    Map<String, Integer> x = pairCounts(list);
    for (var entry : x.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
  
  public static Map<String, Integer> pairCounts(List<String> list) {
    Map<String, Integer> map = new HashMap<>();
    for (String word : list) {
      for (int i = 0; i < word.length() - 1; i++) {
        String pair = word.substring(i, i + 2);
        map.compute(pair, (k, v) -> v == null ? 1 : v + 1);
      }
    }
    
    return map;
  }
}
