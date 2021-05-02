package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/getMajorityLastName
 *
 * @author Alex Golub
 * @since 01-May-21, 3:40 PM
 */
class getMajorityLastName {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Hal", "Perkins");
    map.put("Mark", "Smith");
    map.put("Mike", "Smith");
    map.put("Stuart", "Reges");
    map.put("David", "Smith");
    map.put("Jean", "Reges");
    map.put("Geneva", "Smith");
    map.put("Amie", "Smith");
    map.put("Bruce", "Reges");
    
    getMajorityLastName(map);
  }
  
  public static String getMajorityLastName(Map<String, String> firstLast) {
    Map<String, Double> statistics = new HashMap<>();
    for (String value : firstLast.values()) {
      double v1 = 1.0 / firstLast.values().size();
      statistics.compute(value, (k, v) ->  v == null ? v1 : v1 + v);
      
      if (statistics.get(value) > 0.5) {
        return value;
      }
    }
    
    for (var e : statistics.entrySet()) {
      System.out.println(e.getKey() + " : " + e.getValue());
    }
    
    return "?";
  }
}
