package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/rarestAge
 *
 * returns the least frequently occurring age.
 * If there is a tie (two or more rarest ages that occur the same number of times),
 * return the youngest age among them.
 *
 * @author Alex Golub
 * @since 01-May-21, 3:54 PM
 */
class rarestAge {
  public static Integer rarestAge(Map<String, Integer> nameAge) {
    if (nameAge == null || nameAge.size() == 0) {
      return 0;
    }
    
    Map<Integer, Integer> ageOccur = new HashMap<>();
    for (Integer age : nameAge.values()) {
      ageOccur.compute(age, (k, v) -> v == null ? 1 : v + 1);
    }
    
    Integer minAge = Integer.MAX_VALUE;
    Integer minOccur = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> e : ageOccur.entrySet()) {
      Integer occurrences = e.getValue();
      Integer age = e.getKey();
      
      if (occurrences < minOccur) {
        minOccur = occurrences;
        minAge = age;
      } else if (occurrences.equals(minOccur)) {
        minAge = Math.min(minAge, age);
      }
    }
    
    return minAge;
  }
}
