package cse_143.cs2_sections.section01_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/removeShorterStrings
 * <p>
 * If there is a tie (both strings have the same length),
 * your method should remove the first string in the pair.
 * If there is an odd number of strings in the list,
 * the final value should be kept in the list.
 *
 * @author Alex Golub
 * @since 21-Apr-21 9:44 PM
 */
class removeShorterStrings {
  public static void removeShorterStrings(List<String> list) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < list.size() - 1; i += 2) {
      String left = list.get(i);
      String right = list.get(i + 1);
      if (left.length() <= right.length()) {
        result.add(right);
      } else {
        result.add(left);
      }
    }
    
    if (list.size() % 2 == 1) {
      result.add(list.get(list.size() - 1));
    }
    
    list.clear();
    list.addAll(result);
  }
}
