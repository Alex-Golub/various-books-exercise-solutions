package CodeStepByStep_java.arrayList;

import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/twice
 *
 * @author Alex Golub
 * @since 25-Apr-21, 3:37 PM
 */
class twice {
  public static void twice(List<String> list) {
    list.addAll(list);
  }
}
