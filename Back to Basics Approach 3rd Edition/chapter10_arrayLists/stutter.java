package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter10/e11-stutter
 *
 * @author Alex Golub
 * @since 19-Apr-21 10:45 AM
 */
class stutter {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("how", "are", "you?"));
//    stutter(list, 4);
//    stutter(list, 1);
//    stutter(list, 0);
    stutter(list, -1);
    System.out.println(list);
  }

  public static void stutter(List<String> list, int k) {
    List<String> result = new ArrayList<>();
    for (String s : list) {
      for (int t = 0; t < k; t++) {
        result.add(s);
      }
    }

    list.clear();
    list.addAll(result);
  }
}
