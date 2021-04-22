package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter10/e18-mirror
 *
 * Produces a mirrored copy of the list as output,
 * with the original values followed by those same
 * values in the opposite order.
 *
 * @author Alex Golub
 * @since 19-Apr-21 6:47 PM
 */
class mirror {
  public static void main(String[] args) {
//    List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
//    List<String> list = new ArrayList<>(List.of("a", "b", "c"));
//    List<String> list = new ArrayList<>(List.of("a"));
    List<String> list = new ArrayList<>();
    mirror(list);
    System.out.println(list);
  }

  public static void mirror(List<String> list) {
    List<String> mirror = new ArrayList<>(list.size() * 2);
    for (int i = 0; i < list.size(); i++) {
      mirror.add(i, list.get(i));
      mirror.add(i + 1, list.get(i));
    }
    list.clear();
    list.addAll(mirror);
  }

  //             2
  // ['a', 'b', 'c', 'c', 'b', 'a']
}
