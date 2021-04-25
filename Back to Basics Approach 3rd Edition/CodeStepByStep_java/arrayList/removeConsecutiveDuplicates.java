package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeConsecutiveDuplicates
 *
 * @author Alex Golub
 * @since 24-Apr-21, 11:01 PM
 */
class removeConsecutiveDuplicates {
  
  /**
   * Without using extra space but, shifting occurs with every remove
   */
//  public static void removeConsecutiveDuplicates(List<Integer> list) {
//    for (int i = 0; i < list.size() - 1; i++) {
//      if (list.get(i).equals(list.get(i + 1))) {
//        list.remove(i);
//        i--;
//      }
//    }
//  }
  
  /**
   * Using extra space but without causing shifting makes this method faster
   */
  public static void removeConsecutiveDuplicates(List<Integer> list) {
    if (list == null || list.size() == 0) {
      return;
    }
    
    List<Integer> temp = new ArrayList<>();
    temp.add(list.get(0));
    for (int i = 1; i < list.size(); i++) {
      if (!list.get(i - 1).equals(list.get(i))) {
        temp.add(list.get(i));
      }
    }
    
    list.clear();
    list.addAll(temp);
  }
}
