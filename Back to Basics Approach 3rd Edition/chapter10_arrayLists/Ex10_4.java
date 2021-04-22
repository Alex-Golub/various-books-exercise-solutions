package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alex Golub
 * @since 17-Apr-21 3:01 PM
 */
class Ex10_4 {
  public static void main(String[] args) {
    List<String> list1 = Arrays.asList("a", "b", "c", "d", "e");
//    List<String> list1 = Arrays.asList("a", "b", "c", "d");
//    List<String> list1 = Arrays.asList("a");
//    List<String> list1 = Arrays.asList("");
//    List<String> list1 = new ArrayList<>();
//    List<String> list1 = null;
    List<String> list2 = Arrays.asList("1", "2", "3");

    // merged such that after every element of the first list,
    // the entire second list is added.
    if (list1 != null) {
      List<String> merged = new ArrayList<>(list1);
      for (int i = 1; i <= merged.size(); i += list2.size() + 1) {
        merged.addAll(i, list2);
      }

      System.out.println(merged);
    }
  }
}
