package chapter11_collections_framework;

import java.util.Comparator;
import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e8-maxLength
 *
 * @author Alex Golub
 * @since 30-Apr-21, 8:53 PM
 */
class maxLength {
  public static int maxLength(Set<String> set) {
    return set.stream()
              .max(Comparator.comparingInt(String::length))
              .orElse("")
              .length();
  }
  
//  public static int maxLength(Set<String> set) {
//    String maxSoFar = "";
//    for (String s : set) {
//      if (s.length() > maxSoFar.length()) {
//        maxSoFar = s;
//      }
//    }
//
//    return maxSoFar.length();
//  }
}
