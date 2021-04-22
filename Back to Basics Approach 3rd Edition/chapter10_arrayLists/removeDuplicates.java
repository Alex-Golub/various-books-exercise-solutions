package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter10/e7-removeDuplicates
 *
 * @author Alex Golub
 * @since 17-Apr-21 4:41 PM
 */
class removeDuplicates {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("be", "be", "is", "not",
                                                      "or", "question", "that",
                                                      "the", "to", "to"));
    removeDuplicates(list);
    System.out.println(list);
  }

  /**
   * Eliminate duplicated from the list
   * @param list of sorted String values
   */
  public static void removeDuplicates(List<String> list) {
    if (list.size() == 0) {
      return;
    }

    List<String> noDup = new ArrayList<>();
    noDup.add(list.get(0));
    for (int i = 1; i < list.size(); i++) {
      if (!list.get(i).equals(list.get(i - 1))) {
        noDup.add(list.get(i));
      }
    }


    list.clear();
    list.addAll(noDup);
  }
}
