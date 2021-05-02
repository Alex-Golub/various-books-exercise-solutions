package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/4275?categoryid=328
 *
 * @author Alex Golub
 * @since 02-May-21, 2:58 PM
 */
class stutter {
  public static void stutter(List<Integer> list) {
    List<Integer> temp = new ArrayList<>(list.size() * 2);
    for (Integer i : list) {
      temp.add(i);
      temp.add(i);
    }
    
    list.clear();
    list.addAll(temp);
  }
}
