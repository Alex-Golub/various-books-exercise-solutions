package CodeStepByStep.java.recursion;

import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/matchCount
 *
 * @author Alex Golub
 * @since 06-May-21, 2:36 PM
 */
class matchCount {
  public static void main(String[] args) {
    List<Integer> v1 = List.of(2, 5, 0, 3, 8, 9, 1, 1, 0, 7);
    List<Integer> v2 = List.of(2, 5, 3, 0, 8, 4, 1);
    System.out.println(matchCount(v1, v2));
  }
  
  public static int matchCount(List<Integer> v1, List<Integer> v2) {
    if (v1.size() == 0 || v2.size() == 0) {
      return 0;
    }
    
    return (v1.get(0).equals(v2.get(0)) ? 1 : 0) +
           matchCount(v1.subList(1, v1.size()), v2.subList(1, v2.size()));
  }
}
