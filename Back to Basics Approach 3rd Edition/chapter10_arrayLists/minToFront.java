package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter10/e6-minToFront
 *
 * @author Alex Golub
 * @since 17-Apr-21 4:19 PM
 */
class minToFront {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(3, 8, 92, 4, 2, 17, 9));
    minToFront(list);
    System.out.println(list);
  }

  // pre: You may assume that the list stores at least one value.
  // post: same list with first value
  public static void minToFront(List<Integer> list) {
    int minIndex = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < list.get(minIndex)) {
        minIndex = i;
      }
    }

    // min value is not the first element
    // this solution is not efficient because of array list shifting
    // elements
    if (minIndex > 0) {
      Integer minValue = list.remove(minIndex);
      list.add(0, minValue);
    }

    // time efficient solution
//    List<Integer> temp = new ArrayList<>(list.size());
//    temp.add(list.get(minIndex));
//    temp.addAll(1, list.subList(0, minIndex));
//    temp.addAll(minIndex + 1, list.subList(minIndex + 1, list.size()));
//    list.clear();
//    list.addAll(temp);
  }
}
