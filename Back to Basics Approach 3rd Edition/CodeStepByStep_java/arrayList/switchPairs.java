package CodeStepByStep_java.arrayList;

import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/switchPairs
 *
 * @author Alex Golub
 * @since 25-Apr-21, 3:33 PM
 */
class switchPairs {
  public static void switchPairs(List<String> list) {
    for (int i = 1; i < list.size(); i += 2) {
      String temp = list.get(i);
      list.set(i, list.get(i - 1));
      list.set(i - 1, temp);
    }
  }
}
