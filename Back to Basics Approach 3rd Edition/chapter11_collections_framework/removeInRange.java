package chapter11_collections_framework;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e3-removeInRange
 *
 * @author Alex Golub
 * @since 30-Apr-21, 8:06 PM
 */
class removeInRange {
  public static void removeInRange(List<Integer> list, int value, int left, int right) {
    if (left > right) {
      return;
    }
    
    List<Integer> temp = new ArrayList<>(list.subList(0, left));
    for (int i = left; i < right; i++) {
      if (list.get(i) != value) {
        temp.add(list.get(i));
      }
    }
    temp.addAll(list.subList(right, list.size()));
    
    list.clear();
    list.addAll(temp);
  }
}
