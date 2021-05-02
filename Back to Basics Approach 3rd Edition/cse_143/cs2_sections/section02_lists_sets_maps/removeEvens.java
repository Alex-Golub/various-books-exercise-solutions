package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://practiceit.cs.washington.edu/problem/view/4245?categoryid=328
 *
 * @author Alex Golub
 * @since 02-May-21, 3:03 PM
 */
class removeEvens {
  public static Set<Integer> removeEvens(Set<Integer> set) {
    Set<Integer> evens = set.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
    set.removeAll(evens); // set now contain only odds
    return evens;
  }
}
