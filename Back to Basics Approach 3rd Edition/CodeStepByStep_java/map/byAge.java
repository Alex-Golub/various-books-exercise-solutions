package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/byAge
 * <p>
 * The order of names for a given age should be in alphabetical order
 * If the map passed is empty, or if there are no people in the map
 * between the min/max ages, return an empty map.
 *
 * @author Alex Golub
 * @since 01-May-21, 9:05 PM
 */
class byAge {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Allison", 18);
    map.put("Benson", 48);
    map.put("David", 20);
    map.put("Erik", 20);
    map.put("Galen", 15);
    map.put("Grace", 25);
    map.put("Helene", 40);
    map.put("Janette", 18);
    map.put("Jessica", 35);
    map.put("Marty", 35);
    map.put("Paul", 28);
    map.put("Sara", 15);
    map.put("Stuart", 98);
    map.put("Tyler", 6);
    map.put("Zack", 20);
    
    System.out.println(byAge(map, 16, 25));
  }
  
  public static TreeMap<Integer, String> byAge(Map<String, Integer> nameAge, int minAge, int maxAge) {
    TreeMap<Integer, String> ageName = new TreeMap<>();
    for (Map.Entry<String, Integer> e : nameAge.entrySet()) {
      Integer age = e.getValue();
      String name = e.getKey();
      if (age >= minAge && age <= maxAge) {
        ageName.compute(age, (k, v) -> v == null ? name : v + " and " + name);
      }
    }
    
    return ageName;
  }
}
