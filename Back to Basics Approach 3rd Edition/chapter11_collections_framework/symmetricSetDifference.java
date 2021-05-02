package chapter11_collections_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Alex Golub
 * @since 30-Apr-21, 9:42 PM
 */
class symmetricSetDifference {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 4, 7, 9));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 5, 6, 7));
    Set<Integer> symmetricSetDifference = symmetricSetDifference(set1, set2);
    System.out.println(symmetricSetDifference);
  }
  
  public static Set<Integer> symmetricSetDifference(Set<Integer> s1, Set<Integer> s2) {
    Set<Integer> union = new HashSet<>(s1);
    union.addAll(s2);
    Set<Integer> intersection = new HashSet<>(s1);
    intersection.retainAll(s2);
    union.removeAll(intersection);
    
    return union;
  }
}
