package CodeStepByStep_java.arrayList;

import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/cumulative
 *
 * @author Alex Golub
 * @since 23-Apr-21, 8:32 PM
 */
class cumulative {
  public static void cumulative(List<Integer> list) {
    for (int i = 1; i < list.size(); i++) {
      list.set(i, list.get(i - 1) + list.get(i));
    }
  }
}
