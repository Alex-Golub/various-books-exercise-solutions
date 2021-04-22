package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter10/e17-interleave
 *
 * @author Alex Golub
 * @since 19-Apr-21 6:17 PM
 */
class interleave {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
    interleave(list1, list2);
    System.out.println(list1);
  }

  public static void interleave(List<Integer> list1, List<Integer> list2) {
    List<Integer> merged = new ArrayList<>(list1.size() + list2.size());
    int i = 0, j = 0; // pointers indices for each list

    while (i < list1.size() && j < list2.size()) {
      merged.add(list1.get(i));
      merged.add(list2.get(j));
      i++;
      j++;
    }

    // copy leftovers from list1 or list2 if their size were different
    merged.addAll(i + j, list1.subList(i, list1.size()));
    merged.addAll(i + j, list2.subList(j, list2.size()));

    list1.clear();
    list1.addAll(merged);
  }
}
