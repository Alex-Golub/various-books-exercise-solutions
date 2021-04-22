package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter10/e15-filterRange
 *
 * If no elements in range min-max are found in the list,
 * the list's contents are unchanged.
 * If an empty list is passed, the list remains empty.
 * You may assume that the list is not null.
 *
 * @author Alex Golub
 * @since 19-Apr-21 6:06 PM
 */
class filterRange {
  public static void main(String[] args) {
//    List<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7));
    List<Integer> list = new ArrayList<>(Arrays.asList(4, 8));
//    List<Integer> list = new ArrayList<>(Arrays.asList(6));
//    List<Integer> list = new ArrayList<>();
    filterRange(list, 5, 7);
    System.out.println(list);
  }

  public static void filterRange(List<Integer> list, int min, int max) {
    List<Integer> result = new ArrayList<>();
    for (Integer i : list) {
      if (i < min || i > max) {
        result.add(i);
      }
    }

    list.clear();
    list.addAll(result);
  }
}
