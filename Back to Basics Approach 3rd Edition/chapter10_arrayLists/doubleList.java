package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter10/e4-doubleList
 *
 * @author Alex Golub
 * @since 17-Apr-21 3:39 PM
 */
class doubleList {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("how", "are", "you?"));
    doubleList(list);
    System.out.println("list = " + list);
  }

  public static void doubleList(List<String> list) {
    for (int i = list.size() - 1; i >= 0; i--) { // start from end
      list.add(i, list.get(i));
    }

//    for (int i = 0; i < list.size(); i += 2) {
//      list.add(i, list.get(i));
//    }
  }
}
