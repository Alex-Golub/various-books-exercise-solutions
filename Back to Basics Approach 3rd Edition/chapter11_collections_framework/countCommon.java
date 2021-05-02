package chapter11_collections_framework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e7-countCommon
 * Use one or more Sets as storage to help you solve this problem.
 *
 * @author Alex Golub
 * @since 30-Apr-21, 8:47 PM
 */
class countCommon {
  // returns the number of unique integers that occur in both lists
  public static int countCommon(List<Integer> list1, List<Integer> list2) {
    Set<Integer> intersection = new HashSet<>(list1);
    intersection.retainAll(list2);
    return intersection.size();
  }
}
