package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeAll
 *
 * @author Alex Golub
 * @since 24-Apr-21, 10:04 PM
 */
class removeAll {
  public static void removeAll(List<String> list, String v) {
    List<String> temp = new ArrayList<>();
    for (String s : list) {
      if (!s.equals(v)) {
        temp.add(s);
      }
    }
    
    list.clear();
    list.addAll(temp);
  }
}
