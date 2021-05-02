package chapter11_collections_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Alex Golub
 * @since 30-Apr-21, 1:37 PM
 */
class Ex11_2 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    System.out.println("Enter words (-1 to exit)");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String in = scanner.next();
      if (in.equals("-1")) {
        break;
      }
  
      map.compute(in, (k, v) -> v == null ? 1 : v + 1);
    }
  
    System.out.println(map);
  
    System.out.println(new TreeMap<>(map));
  }
}
