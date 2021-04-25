package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/repeat
 *
 * @author Alex Golub
 * @since 24-Apr-21, 11:27 PM
 */
class repeat {
  /**
   * Shifting with each add method
   */
//  public static void repeat(List<String> list, int k) {
//    if (k <= 0) { // If k is 0 or negative, the list should be empty after the call
//      list.clear();
//      return;
//    }
//
//    for (int i = 0; i < list.size(); i++) {
//      int t = k;
//      while (--t > 0) {
//        list.add(i, list.get(i));
//      }
//      i += k - 1;
//    }
//  }
  
  /**
   * Using extra space but faster because no shifting required
   */
  public static void repeat(List<String> list, int k) {
    if (k <= 0) {
      list.clear();
      return;
    }
    
    List<String> temp = new ArrayList<>();
    for (String s : list) {
      int t = k;
      while (t-- > 0) {
        temp.add(s);
      }
    }
    
    list.clear();
    list.addAll(temp);
  }
}
