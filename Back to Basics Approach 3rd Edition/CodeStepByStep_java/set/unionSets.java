package CodeStepByStep.java.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/unionSets
 *
 * @author Alex Golub
 * @since 01-May-21, 12:40 PM
 */
class unionSets {
  public static void main(String[] args) {
    Set<Set<Integer>> sets = new HashSet<>();
    sets.add(new HashSet<>(Arrays.asList(1, 3)));
    sets.add(new HashSet<>(Arrays.asList(2, 3, 4, 5)));
    sets.add(new HashSet<>(Arrays.asList(3, 5, 6, 7)));
    sets.add(new HashSet<>(Arrays.asList(42)));
  
    System.out.println(unionSets(sets));
  }
  
  public static Set<Integer> unionSets(Set<Set<Integer>> sets) {
    Set<Integer> union = new HashSet<>();
    for (Set<Integer> set : sets) {
      union.addAll(set);
    }
    
    return union;
  }
}
