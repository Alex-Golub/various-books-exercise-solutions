package CodeStepByStep.java.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/numInCommon
 *
 * @author Alex Golub
 * @since 01-May-21, 11:41 AM
 */
class numInCommon {
  public static int numInCommon(List<Integer> l1, List<Integer> l2) {
    Set<Integer> intersection = new HashSet<>(l1);
    intersection.retainAll(l2);
    return intersection.size();
  }
}
