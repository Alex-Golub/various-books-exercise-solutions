package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Golub
 * @since 19-Apr-21 5:54 PM
 */
class reverse3 {
  public static void main(String[] args) {
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
//    List<Integer> list = new ArrayList<>(Arrays.asList(1));
    List<Integer> list = new ArrayList<>();
    reverse3(list);
    System.out.println(list);
  }

  public static void reverse3(List<Integer> list) {
    for (int i = 0; i < list.size() - 2; i += 3) {
      Integer temp = list.get(i);
      list.set(i, list.get(i + 2));
      list.set(i + 2, temp);
    }
  }
}
