package CodeStepByStep_java.arrayList;

import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/countInRange
 *
 * @author Alex Golub
 * @since 23-Apr-21, 8:22 PM
 */
class countInRange {
  public static int countInRange(List<Integer> list, int min, int max) {
    int count = 0;
    for (Integer i : list) {
      if (i >= min && i <= max)
        count++;
    }
    
    return count;
  }
}
