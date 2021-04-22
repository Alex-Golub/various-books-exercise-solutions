package cse_143.cs2_sections.section01_arrayList;

import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/maxLength
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:19 PM
 */
class maxLength {
  public static int maxLength(List<String> list) {
    return list.stream().mapToInt(String::length).max().orElse(0);
  }
}
