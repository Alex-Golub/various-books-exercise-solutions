package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/deleteDuplicates
 *
 * @author Alex Golub
 * @since 23-Apr-21, 8:37 PM
 */
class deleteDuplicates {
  // pre: list is sorted
  public static void deleteDuplicates(List<String> list) {
    if (list == null || list.size() == 0) {
      return;
    }
    
    List<String> noDup = new ArrayList<>();
    noDup.add(list.get(0));
    for (int i = 1; i < list.size(); i++) {
      if (!list.get(i).equals(list.get(i - 1))) {
        noDup.add(list.get(i));
      }
    }
    
    list.clear();
    list.addAll(noDup);
  }
}
