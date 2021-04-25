package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/mirror
 *
 * @author Alex Golub
 * @since 24-Apr-21, 9:52 PM
 */
class mirror {
  public ArrayList<String> mirror(List<String> list) {
    ArrayList<String> mirror = new ArrayList<>(list);
    for (int i = list.size() - 1; i >= 0; i--) {
      list.add(list.get(i));
    }
    
    return mirror;
  }
}
