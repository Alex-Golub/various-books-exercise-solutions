package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/4235?categoryid=328
 *
 * @author Alex Golub
 * @since 02-May-21, 2:52 PM
 */
class acronymFor {
  public static String acronymFor(List<String> list) {
    StringBuilder sb = new StringBuilder();
    for (String s : list) {
      sb.append(Character.toUpperCase(s.charAt(0)));
    }
    
    return sb.toString();
  }
}
