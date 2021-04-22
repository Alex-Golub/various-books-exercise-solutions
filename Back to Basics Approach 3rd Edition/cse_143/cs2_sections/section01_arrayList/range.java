package cse_143.cs2_sections.section01_arrayList;

import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/range
 * <p>
 * Returns the range of values contained in the list,
 * which is defined as 1 more than the difference between
 * the largest and smallest elements.
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:22 PM
 */
class range {
  public static int range(List<Integer> list) {
    if (list.size() == 0) {
      return 0;
    }
    
    int[] minMax = {list.get(0), list.get(0)};
    for (int i = 1; i < list.size(); i++) {
      minMax[0] = Math.min(minMax[0], list.get(i));
      minMax[1] = Math.max(minMax[1], list.get(i));
    }
    
    return minMax[1] - minMax[0] + 1;
  }
}
