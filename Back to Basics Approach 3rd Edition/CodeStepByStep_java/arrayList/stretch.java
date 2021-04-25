package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/stretch
 *
 * @author Alex Golub
 * @since 25-Apr-21, 12:16 AM
 */
class stretch {
  public static void stretch(List<Integer> list) {
    List<Integer> temp = new ArrayList<>(list.size() * 2);
    for (int i : list) {
      int half = i / 2;
      temp.add(i - half);
      temp.add(half);
    }
    
    list.clear();
    list.addAll(temp);
  }
}
