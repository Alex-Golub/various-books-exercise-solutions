package cse_143.cs2_sections.section01_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/removeDuplicates
 * <p>
 * Takes as a parameter a sorted ArrayList of Strings and that
 * eliminates any duplicates from the list.
 *
 * @author Alex Golub
 * @since 21-Apr-21, 10:25 PM
 */
class removeDuplicates {
  public static void removeDuplicates(List<String> list) {
    if (list == null || list.size() == 0) {
      return;
    }
    
    List<String> noDup = new ArrayList<>();
    noDup.add(list.get(0));
    for (int i = 1; i < list.size(); i++) {
      if (!list.get(i).equals(list.get(i - 1))) {
        noDup.add(list.get(i));
      }
    }
    list.clear();
    list.addAll(noDup);
  }
}
