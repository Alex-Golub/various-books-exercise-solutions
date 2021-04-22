package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Replaces every integer of value k with k copies of itself.
 * [4, 1, 2, 0, 3] => [4, 4, 4, 4, 1, 2, 2, 3, 3, 3]
 * NB: Zeroes and negative numbers should be removed from the list by this method.
 *
 * @author Alex Golub
 * @since 17-Apr-21 3:58 PM
 */
class scaleByK {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 2, 0, 3));
//    List<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 2, 3));
//    List<Integer> list = new ArrayList<>(Arrays.asList(-5, -3, -2, 1));
//    List<Integer> list = new ArrayList<>(Arrays.asList(-5, -3, -2, 0));
//    List<Integer> list = new ArrayList<>(Arrays.asList(-5));
//    List<Integer> list = new ArrayList<>();
//    List<Integer> list = null;
    scaleByK(list);
    System.out.println("after scaleByK = " + list);
  }

  public static void scaleByK(List<Integer> list) {
    if (list == null || list.size() == 0) {
      return;
    }

    List<Integer> result = new ArrayList<>();
    for (int k : list) {
      if (k > 0) { // consider only +ve numbers
        int times = k; // k present one time, add it k - 1 times more

        while (times-- > 0) {
          result.add(k);
        }
      }
    }

    list.clear();
    list.addAll(result);
  }
}
