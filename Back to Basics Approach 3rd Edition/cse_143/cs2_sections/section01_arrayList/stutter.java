package cse_143.cs2_sections.section01_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/stutter
 *
 * @author Alex Golub
 * @since 21-Apr-21 9:41 PM
 */
class stutter {
  public static void stutter(List<String> list) {
    List<String> result = new ArrayList<>(list.size() * 2);
    for (String s : list) {
      result.add(s);
      result.add(s);
    }
    list.clear();
    list.addAll(result);
  }
}