package chapter11_collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Rearranges (partitions) the list so that all the elements with values less
 * than E occur before all elements with values greater than E.
 * Assume that the list contains no duplicates and does not contain the element value E.
 *
 * @author Alex Golub
 * @since 30-Apr-21, 8:17 PM
 */
class partition {
  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>(Arrays.asList(15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9));
    partition(list, 21);
    System.out.println(list);
  }
  
  public static void partition(List<Integer> list, int e) {
    List<Integer> smaller = new ArrayList<>();
    List<Integer> greater = new ArrayList<>();
    for (Integer n : list) {
      if (n >= e) {
        greater.add(n);
      } else {
        smaller.add(n);
      }
    }
    
    list.clear();
    list.addAll(smaller);
    list.addAll(greater);
  }
}
