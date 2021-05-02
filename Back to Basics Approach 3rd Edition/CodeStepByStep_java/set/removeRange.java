package CodeStepByStep.java.set;

import java.util.Set;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/removeRange
 *
 * @author Alex Golub
 * @since 01-May-21, 11:37 AM
 */
class removeRange {
  public static void removeRange(Set<Integer> set, int min, int max) {
    set.removeIf(n -> n >= min && n <= max);
  }
}
