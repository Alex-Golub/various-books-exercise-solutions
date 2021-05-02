package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/setsandmaps/removeEvenLength
 *
 * @author Alex Golub
 * @since 02-May-21, 8:03 PM
 */
class removeEvenLength {
  public static void removeEvenLength(Set<String> set) {
    set.removeIf(s -> s.length() % 2 == 0);
  }
}
