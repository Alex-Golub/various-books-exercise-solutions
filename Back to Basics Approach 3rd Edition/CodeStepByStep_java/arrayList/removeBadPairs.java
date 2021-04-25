package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeBadPairs
 *
 * If the list has an odd length, the last element is not part of a pair and is
 * also considered "bad;" it should therefore be removed by your method.
 *
 * If an empty list is passed in, the list should still be empty at the end of the call.
 *
 * Constraints: Do not use any other arrays, lists, or
 * other data structures to help solve this problem
 *
 * @author Alex Golub
 * @since 24-Apr-21, 10:46 PM
 */
class removeBadPairs {
  public static void main(String[] args) {
//    List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
    List<Integer> list = new ArrayList<>(Arrays.asList(8, 7, 9));
//    List<Integer> list = new ArrayList<>(Arrays.asList(8));
    removeBadPairs(list);
    System.out.println(list);
  }
  
  public static void removeBadPairs(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i += 2) {
      if (list.get(i) > list.get(i + 1)) {
        list.remove(i);
        list.remove(i);
        i -= 2;
      }
    }
    
    if (list.size() % 2 == 1) {
      list.remove(list.size() - 1);
    }
  }
}
