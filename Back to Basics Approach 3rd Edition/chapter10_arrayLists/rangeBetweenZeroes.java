package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * returns the number of indexes apart the two farthest
 * occurrences of the number 0 are.
 * If only one 0 occurs in the list, your method should return 1.
 * If no 0s occur, your method should return 0.
 *
 * @author Alex Golub
 * @since 18-Apr-21 7:38 PM
 */
class rangeBetweenZeroes {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(7, 6, 5, 0, 0, 0, 0, 0)); // 5
//    List<Integer> list = new ArrayList<>(Arrays.asList(7, 6, 5, 0, 1, 2, 3, 9)); // 1
//    List<Integer> list = new ArrayList<>(Arrays.asList(0, 6, 5, 2, 1, 2, 3, 9)); // 1
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 5, 2, 1, 2, 3, 0)); // 1
//    List<Integer> list = new ArrayList<>(Arrays.asList(7, 6, 5, 8, 1, 2, 3, 5)); // 0
    System.out.println(rangeBetweenZeroes(list));
  }

  public static int rangeBetweenZeroes(List<Integer> list) {
    int left = list.indexOf(0);
    int right = list.lastIndexOf(0);
    return left == -1 && right == -1 ? 0 : right - left + 1;
  }
}
