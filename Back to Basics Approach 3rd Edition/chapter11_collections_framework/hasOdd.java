package chapter11_collections_framework;

import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e9-hasOdd
 *
 * @author Alex Golub
 * @since 30-Apr-21, 8:58 PM
 */
class hasOdd {
  // returns true if the set contains at least one odd integer
  public static boolean hasOdd(Set<Integer> set) {
    return set.stream().anyMatch(n -> n % 2 == 1);
  }
  
//  public static boolean hasOdd(Set<Integer> set) {
//    for (Integer i : set) {
//      if (i % 2 == 1) {
//        return true;
//      }
//    }
//    return false;
//  }
}
