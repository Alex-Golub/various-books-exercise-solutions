package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter10/e14-removeShorterStrings
 *
 * If there is a tie (both strings have the same length),
 * your method should remove the first string in the pair.
 * If there is an odd number of strings in the list,
 * the final value should be kept in the list.
 *
 * @author Alex Golub
 * @since 19-Apr-21 5:58 PM
 */
class removeShorterStrings {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
    removeShorterStrings(list);
    System.out.println(list);
  }

  public static void removeShorterStrings(List<String> list) {
    List<String> result = new ArrayList<>();
    for (int i = 1; i < list.size(); i += 2) {
      String left = list.get(i - 1);
      String right = list.get(i);
      result.add(left.length() <= right.length() ? right : left);
    }

    if (list.size() % 2 != 0) {
      result.add(list.get(list.size() - 1));
    }

    list.clear();
    list.addAll(result);
  }
}
