package chapter11_collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e2-alternate
 *
 * @author Alex Golub
 * @since 30-Apr-21, 1:44 PM
 */
class alternate {
  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<>(Arrays.asList());
    List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
    List<Integer> alternate = alternate(l1, l2);
    System.out.println(alternate);
  }
  
  // containing alternating elements from the two lists
  public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
    List<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < list1.size() && j < list2.size()) {
      result.add(list1.get(i++));
      result.add(list2.get(j++));
    }
    
    result.addAll(list1.subList(i, list1.size()));
    result.addAll(list2.subList(j, list2.size()));
    
    return result;
  }
}
