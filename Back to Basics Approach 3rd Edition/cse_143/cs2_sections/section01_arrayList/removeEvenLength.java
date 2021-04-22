package cse_143.cs2_sections.section01_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/removeEvenLength
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:38 PM
 */
class removeEvenLength {
  public static void removeEvenLength(List<String> list) {
    List<String> noEvenLength = new ArrayList<>();
    for (String s : list) {
      if (s.length() % 2 == 1) {
        noEvenLength.add(s);
      }
    }
    
    list.clear();
    list.addAll(noEvenLength);
  }
}
