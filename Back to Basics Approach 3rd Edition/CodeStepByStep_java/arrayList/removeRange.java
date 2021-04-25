package CodeStepByStep_java.arrayList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeRange
 *
 * removes all elements values in the range min through max (inclusive).
 *
 * @author Alex Golub
 * @since 24-Apr-21, 11:19 PM
 */
class removeRange {
//  public static void removeRange(List<Integer> list, int min, int max) {
//    for (int i = 0; i < list.size(); i++) {
//      int v = list.get(i);
//      if (v >= min && v <= max) {
//        list.remove(i);
//        i--;
//      }
//    }
//  }
  
  /**
   * Using extra space but faster because now shifting occur
   */
  public static void removeRange(List<Integer> list, int min, int max) {
    List<Integer> collect = list.stream()
                                .filter(v -> v < min || v > max)
                                .collect(Collectors.toList());
    list.clear();
    list.addAll(collect);
  }
}
