package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. replaces each pair of strings with a single string that consists of
 *    the two original strings in parentheses separated by a space.
 * 2. If the list is of odd length, the final element is unchanged.
 *
 * @author Alex Golub
 * @since 19-Apr-21 6:11 PM
 */
class clump {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago", "our"));
//    List<String> list = new ArrayList<>(Arrays.asList("four", "score", "and", "seven"));
//    List<String> list = new ArrayList<>(Arrays.asList("four", "score"));
//    List<String> list = new ArrayList<>(Arrays.asList("four"));
//    List<String> list = new ArrayList<>();
    clump(list);
    System.out.println(list);
  }

  public static void clump(List<String> list) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < list.size() - 1; i += 2) {
      String left = list.get(i);
      String right = list.get(i + 1);
      result.add("(" + left + " " + right + ")");
    }

    if (list.size() % 2 != 0) { // if size is odd
      result.add(list.get(list.size() - 1));
    }

    list.clear();
    list.addAll(result);
  }
}
