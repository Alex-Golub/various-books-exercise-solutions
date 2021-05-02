package CodeStepByStep.java.set;

import java.util.HashSet;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/numUniqueValues
 *
 * @author Alex Golub
 * @since 01-May-21, 11:40 AM
 */
class numUniqueValues {
  public static int numUniqueValues(List<Integer> list) {
    return new HashSet<>(list).size();
  }
}
