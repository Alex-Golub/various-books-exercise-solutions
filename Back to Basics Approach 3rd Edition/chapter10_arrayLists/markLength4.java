package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter10/e12-markLength4
 *
 * places a string of four asterisks "****" in front of every string of length 4.
 *
 * @author Alex Golub
 * @since 19-Apr-21 10:51 AM
 */
class markLength4 {
  public static void markLength4(List<String> list) {
    List<String> result = new ArrayList<>(list.size());
    for (String s : list) {
      if (s.length() == 4) {
        result.add("****");
      }
      result.add(s);
    }

    list.clear();
    list.addAll(result);
  }
}
