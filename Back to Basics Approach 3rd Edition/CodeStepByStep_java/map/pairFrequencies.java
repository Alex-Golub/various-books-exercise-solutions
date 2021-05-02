package CodeStepByStep.java.map;

import java.util.*;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/pairFrequencies
 *
 * @author Alex Golub
 * @since 01-May-21, 9:43 PM
 */
class pairFrequencies {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>(Arrays.asList("banana", "bends", "i", "mend", "sandy"));
    pairFrequencies(set);
  }
  
  public static void pairFrequencies(Set<String> set) {
    Map<String, Integer> map = new TreeMap<>();
    for (String word : set) {
      for (int i = 0; i < word.length() - 1; i++) {
        String pair = word.substring(i, i + 2);
        map.compute(pair, (k, v) -> v == null ? 1 : v + 1);
      }
    }
    
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      System.out.println(e.getKey() + ": " + e.getValue());
    }
  }
}
