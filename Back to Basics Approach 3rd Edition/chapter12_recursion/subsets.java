package chapter12_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e20-subsets
 *
 * A sub-list of a list L contains 0 or more of L's elements.
 * The order in which you show the sub-lists does not matter, but the order of
 * the elements of each sub-list DOES matter
 * Notice that the empty list is considered one of these sub-lists.
 * You may assume that the list passed to your method is not null
 * and that the list contains no duplicates.
 *
 * @author Alex Golub
 * @since 08-May-21, 2:37 PM
 */
class subsets {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Janet", "Robert", "Morgan", "Char"));
    subsets(list);
  }
  
  public static void subsets(List<String> list) {
    subsets(list, 0, list.size());
  }
  
  private static void subsets(List<String> list, int start, int end) {
    if (end == 0) {
      System.out.println(list);
    } else {
      subsets(list, start + 1, end - 1); // steps to base case
      String remove = list.remove(start); // choose i.e. remove
      subsets(list, start, end - 1); // explore
      list.add(start, remove); // un-choose i.e. put it back
    }
  }
}

/*
f(["j", "r", "n", "c"], 0, 4) -> f(["j", "r", "n", "c"], 1, 3)
  f(["j", "r", "n", "c"], 1, 3) -> f(["j", "r", "n", "c"], 2, 2)
    f(["j", "r", "n", "c"], 2, 2) -> f(["j", "r", "n", "c"], 3, 1)
      f(["j", "r", "n", "c"], 3, 1) -> f(["j", "r", "n", "c"], 4, 0)
        f(["j", "r", "n", "c"], 4, 0) -> ["j", "r", "n", "c"]
      f(["j", "r", "n", "c"], 3, 1) -> remove = "c"; f(["j", "r", "n", 3, 0)
        f(["j", "r", "n"], 3, 0) -> ["j", "r", "n"]
      f(["j", "r", "n", "c"], 3, 1) -> remove = "c"; list = ["j", "r", "n"]; ["j", "r", "n", "c"]
    f(["j", "r", "n", "c"], 2, 2) -> remove = "n"; list = ["j", "r", "c"]; f(["j", "r", "c"], 2, 1)
      f(["j", "r", "c"], 2, 1) -> f(["j", "r", "c"], 3, 0)
        f(["j", "r", "c"], 3, 0) -> ["j", "r", "c"]
      f(["j", "r", "c"], 2, 1) -> ["j", "r", "c"]; remove = "c"; f(["j", "r"], 2, 0)
        f(["j", "r"], 2, 0) -> ["j", "r"]
      f(["j", "r", "c"], 2, 1) -> ["j", "r", "c"]; remove = "c"; ["j", "r"]; list = ["j", "r", "c"]
    f(["j", "r", "n", "c"], 2, 2) -> remove = "n"; list = ["j", "r", "c"]; f(["j", "r", "c"], 2, 1)
*/
