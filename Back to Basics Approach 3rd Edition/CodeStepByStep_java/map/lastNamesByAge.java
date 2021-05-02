package CodeStepByStep.java.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/lastNamesByAge
 *
 * Your method should return a new map with information about people with ages
 * between the min and max, inclusive.
 *
 * @author Alex Golub
 * @since 01-May-21, 9:34 PM
 */
class lastNamesByAge {
  public static TreeMap<Integer, String> lastNamesByAge(Map<String, Integer> nameAge, int minAge, int maxAge) {
    TreeMap<Integer, String> ageNames = new TreeMap<>();
    for (Map.Entry<String, Integer> e : nameAge.entrySet()) {
      String[] nameSplit = e.getKey().split(" "); // full name can be more then one word
      String lastWord = nameSplit[nameSplit.length - 1];
      Integer age = e.getValue();
      
      if (age >= minAge && age <= maxAge) {
        ageNames.compute(age, (k, v) -> v == null ? lastWord : v + " and " + lastWord);
      }
    }
    
    return ageNames;
  }
}
