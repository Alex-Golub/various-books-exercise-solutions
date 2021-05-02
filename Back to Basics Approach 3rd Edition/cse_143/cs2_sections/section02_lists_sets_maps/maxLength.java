package cse_143.cs2_sections.section02_lists_sets_maps;

import java.util.Comparator;
import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/setsandmaps/maxLength
 *
 * @author Alex Golub
 * @since 02-May-21, 8:02 PM
 */
class maxLength {
  public static int maxLength(Set<String> set) {
    return set.stream().max(Comparator.comparingInt(String::length)).orElse("").length();
  }
}
