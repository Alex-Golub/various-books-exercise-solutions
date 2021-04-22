package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter10/e10-removeInRange
 * <p>
 * Remove all occurrences of the given element that appear in the
 * list between the starting index (inclusive) and the ending index (exclusive).
 * Other values and occurrences of the given value that appear outside
 * the given index range are not affected.
 *
 * @author Alex Golub
 * @since 18-Apr-21 7:48 PM
 */
class removeInRange {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16));
    removeInRange(list, 0, 5, 13);
    System.out.println(list);

    List<String> stringList = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "that", "is", "the", "question"));
    removeInRange(stringList, "free", "rich");
    System.out.println(stringList); // ["to", "be", "to", "be", "that", "the"]
  }

  public static void removeInRange(List<Integer> list, int valueToRemove, int start, int end) {
    if (end < start) {
      return;
    }

    List<Integer> temp = new ArrayList<>(list.subList(0, start));
    for (int i = start; i < end; i++) {
      if (list.get(i) != valueToRemove) {
        temp.add(list.get(i));
      }
    }

    temp.addAll(list.subList(end, list.size()));
    list.clear();
    list.addAll(temp);
  }

  /**
   * Removes from the list any strings that fall alphabetically between the start and end strings.
   * pre: start string alphabetically precedes the ending string.
   */
  public static void removeInRange(List<String> list, String start, String end) {
    // filter words that only outside or equals to the start and end ranges
    List<String> temp = list.stream()
                            .filter(word -> word.compareTo(start) <= 0 || word.compareTo(end) >= 0)
                            .collect(Collectors.toList());
    list.clear();
    list.addAll(temp);
  }
}
