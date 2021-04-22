package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Eliminates any occurrences of the number 0 from the list.
 *
 * @author Alex Golub
 * @since 18-Apr-21 7:31 PM
 */
class removeZeroes {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(4, 6, 0, 5, 3, 0, 0, 5));
    removeZeroes(list);
    System.out.println(list);
  }

  public static void removeZeroes(List<Integer> list) {
    List<Integer> collect = list.stream().filter(n -> n != 0).collect(Collectors.toList());
    list.clear();
    list.addAll(collect);
  }
}
