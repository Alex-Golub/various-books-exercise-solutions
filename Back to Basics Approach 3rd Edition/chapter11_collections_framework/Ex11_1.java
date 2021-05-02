package chapter11_collections_framework;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Alex Golub
 * @since 30-Apr-21, 1:31 PM
 */
class Ex11_1 {
  public static void main(String[] args) {
//    Set<String> names = new HashSet<>();
    Set<String> names = new TreeSet<>();
    names.add("d");
    names.add("b");
    names.add("c");
    names.add("d");
    names.add("e");
    names.add("a");
    names.add("a");
    names.add("c");
    
    System.out.println(names);
  }
}
