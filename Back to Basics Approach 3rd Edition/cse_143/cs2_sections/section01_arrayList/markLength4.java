package cse_143.cs2_sections.section01_arrayList;

import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/markLength4
 *
 * @author Alex Golub
 * @since 21-Apr-21, 10:40 PM
 */
class markLength4 {
  public static void markLength4(List<String> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
      if (list.get(i).length() == 4) {
        list.add(i, "****");
      }
    }
  }
}