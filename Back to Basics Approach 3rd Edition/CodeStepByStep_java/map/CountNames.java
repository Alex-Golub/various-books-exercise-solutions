package CodeStepByStep.java.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/CountNames
 *
 * @author Alex Golub
 * @since 01-May-21, 2:44 PM
 */
class CountNames {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Map<String, Integer> map = new LinkedHashMap<>();
    while (true) {
      System.out.print("Enter name: ");
      String name = in.nextLine();
      
      if (name.equals("")) {
        break;
      }
      
      map.compute(name, (k, v) -> v == null ? 1 : v + 1);
    }
  
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      System.out.println("Entry [" + e.getKey() + "] has count " + e.getValue());
    }
  }
}
