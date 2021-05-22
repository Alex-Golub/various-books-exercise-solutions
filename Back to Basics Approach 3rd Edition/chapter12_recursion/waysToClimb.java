package chapter12_recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e18-waysToClimb
 * <p>
 * A small stride will move up one stair, and a large stride advances two.
 *
 * @author Alex Golub
 * @since 08-May-21, 1:53 PM
 */
class waysToClimb {
  public static void main(String[] args) {
//    waysToClimb(3);
    waysToClimb(4);
  }
  
  public static void waysToClimb(int n) {
    if (n <= 0) return;
    waysToClimb(n, new ArrayList<>());
  }
  
  private static void waysToClimb(int n, List<Integer> list) {
    if (n < 0) {
      return;
    } else if (n == 0) {
      System.out.println(list);
    } else {
      list.add(1);
      waysToClimb(n - 1, list);
      list.remove(list.size() - 1);
      list.add(2);
      waysToClimb(n - 2, list);
      list.remove(list.size() - 1);
    }
  }
}
