package CodeStepByStep.java.set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/removeDuplicates
 *
 * Note that the elements of the list are not in any particular order,
 * so the duplicates might not occur consecutively.
 * You should retain the original relative order of the elements.
 *
 * @author Alex Golub
 * @since 01-May-21, 12:17 PM
 */
class removeDuplicates {
  public static void removeDuplicates(List<Integer> list) {
    Set<Integer> set = new LinkedHashSet<>(list); // retain the original relative order of the elements
    list.clear();
    list.addAll(set);
  }
}
