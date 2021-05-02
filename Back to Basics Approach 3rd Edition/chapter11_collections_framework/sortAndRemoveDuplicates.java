package chapter11_collections_framework;

import java.util.*;

/**
 * Rearranges the list’s elements into sorted ascending order,
 * as well as removing all duplicate values from the list.
 *
 * Use a Set as part of your solution.
 *
 * @author Alex Golub
 * @since 30-Apr-21, 8:41 PM
 */
class sortAndRemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9));
    sortAndRemoveDuplicates(list);
    System.out.println(list);
  }
  
  public static void sortAndRemoveDuplicates(List<Integer> list) {
    Set<Integer> set = new TreeSet<>(list);
    list.clear();
    list.addAll(set);
  }
}
