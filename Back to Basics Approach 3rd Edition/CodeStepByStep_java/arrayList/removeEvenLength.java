package CodeStepByStep_java.arrayList;

import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeEvenLength
 *
 * @author Alex Golub
 * @since 24-Apr-21, 11:16 PM
 */
class removeEvenLength {
  public static void removeEvenLength(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).length() % 2 == 0) {
        list.remove(i);
        i--;
      }
    }
  }
}
