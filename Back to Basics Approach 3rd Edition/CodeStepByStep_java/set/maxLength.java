package CodeStepByStep.java.set;

import java.util.Comparator;
import java.util.Set;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/maxLength
 *
 * @author Alex Golub
 * @since 01-May-21, 12:14 PM
 */
class maxLength {
  public static int maxLength(Set<String> set) {
    return set.stream()
              .max(Comparator.comparingInt(String::length))
              .orElse("")
              .length();
  }
}
