package chapter11_collections_framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Alex Golub
 * @since 30-Apr-21, 11:48 PM
 */
class is1to1 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Marty", "206–9024");
    map.put("Hawking", "123–4567");
    map.put("Smith", "949–0504");
//    map.put("Newton", "123–4567");
  
    System.out.println(is1to1(map));
  }
  
  //  returns true if no two keys map to the same value.
  public static boolean is1to1(Map<String, String> map) {
    return map.values().size() == new HashSet<>(map.values()).size();
  }
}
