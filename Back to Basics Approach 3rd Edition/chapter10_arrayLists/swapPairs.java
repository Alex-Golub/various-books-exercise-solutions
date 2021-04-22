package chapter10_arrayLists;

import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter10/e2-swapPairs
 *
 * Switches the order of values in an ArrayList of Strings in a pairwise fashion.
 * If there are an odd number of values in the list, the final element is not moved.
 *
 * @author Alex Golub
 * @since 17-Apr-21 2:24 PM
 */
class swapPairs {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("four", "score", "and", "seven", "years", "ago");
    swapPairs(list);
    System.out.println(list);

    list = Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet");
    swapPairs(list);
    System.out.println(list);
  }

  public static void swapPairs(List<String> list) {
    for (int i = 1; i < list.size(); i += 2) {
      String temp = list.get(i - 1);
      list.set(i - 1, list.get(i));
      list.set(i, temp);
    }
  }
}
