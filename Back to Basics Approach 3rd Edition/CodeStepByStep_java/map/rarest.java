package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/rarest
 *
 * Returns the value that occurs least frequently in the map.
 * If there is a tie, return the value that comes earlier in ABC order.
 *
 * @author Alex Golub
 * @since 02-May-21, 9:58 AM
 */
class rarest {
  public static void main(String[] args) {
    Map<String, String> map = new TreeMap<>();
    map.put("Alyssa", "Harding");
    map.put("Char", "Smith");
    map.put("Dan", "Smith");
    map.put("Jeff", "Jones");
    map.put("Kasey", "Jones");
    map.put("Kim", "Smith");
    map.put("Morgan", "Jones");
    map.put("Ryan", "Smith");
    map.put("Stef", "Harding");
  
    System.out.println(rarest(map));
  }
  
  public static String rarest(Map<String, String> map) {
    if (map == null || map.size() == 0) {
      throw new IllegalArgumentException();
    }
    
    Map<String, Integer> lastCount = new HashMap<>();
    for (String value : map.values()) {
      lastCount.compute(value, (k, v) -> v == null ? 1 : v + 1);
    }
    
    String rarest = "";
    Integer minCountSoFar = Integer.MAX_VALUE;
    for (Map.Entry<String, Integer> e : lastCount.entrySet()) {
      String lName = e.getKey();
      Integer count = e.getValue();
      
      if (count.compareTo(minCountSoFar) < 0) {
        minCountSoFar = count;
        rarest = lName;
      } else if (count.equals(minCountSoFar)) {
        rarest = rarest.compareTo(lName) < 0 ? rarest : lName;
      }
    }
    
    return rarest;
  }
}
