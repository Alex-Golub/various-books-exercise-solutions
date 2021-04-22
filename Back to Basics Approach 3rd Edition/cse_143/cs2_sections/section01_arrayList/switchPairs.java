package cse_143.cs2_sections.section01_arrayList;

import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/switchPairs
 * <p>
 * If there are an odd number of values in the list, the final element is not moved.
 *
 * @author Alex Golub
 * @since 21-Apr-21 10:14 PM
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
