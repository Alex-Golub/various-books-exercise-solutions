package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/leastCommon
 *
 * @author Alex Golub
 * @since 01-May-21, 2:35 PM
 */
class leastCommon {
  public static int leastCommon(Map<String, Integer> map) {
    if (map == null || map.size() == 0) {
      throw new IllegalArgumentException();
    }
    
    Map<Integer, Integer> ageCount = new HashMap<>();
    for (Integer age : map.values()) {
      ageCount.compute(age, (k, v) -> v == null ? 1 : v + 1);
    }
  
    int minAge = Integer.MAX_VALUE;
    int occur = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> e : ageCount.entrySet()) {
      Integer value = e.getValue();
      Integer key = e.getKey();
      
      if (value < occur) {
        minAge = key;
        occur = value;
      } else if (value.equals(occur)) { // If there is a tie, return the smaller integer value
        minAge = Math.min(minAge, key);
      }
    }
    
    return minAge;
  }
}
